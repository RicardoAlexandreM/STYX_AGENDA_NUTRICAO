package styx.com.styx_agenda_nutri.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Clients")
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClients", unique = true, nullable = false)
    private Long idClients;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "cpf", nullable = false, length = 20)
    private String cpf;

    @JoinColumn(name = "idContactDetails", nullable = false)
    @OneToOne
    private ContactDetails contactDetails;

    @Column(name = "dateOfRecord")
    private Date dateOfRecord;

    @Column(name = "dateOfBirth", nullable = false)
    private Date dateOfBirth;

    @Column(name = "situation", nullable = false)
    private String situation;

    public Clients(){

    }

    public Clients(Long idClients, String nome, String cpf, ContactDetails contactDetails, Date dateOfRecord, Date dateOfBirth, String situation) {
        this.idClients = idClients;
        this.nome = nome;
        this.cpf = cpf;
        this.contactDetails = contactDetails;
        this.dateOfRecord = dateOfRecord;
        this.dateOfBirth = dateOfBirth;
        this.situation = situation;
    }

    public Long getIdClients() {
        return idClients;
    }

    public void setIdClients(Long idClients) {
        this.idClients = idClients;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Date getDateOfRecord() {
        return dateOfRecord;
    }

    public void setDateOfRecord(Date dateOfRecord) {
        this.dateOfRecord = dateOfRecord;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clients clients = (Clients) o;
        return Objects.equals(idClients, clients.idClients) && Objects.equals(nome, clients.nome) && Objects.equals(cpf, clients.cpf) && Objects.equals(contactDetails, clients.contactDetails) && Objects.equals(dateOfRecord, clients.dateOfRecord) && Objects.equals(dateOfBirth, clients.dateOfBirth) && Objects.equals(situation, clients.situation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClients, nome, cpf, contactDetails, dateOfRecord, dateOfBirth, situation);
    }
}
