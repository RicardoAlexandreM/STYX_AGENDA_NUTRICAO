package styx.com.styx_agenda_nutri.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ClientsMetrics")
public class ClientsMetrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClientsMetrics")
    private int idClientsMetrics;

    @JoinColumn(name = "idClients")
    @ManyToOne
    private Clients clients;

    @Column(name = "weight")
    private double weight;

    @Column(name = "weightUnit")
    private String weightUnit;

    @Column(name = "height")
    private double height;

    @Column(name = "heightUnit")
    private String heightUnit;

    @Column(name = "age")
    private int age;

    @Column(name = "calories")
    private double calories;

    @Column(name = "protein")
    private double protein;

    @Column(name = "carbohydrate")
    private double carbohydrate;

    @Column(name = "fat")
    private double fat;

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
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHeightUnit() {
        return heightUnit;
    }

    public void setHeightUnit(String heightUnit) {
        this.heightUnit = heightUnit;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }
}
