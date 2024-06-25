package styx.com.styx_agenda_nutri.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ContactDetails")
public class ContactDetails {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int idContactDetails;
     private String type;
     private String contact;
     private String additional;

     public ContactDetails() {

     }

    public int getIdContactDetails() {
        return idContactDetails;
    }

    public void setIdContactDetails(int idContactDetails) {
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
