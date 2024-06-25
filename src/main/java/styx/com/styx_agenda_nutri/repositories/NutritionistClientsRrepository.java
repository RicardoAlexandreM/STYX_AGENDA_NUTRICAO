package styx.com.styx_agenda_nutri.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import styx.com.styx_agenda_nutri.entities.NutritionistClients;

@Repository
public interface NutritionistClientsRrepository extends JpaRepository<NutritionistClients, Long> {

}
