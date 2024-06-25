package styx.com.styx_agenda_nutri.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Clients")
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClients")
    private Long idClients;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf")
    private String cpf;

    @JoinColumn(name = "idContactDetails")
    @OneToOne
    private ContactDetails contactDetails;

    @Column(name = "dateOfRecord")
    private Date dateOfRecord;

    @Column(name = "dateOfBirth")
    private Date dateOfBirth;

    @Column(name = "situation")
    private String situation;

    public Clients(){

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
}
