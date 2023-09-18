package nosov.liachieve.corebackend.entity;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Table(name="users")
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long u_id;
    @Schema(type = "string", description = "user name")
    private String name;
    private Date start_date;
    @Schema(type = "string", description = "url (?) to picture")
    private String picture;
    @Schema(type = "integer", description = "user level, can be setted by user")
    private Integer level;
    @Schema(type = "integer", description = "total points for all time")
    private Integer total_score;
    @Schema(type = "integer", description = "total points for today")
    private Integer today_score;
}
