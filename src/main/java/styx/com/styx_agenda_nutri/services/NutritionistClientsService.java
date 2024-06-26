package styx.com.styx_agenda_nutri.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import styx.com.styx_agenda_nutri.entities.NutritionistClients;
import styx.com.styx_agenda_nutri.repositories.NutritionistClientsRrepository;

import java.util.Optional;

@Service
public class NutritionistClientsService {

    @Autowired
    private NutritionistClientsRrepository nutritionistClientsRrepository;

    public NutritionistClients findByIdNutritionistClients(Long id){
        Optional<NutritionistClients> nutrtionistClient = this.nutritionistClientsRrepository.findById(id);
        return nutrtionistClient.orElseThrow(() -> new RuntimeException("Error: Vinculo: " + id + " não localizado!"));
    }

    @Transactional
    public NutritionistClients insertNutritionistClients(NutritionistClients obj){
        obj.setIdNutritionistClients(null);
        obj = this.nutritionistClientsRrepository.save(obj);

        return obj;
    }

    @Transactional
    public NutritionistClients updateNutritionistClients(NutritionistClients obj){
        NutritionistClients objAux = findByIdNutritionistClients(obj.getIdNutritionistClients());
        objAux.setClients(obj.getClients());
        objAux.setNutritionist(obj.getNutritionist());

        return this.nutritionistClientsRrepository.save(objAux);
    }
}



