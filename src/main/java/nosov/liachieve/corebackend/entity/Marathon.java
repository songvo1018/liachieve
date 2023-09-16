package nosov.liachieve.corebackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="marathon")
@Getter
@Setter
public class Marathon {
    @Id
    private Long m_id;
    private String description;
    private String title;
    private Integer weight;
    private Integer bonus_weight;
    private Date start_date;
    private Date end_date;
    private String picture;
}
