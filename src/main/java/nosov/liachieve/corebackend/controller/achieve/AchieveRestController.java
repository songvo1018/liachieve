package nosov.liachieve.corebackend.controller.achieve;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import nosov.liachieve.corebackend.entity.Achieve;
import nosov.liachieve.corebackend.dto.achieve.CreateAchieveDTO;
import nosov.liachieve.corebackend.service.AchieveService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Achieve")
@RestController
public class AchieveRestController implements AchieveController {
    private final AchieveService achieveService;
    public AchieveRestController(AchieveService achieveService) {
        this.achieveService = achieveService;
    }

    @Operation(description = "get achieve data by achieve id", responses = {
            @ApiResponse(responseCode = "200",
                    content = {
                            @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = Achieve.class))
                    }),
            @ApiResponse(responseCode = "404")
    })
    @GetMapping(
            value = "/achieve/{a_id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<Achieve> getAchieve(@PathVariable long a_id) {
        Achieve foundedAchieve = achieveService.findById(a_id);
        return ResponseEntity.ok(foundedAchieve);
    }

    @Operation(description = "get achieve data by user id", responses = {
            @ApiResponse(responseCode = "200",
                    content = {
                            @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, array = @ArraySchema( schema = @Schema(implementation = Achieve.class)))
                    }),
            @ApiResponse(responseCode = "404")
    })
    @GetMapping("/achieves/{u_id}")
    @Override
    public ResponseEntity<List<Achieve>> getUserAchieves(@PathVariable long u_id) {
        List<Achieve> foundedAchievesByUserId = achieveService.findByUserId(u_id);
        return ResponseEntity.ok(foundedAchievesByUserId);
    }

    @Operation(description = "create achieve ", responses = {
            @ApiResponse(responseCode = "200",
                    content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = Achieve.class))
                    })
    })
    @PostMapping("/achieve/create")
    @Override
    public ResponseEntity<Achieve> createAchieve(@RequestBody CreateAchieveDTO achieveDTO) {
        Achieve achieve = achieveService.create(achieveDTO);
        return ResponseEntity.ok(achieve);
    }

    @Operation(description = "close achieve by achive id ", responses = {
            @ApiResponse(responseCode = "200",
                    content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = Achieve.class))
                    }),
            @ApiResponse(responseCode = "404")
    })
    @PostMapping("/achieve/close")
    @Override
    public ResponseEntity<Achieve> closeAchieve(@RequestParam long a_id) {
        Achieve closedAchieve = achieveService.close(a_id);
        return ResponseEntity.ok(closedAchieve);
    }
}
