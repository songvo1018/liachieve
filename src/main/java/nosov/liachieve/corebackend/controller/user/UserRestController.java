package nosov.liachieve.corebackend.controller.user;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import nosov.liachieve.corebackend.dto.user.CreateUserDTO;
import nosov.liachieve.corebackend.dto.user.DtoConverter;
import nosov.liachieve.corebackend.dto.user.UserDTO;
import nosov.liachieve.corebackend.dto.user.UserStatsDTO;
import nosov.liachieve.corebackend.entity.User;
import nosov.liachieve.corebackend.repository.UserRepository;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController implements UserController {
    private final UserRepository userRepository;

    public UserRestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Operation(description = "get user data by user id", responses = {
            @ApiResponse(responseCode = "200",
                    content = {
                            @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = UserDTO.class))
                    }),
            @ApiResponse(responseCode = "404")
    })
    @GetMapping("/user/{u_id}")
    @Override
    public ResponseEntity<UserDTO> getUser(@PathVariable long u_id) {
        User founded = userRepository.findById(u_id).orElseThrow();
        return ResponseEntity.ok(DtoConverter.convertToDTO(founded));
    }

    @GetMapping("/user/stats/{u_id}")
    @Override
    public ResponseEntity<UserStatsDTO> getUserStats(@PathVariable long u_id) {
        return ResponseEntity.ok(null);
    }

    @Operation(description = "create new user", responses = {
            @ApiResponse(responseCode = "200",
                    content = {
                            @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = User.class)
                            )
                    })
    })
    @PostMapping(value = "/user/create")
    @Override
    public ResponseEntity<User> createUser(@RequestBody CreateUserDTO createUserDTO) {
        User user = DtoConverter.convertFromDTO(createUserDTO);
        user.setTotal_score(0);
        user.setToday_score(0);
        User saved = userRepository.save(user);
        return ResponseEntity.ok(saved);
    }
}
