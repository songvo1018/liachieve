package nosov.liachieve.corebackend.dto.user;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserDTO {
    private String name;
    private Date start_date;
    private String picture;
    private Integer level;
    private Integer total_score;
    private Integer today_score;
}
