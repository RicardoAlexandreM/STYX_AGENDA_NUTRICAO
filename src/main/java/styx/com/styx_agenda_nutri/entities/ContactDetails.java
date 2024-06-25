package styx.com.styx_agenda_nutri.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ContactDetails")
public class ContactDetails {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "idContactDetails")
     private Long idContactDetails;

     @Column(name = "type")
     private String type;

     @Column(name = "contact")
     private String contact;

     @Column(name = "additional")
     private String additional;

     public ContactDetails() {

     }

    public Long getIdContactDetails() {
        return idContactDetails;
    }

    public void setIdContactDetails(Long idContactDetails) {
        this.idContactDetails = idContactDetails;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }
}
