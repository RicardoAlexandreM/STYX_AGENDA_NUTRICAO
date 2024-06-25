package styx.com.styx_agenda_nutri.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import styx.com.styx_agenda_nutri.entities.LogData;

@Repository
public interface LogDataRepository extends JpaRepository<LogData, Long> {

}
