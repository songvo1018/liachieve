package nosov.liachieve.corebackend.service;

import nosov.liachieve.corebackend.dto.achieve.CreateAchieveDTO;
import nosov.liachieve.corebackend.entity.Achieve;

import java.util.List;

public interface AchieveService {
    Achieve findById(long aId);

    List<Achieve> findByUserId(long uId);

    Achieve create(CreateAchieveDTO achieveDTO);

    Achieve close(long aId);
}
