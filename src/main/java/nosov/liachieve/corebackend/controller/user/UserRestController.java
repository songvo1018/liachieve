package nosov.liachieve.corebackend.controller.user;

import nosov.liachieve.corebackend.dto.user.UserDTO;
import nosov.liachieve.corebackend.dto.user.UserStatsDTO;
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
