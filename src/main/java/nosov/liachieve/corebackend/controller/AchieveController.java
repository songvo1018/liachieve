package nosov.liachieve.corebackend.controller;

import nosov.liachieve.corebackend.entity.Achieve;
import nosov.liachieve.corebackend.dto.CreateAchieveDTO;

import java.util.List;

public interface AchieveController {
    Achieve getAchieve(long a_id);
    List<Achieve> getUserAchieves(long u_id);
    Achieve createAchieve(CreateAchieveDTO achieveDTO);
    Achieve closeAchieve(long a_id);
}
