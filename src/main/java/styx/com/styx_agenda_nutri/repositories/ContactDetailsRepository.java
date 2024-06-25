package styx.com.styx_agenda_nutri.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import styx.com.styx_agenda_nutri.entities.ContactDetails;

@Repository
public interface ContactDetailsRepository extends JpaRepository<ContactDetails, Long> {

}
