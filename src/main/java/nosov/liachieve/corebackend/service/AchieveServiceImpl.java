package nosov.liachieve.corebackend.service;

import nosov.liachieve.corebackend.dto.achieve.CreateAchieveDTO;
import nosov.liachieve.corebackend.dto.achieve.DtoConverter;
import nosov.liachieve.corebackend.entity.Achieve;
import nosov.liachieve.corebackend.entity.User;
import nosov.liachieve.corebackend.repository.AchieveRepository;
import nosov.liachieve.corebackend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class AchieveServiceImpl implements AchieveService {

    private final UserRepository userRepository;
    private final AchieveRepository achieveRepository;

    public AchieveServiceImpl(UserRepository userRepository, AchieveRepository achieveRepository) {
        this.userRepository = userRepository;
        this.achieveRepository = achieveRepository;
    }

    @Override
    public Achieve findById(long aId) {
        Optional<Achieve> achieve = achieveRepository.findById(aId);
        return achieve.orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Achieve> findByUserId(long uId) {
        Optional<User> byId = userRepository.findById(uId);
        return achieveRepository.findAchievesByUser(byId.orElseThrow());
    }

    @Override
    public Achieve create(CreateAchieveDTO achieveDTO) {
        Achieve achieve = DtoConverter.convertFromDTO(achieveDTO);
        achieve.setUser(userRepository.findById(1L).orElseThrow());
        return achieveRepository.save(achieve);
    }

    @Override
    public Achieve close(long aId) {
        return null;
    }
}
