package styx.com.styx_agenda_nutri.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "NutritionistClients")
public class NutritionistClients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNutritionistClients;
    @JoinColumn(name = "idNutritionist")
    @OneToOne
    private Nutritionist nutritionist;
    @JoinColumn(name = "idClients")
    @OneToOne
    private Clients clients;

    public NutritionistClients() {

    }

    public int getIdNutritionistClients() {
        return idNutritionistClients;
    }

    public void setIdNutritionistClients(int idNutritionistClients) {
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
