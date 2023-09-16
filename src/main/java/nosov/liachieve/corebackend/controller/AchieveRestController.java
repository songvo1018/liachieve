package nosov.liachieve.corebackend.controller;

import nosov.liachieve.corebackend.entity.Achieve;
import nosov.liachieve.corebackend.dto.CreateAchieveDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AchieveRestController implements AchieveController {
    @GetMapping("/achive/{a_id}")
    @Override
    public Achieve getAchieve(@PathVariable long a_id) {
        return null;
    }

    @GetMapping("/achieve/{u_id}")
    @Override
    public List<Achieve> getUserAchieves(@PathVariable long u_id) {
        return null;
    }

    @PostMapping("/achieve/create")
    @Override
    public Achieve createAchieve(@RequestBody CreateAchieveDTO achieveDTO) {
        return null;
    }

    @PostMapping("/achieve/close")
    @Override
    public Achieve closeAchieve(@RequestParam long a_id) {
        return null;
    }
}
