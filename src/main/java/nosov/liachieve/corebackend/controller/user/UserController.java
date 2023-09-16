package nosov.liachieve.corebackend.controller.user;

import nosov.liachieve.corebackend.dto.user.UserDTO;
import nosov.liachieve.corebackend.dto.user.UserStatsDTO;

public interface UserController {
    UserDTO getUser(long id);
    UserStatsDTO getUserStats(long id);
}
