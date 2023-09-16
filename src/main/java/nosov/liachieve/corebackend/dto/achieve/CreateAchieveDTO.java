package nosov.liachieve.corebackend.dto.achieve;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAchieveDTO {
    private String target;
    private Integer weight;
    private String description;
    private Boolean is_extra_vital;
}
