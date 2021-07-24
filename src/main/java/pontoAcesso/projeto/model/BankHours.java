package pontoAcesso.projeto.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class BankHours {

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BankHoursId implements Serializable {
        private long idBankHours;
        private long idMovement;
        private long idUser;
    }
    @EmbeddedId
    private BankHoursId id;
    private LocalDateTime dateWorked;
    private BigDecimal quantityHours;
    private BigDecimal balanceHours;

}
