package pontoAcesso.projeto.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import pontoAcesso.projeto.Repository.JourneyRepository;
import pontoAcesso.projeto.model.WorkJourney;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceJourney {

    JourneyRepository journeyRepository;

    @Autowired
    public ServiceJourney(JourneyRepository journeyRepository){
        this.journeyRepository = journeyRepository;
    }

    public WorkJourney saveJourney(WorkJourney workJourney){
        return journeyRepository.save(workJourney);
    }

    @GetMapping
    public List<WorkJourney> findAll() {
        return journeyRepository.findAll();
    }


    public Optional<WorkJourney> getById(Long idJourney) {
        return journeyRepository.findById(idJourney);
    }

    public WorkJourney updateJourney(WorkJourney workJourney){
        return journeyRepository.save(workJourney);
    }

    public void deleteJourney(Long idJourney) {
        journeyRepository.deleteById(idJourney);
    }

}
