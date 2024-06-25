package styx.com.styx_agenda_nutri.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ClientsMetrics")
public class ClientsMetrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClientsMetrics;
    @JoinColumn(name = "idClients")
    @ManyToOne
    private Clients clients;
    private double Weight;
    private String WeightUnit;
    private double Height;
    private String HeightUnit;
    private int Age;

    public ClientsMetrics() {

    }

    public int getIdClientsMetrics() {
        return idClientsMetrics;
    }

    public void setIdClientsMetrics(int idClientsMetrics) {
        this.idClientsMetrics = idClientsMetrics;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public String getWeightUnit() {
        return WeightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        WeightUnit = weightUnit;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public String getHeightUnit() {
        return HeightUnit;
    }

    public void setHeightUnit(String heightUnit) {
        HeightUnit = heightUnit;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
