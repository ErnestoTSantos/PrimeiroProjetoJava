package pontoAcesso.projeto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Locale {
    @Id
    private long id;

    @ManyToOne
    private LevelAccess levelAccess;
    private String description;
}
