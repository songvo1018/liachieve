package nosov.liachieve.corebackend.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserDTO {
    private String name;
    private String picture;
    private Integer level;
}
