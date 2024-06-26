package styx.com.styx_agenda_nutri.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import styx.com.styx_agenda_nutri.entities.ClientsMetrics;
import styx.com.styx_agenda_nutri.services.ClientsMetricsService;

@RestController
@RequestMapping("/clientsmetricsservice")
@Validated
public class ClientsMetricsController {

    @Autowired
    private ClientsMetricsService clientsMetricsService;

    @GetMapping("/{id}")
    public ResponseEntity<ClientsMetrics> findByIdClientsMetrics(@PathVariable Long id){
        ClientsMetrics obj = this.clientsMetricsService.findByIdClientsMetrics(id);
        return ResponseEntity.ok().body(obj);
    }

}
