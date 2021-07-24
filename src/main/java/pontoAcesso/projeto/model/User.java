package pontoAcesso.projeto.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class User {
    @Id
    private Long id;

    @ManyToOne
    private UserCategory userCategory;
    private String name;

    @ManyToOne
    private Company company;

    @ManyToOne
    private LevelAccess levelAccess;

    @ManyToOne
    private WorkJourney workJourney;

    private BigDecimal tolerance;
    private LocalDateTime startJourney;
    private LocalDateTime finishJourney;
}
