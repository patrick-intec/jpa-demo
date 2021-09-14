package be.infernalwhale;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cakes")
public class Cake {
    // Natural key vs Surrogate key
    // Simple (single-column) key vs Composite key
    // Primary key vs Foreign Key
    @Id
    @GeneratedValue
    private Integer idCake;

    private String flavour;
    private boolean hasChocolate;
    private double price;
    private int weight;
    private int calories;
    private int howMuchChocolate;

    // 0. Entity must have an @Id (Primary key)
    // 1. Always have a no-arg constructor (public or protected)
    // 2. Create all getters & setters (public or protected)

    public Integer getIdCake() {
        return idCake;
    }

    public Cake setIdCake(Integer idCake) {
        this.idCake = idCake;
        return this;
    }

    public String getFlavour() {
        return flavour;
    }

    public Cake setFlavour(String flavour) {
        this.flavour = flavour;
        return this;
    }

    public boolean isHasChocolate() {
        return hasChocolate;
    }

    public Cake setHasChocolate(boolean hasChocolate) {
        this.hasChocolate = hasChocolate;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Cake setPrice(double price) {
        this.price = price;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Cake setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public int getCalories() {
        return calories;
    }

    public Cake setCalories(int calories) {
        this.calories = calories;
        return this;
    }

    public int getHowMuchChocolate() {
        return howMuchChocolate;
    }

    public Cake setHowMuchChocolate(int howMuchChocolate) {
        this.howMuchChocolate = howMuchChocolate;
        return this;
    }
}
