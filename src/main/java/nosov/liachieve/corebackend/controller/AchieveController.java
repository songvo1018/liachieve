package nosov.liachieve.corebackend.controller;

import nosov.liachieve.corebackend.entity.Achieve;
import nosov.liachieve.corebackend.dto.CreateAchieveDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AchieveController {
    ResponseEntity<Achieve> getAchieve(long a_id);
    ResponseEntity<List<Achieve>> getUserAchieves(long u_id);
    ResponseEntity<Achieve> createAchieve(CreateAchieveDTO achieveDTO);
    ResponseEntity<Achieve> closeAchieve(long a_id);
}
