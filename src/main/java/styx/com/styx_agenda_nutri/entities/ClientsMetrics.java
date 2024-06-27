package styx.com.styx_agenda_nutri.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ClientsMetrics")
public class ClientsMetrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClientsMetrics", unique = true, nullable = false)
    private Long idClientsMetrics;

    @JoinColumn(name = "idClients")
    @ManyToOne
    private Clients clients;

    @Column(name = "weight", nullable = false, precision = 2)
    private double weight;

    @Column(name = "weightUnit", nullable = false)
    private String weightUnit;

    @Column(name = "height", nullable = false, precision = 2)
    private double height;

    @Column(name = "heightUnit", nullable = false)
    private String heightUnit;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "calories", nullable = false, precision = 2)
    private double calories;

    @Column(name = "protein", nullable = false, precision = 2)
    private double protein;

    @Column(name = "carbohydrate", nullable = false, precision = 2)
    private double carbohydrate;

    @Column(name = "fat", nullable = false, precision = 2)
    private double fat;

    public ClientsMetrics() {

    }

    public Long getIdClientsMetrics() {
        return idClientsMetrics;
    }

    public void setIdClientsMetrics(Long idClientsMetrics) {
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
