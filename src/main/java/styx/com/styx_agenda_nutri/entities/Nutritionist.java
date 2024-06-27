package styx.com.styx_agenda_nutri.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Nutritionist")
public class Nutritionist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNutritionist", unique = true, nullable = false)
    private Long idNutritionist;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "cpf", nullable = false, length = 20)
    private String cpf;

    @Column(name = "gender", length = 10)
    private String gender;

    @Column(name = "excluded", length = 1)// S - Sim or N - Não
    private String excluded;

    @JoinColumn(name = "idContactDetails")
    @OneToOne
    private ContactDetails contactDetails;

    public Nutritionist(){

    }

    public Nutritionist(Long idNutritionist, String name, String cpf, String gender, String excluded, ContactDetails contactDetails) {
        this.idNutritionist = idNutritionist;
        this.name = name;
        this.cpf = cpf;
        this.gender = gender;
        this.excluded = excluded;
        this.contactDetails = contactDetails;
    }

    public Long getIdNutritionist() {
        return idNutritionist;
    }

    public void setIdNutritionist(Long idNutritionist) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nutritionist that = (Nutritionist) o;
        return Objects.equals(idNutritionist, that.idNutritionist) &&
               Objects.equals(name, that.name) &&
               Objects.equals(cpf, that.cpf) &&
               Objects.equals(gender, that.gender) &&
               Objects.equals(excluded, that.excluded) &&
               Objects.equals(contactDetails, that.contactDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNutritionist, name, cpf, gender, excluded, contactDetails);
    }
}
