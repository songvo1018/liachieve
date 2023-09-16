package nosov.liachieve.corebackend.entity;

import io.swagger.v3.oas.annotations.media.Schema;
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
    @Schema(type = "string", description = "description of marathon, details and any info")
    private String description;
    @Schema(type = "string", description = "title of marathon, some graceful title")
    private String title;
    @Schema(type = "integer", description = "weight or coast of join that marathon")
    private Integer weight;
    @Schema(type = "integer", description = "bonus weight of successful close that marathon")
    private Integer bonus_weight;
    @Schema(type = "date", description = "date of start that marathon")
    private Date start_date;
    @Schema(type = "date", description = "date of end that marathon")
    private Date end_date;
    @Schema(type = "string", description = "url (?) to picture")
    private String picture;
}
