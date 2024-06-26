package styx.com.styx_agenda_nutri.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import styx.com.styx_agenda_nutri.entities.Nutritionist;
import styx.com.styx_agenda_nutri.repositories.NutritionistRepository;

import java.util.Optional;

@Service
public class NutritionistService {

    @Autowired
    private NutritionistRepository nutritionistRepository;

    public Nutritionist findByIdNutritionist(Long id) {
        Optional<Nutritionist> Nutritionist = nutritionistRepository.findById(id);
        return Nutritionist.orElseThrow(() -> new RuntimeException("Erros: Nutricionista: " + id + " não localizado !"));
    }

    @Transactional
    public Nutritionist insertNutritionist(Nutritionist obj){
        obj.setIdNutritionist(null);
        obj = this.nutritionistRepository.save(obj);

        return obj;
    }

    @Transactional
    public Nutritionist updateNutritionist(Nutritionist obj){
        Nutritionist objAux = findByIdNutritionist(obj.getIdNutritionist());
        objAux.setName(obj.getName());
        objAux.setCpf(obj.getCpf());
        objAux.setExcluded(obj.getExcluded());
        objAux.setGender(obj.getGender());
        objAux.setContactDetails(obj.getContactDetails());

        return this.nutritionistRepository.save(objAux);
    }




}
