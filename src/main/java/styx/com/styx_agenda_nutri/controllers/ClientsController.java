package styx.com.styx_agenda_nutri.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import styx.com.styx_agenda_nutri.models.Clients;
import styx.com.styx_agenda_nutri.services.ClientsService;

@RestController
@RequestMapping("/client")
@Validated
public class ClientsController {

    @Autowired
    private ClientsService clientsService;

    @GetMapping("/{id}")
    public ResponseEntity<Clients> findByIdClients(@PathVariable Long id){
        Clients obj = this.clientsService.findByIdClients(id);
        return ResponseEntity.ok().body(obj);
    }

}
