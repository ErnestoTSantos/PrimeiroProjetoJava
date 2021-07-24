package pontoAcesso.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pontoAcesso.projeto.Service.ServiceJourney;
import pontoAcesso.projeto.model.WorkJourney;

import java.util.List;

@RestController
@RequestMapping("/journey")
public class WorkJourneyController {
    @Autowired
    ServiceJourney serviceJourney;

    @PostMapping
    public WorkJourney createJourney(@RequestBody WorkJourney workJourney){
        return serviceJourney.saveJourney(workJourney);
    }

    @GetMapping
    public List<WorkJourney> getJourneyList(){
        return serviceJourney.findAll();
    }

    @GetMapping("/{idJourney")
    public ResponseEntity<WorkJourney> getJourneyById(@PathVariable("idJourney") Long idJourney) throws Exception{
        return ResponseEntity.ok(serviceJourney.getById(idJourney).orElseThrow(() -> new Exception("Journey not found")));
    }

    @PutMapping
    public WorkJourney updateWorkJourney(@RequestBody WorkJourney workJourney){
        return serviceJourney.updateJourney(workJourney);
    }

    @DeleteMapping("/{idJourney}")
    public ResponseEntity<WorkJourney> deleteWorkJourney(@PathVariable("idJourney") Long idJourney) throws Exception{
        try {
            serviceJourney.deleteJourney(idJourney);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return(ResponseEntity<WorkJourney>) ResponseEntity.ok();
    }

}
