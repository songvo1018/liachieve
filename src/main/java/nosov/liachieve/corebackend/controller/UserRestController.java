package nosov.liachieve.corebackend.controller;

import nosov.liachieve.corebackend.dto.UserDTO;
import nosov.liachieve.corebackend.dto.UserStatsDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController implements UserController {

    @GetMapping("/user/{u_id}")
    @Override
    public UserDTO getUser(@PathVariable long u_id) {
        return null;
    }

    @GetMapping("/user/stats/{u_id}")
    @Override
    public UserStatsDTO getUserStats(long u_id) {
        return null;
    }
}
