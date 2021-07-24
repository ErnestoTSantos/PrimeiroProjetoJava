package pontoAcesso.projeto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pontoAcesso.projeto.model.WorkJourney;

@Repository
public interface JourneyRepository extends JpaRepository<WorkJourney, Long> {
}
