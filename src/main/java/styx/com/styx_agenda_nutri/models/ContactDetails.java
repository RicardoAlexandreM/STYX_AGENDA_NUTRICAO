package styx.com.styx_agenda_nutri.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "ContactDetails")
public class ContactDetails {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "idContactDetails", unique = true, nullable = false)
     private Long idContactDetails;

     @Column(name = "type", nullable = false, length = 50)
     private String type;

     @Column(name = "contact", nullable = false, length = 255)
     private String contact;

     @Column(name = "additional", length = 255)
     private String additional;

     public ContactDetails() {

     }

    public ContactDetails(Long idContactDetails, String type, String contact, String additional) {
        this.idContactDetails = idContactDetails;
        this.type = type;
        this.contact = contact;
        this.additional = additional;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactDetails that = (ContactDetails) o;
        return Objects.equals(idContactDetails, that.idContactDetails) && Objects.equals(type, that.type) && Objects.equals(contact, that.contact) && Objects.equals(additional, that.additional);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idContactDetails, type, contact, additional);
    }
}
