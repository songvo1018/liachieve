package nosov.liachieve.corebackend.repository;

import nosov.liachieve.corebackend.entity.Achieve;
import nosov.liachieve.corebackend.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AchieveRepository extends CrudRepository<Achieve, Long> {
    List<Achieve> findAchievesByUser(User user);
}
