package pontoAcesso.projeto.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movement {
    //Forma de resolver chave composta
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovementId implements Serializable{
        private long idMovement;
        private long idUser;
    }

    //O id vai ser composto da classe
    @EmbeddedId
    private MovementId id;

    private LocalDateTime dateEnter;
    private LocalDateTime dateExit;
    private BigDecimal timeCourse;

    @OneToOne
    private Occurrence occurrence;

    @OneToOne
    private Calendar calendar;
}
