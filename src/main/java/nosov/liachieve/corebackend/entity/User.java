package nosov.liachieve.corebackend.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="user")
@Setter
@Getter
public class User {
    @Id
    private Long u_id;
    private String name;
    private Date start_date;
    private String picture;
    private Integer level;
    private Integer total_score;
    private Integer today_score;
}
