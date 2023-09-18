package nosov.liachieve.corebackend.dto.achieve;

import nosov.liachieve.corebackend.entity.Achieve;

public class DtoConverter {
    public static Achieve convertFromDTO(CreateAchieveDTO createAchieveDTO) {
        Achieve achieve = new Achieve();
        achieve.setDescription(createAchieveDTO.getDescription());
        achieve.setTarget(createAchieveDTO.getTarget());
        achieve.setWeight(createAchieveDTO.getWeight());
        achieve.setIs_extra_vital(createAchieveDTO.getIs_extra_vital());
        return achieve;
    }

}
