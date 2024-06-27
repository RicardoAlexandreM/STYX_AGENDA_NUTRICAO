package styx.com.styx_agenda_nutri.entities;

import jakarta.persistence.*;

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
}
