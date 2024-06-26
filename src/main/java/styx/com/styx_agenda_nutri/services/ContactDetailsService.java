package styx.com.styx_agenda_nutri.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import styx.com.styx_agenda_nutri.entities.ContactDetails;
import styx.com.styx_agenda_nutri.repositories.ContactDetailsRepository;

import java.util.Optional;

@Service
public class ContactDetailsService {

    @Autowired
    private ContactDetailsRepository contactDetailsRepository;

    public ContactDetails findByIdContactDetails(Long id){
        Optional<ContactDetails> ContactDetail = this.contactDetailsRepository.findById(id);

        return ContactDetail.orElseThrow(() -> new RuntimeException("Error: Detalhe do Contato: " + id + " não localizado !"));
    }

    public ContactDetails insertContactDetails(ContactDetails obj){
        obj.setIdContactDetails(null);
        obj = this.contactDetailsRepository.save(obj);

        return obj;
    }

    public ContactDetails updateContactDetails(ContactDetails obj){
        ContactDetails objAux = findByIdContactDetails(obj.getIdContactDetails());
        objAux.setContact(obj.getContact());
        objAux.setType(obj.getType());
        objAux.setAdditional(obj.getAdditional());

        return this.contactDetailsRepository.save(objAux);
    }

}
