package styx.com.styx_agenda_nutri.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import styx.com.styx_agenda_nutri.models.ContactDetails;
import styx.com.styx_agenda_nutri.services.ContactDetailsService;

@RestController
@RequestMapping("/contactdetails")
public class ContactDetailsController {

    @Autowired
    private ContactDetailsService contactDetailsService;

    @GetMapping("/{id}")
    public ResponseEntity<ContactDetails> findByIdContactDetails(@PathVariable Long id){
        ContactDetails obj = this.contactDetailsService.findByIdContactDetails(id);
        return ResponseEntity.ok().body(obj);
    }


}
