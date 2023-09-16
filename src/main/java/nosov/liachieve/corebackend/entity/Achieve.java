package nosov.liachieve.corebackend.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="achieve")
@Getter
@Setter
public class Achieve {
    @Id
    private Long a_id;
    @Schema(type = "string", description = "target of achieve, some (maybe graceful) text")
    private String target;

    @Schema(type = "integer", description = "weight or coast of successful that achieve")
    private Integer weight;

    @Schema(type = "string", description = "details of achieve, some (maybe helpful or concrete) text")
    private String description;
    @Schema(type = "boolean", description = "mark that achieve as vital, for change global priority")
    private Boolean is_extra_vital;
}
