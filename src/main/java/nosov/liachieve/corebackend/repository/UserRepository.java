package nosov.liachieve.corebackend.repository;

import nosov.liachieve.corebackend.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
