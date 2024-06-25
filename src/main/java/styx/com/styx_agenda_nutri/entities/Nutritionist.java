package styx.com.styx_agenda_nutri.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Nutritionist")
public class Nutritionist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNutritionist;

    private String name;
    private String cpf;
    private String gender;
    private String excluded;
    @JoinColumn(name = "idContactDetails")
    @OneToOne
    private ContactDetails contactDetails;

    public Nutritionist(){

    }

    public int getIdNutritionist() {
        return idNutritionist;
    }

    public void setIdNutritionist(int idNutritionist) {
        this.idNutritionist = idNutritionist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getExcluded() {
        return excluded;
    }

    public void setExcluded(String excluded) {
        this.excluded = excluded;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }
}
