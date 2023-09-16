package nosov.liachieve.corebackend.controller;

import nosov.liachieve.corebackend.dto.UserDTO;
import nosov.liachieve.corebackend.dto.UserStatsDTO;

public interface UserController {
    UserDTO getUser(long id);
    UserStatsDTO getUserStats(long id);
}
