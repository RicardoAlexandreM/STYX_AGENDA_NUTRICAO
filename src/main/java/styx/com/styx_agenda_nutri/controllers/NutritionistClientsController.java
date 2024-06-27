package styx.com.styx_agenda_nutri.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import styx.com.styx_agenda_nutri.models.NutritionistClients;
import styx.com.styx_agenda_nutri.services.NutritionistClientsService;

@RestController
@RequestMapping("/nutritionistclients")
public class NutritionistClientsController {

    @Autowired
    private NutritionistClientsService nutritionistClientsService;

    @GetMapping("/{id}")
    public ResponseEntity<NutritionistClients> findByIdNutritionistClients(@PathVariable Long id) {
        NutritionistClients obj = this.nutritionistClientsService.findByIdNutritionistClients(id);
        return ResponseEntity.ok().body(obj);
    }

}
