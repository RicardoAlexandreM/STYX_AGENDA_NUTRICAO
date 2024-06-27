package styx.com.styx_agenda_nutri.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "NutritionistClients")
public class NutritionistClients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNutritionistClients", unique = true, nullable = false)
    private Long idNutritionistClients;

    @JoinColumn(name = "idNutritionist", nullable = false)
    @OneToOne
    private Nutritionist nutritionist;

    @JoinColumn(name = "idClients", nullable = false)
    @OneToOne
    private Clients clients;

    public NutritionistClients() {

    }

    public NutritionistClients(Long idNutritionistClients, Nutritionist nutritionist, Clients clients) {
        this.idNutritionistClients = idNutritionistClients;
        this.nutritionist = nutritionist;
        this.clients = clients;
    }

    public Long getIdNutritionistClients() {
        return idNutritionistClients;
    }

    public void setIdNutritionistClients(Long idNutritionistClients) {
        this.idNutritionistClients = idNutritionistClients;
    }

    public Nutritionist getNutritionist() {
        return nutritionist;
    }

    public void setNutritionist(Nutritionist nutritionist) {
        this.nutritionist = nutritionist;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NutritionistClients that = (NutritionistClients) o;
        return Objects.equals(idNutritionistClients, that.idNutritionistClients) && Objects.equals(nutritionist, that.nutritionist) && Objects.equals(clients, that.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNutritionistClients, nutritionist, clients);
    }
}
