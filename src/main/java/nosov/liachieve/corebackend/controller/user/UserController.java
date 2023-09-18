package nosov.liachieve.corebackend.controller.user;

import nosov.liachieve.corebackend.dto.user.CreateUserDTO;
import nosov.liachieve.corebackend.dto.user.UserDTO;
import nosov.liachieve.corebackend.dto.user.UserStatsDTO;
import nosov.liachieve.corebackend.entity.User;
import org.springframework.http.ResponseEntity;

public interface UserController {
    ResponseEntity<UserDTO> getUser(long id);
    ResponseEntity<UserStatsDTO> getUserStats(long id);
    ResponseEntity<User> createUser(CreateUserDTO createUserDTO);
}
