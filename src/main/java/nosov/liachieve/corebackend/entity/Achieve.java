package nosov.liachieve.corebackend.entity;

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
    private String target;
    private Integer weight;
    private String description;
    private Boolean is_extra_vital;
}
