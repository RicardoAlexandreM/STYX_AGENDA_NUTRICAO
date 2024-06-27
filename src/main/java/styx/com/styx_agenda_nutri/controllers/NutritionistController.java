package styx.com.styx_agenda_nutri.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import styx.com.styx_agenda_nutri.models.Nutritionist;
import styx.com.styx_agenda_nutri.services.NutritionistService;

@RestController
@RequestMapping("/Nutritionist")
@Validated
public class NutritionistController {

    @Autowired
    private NutritionistService nutritionistService;

    @GetMapping("/{id}")
    public ResponseEntity<Nutritionist> findByIdNutritionist(@PathVariable Long id){
        Nutritionist obj = this.nutritionistService.findByIdNutritionist(id);
        return ResponseEntity.ok().body(obj);
    }

}

