package be.infernalwhale;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beers")
public class Beer {
    @Id
    private int id;  // Col: id
    private String name;  // col: name
    private int brewerId;
    private int categoryId;
    private float price;
    private int stock;
    private float alcohol;
    private int version;

    public int getId() {
        return id;
    }

    public Beer setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Beer setName(String name) {
        this.name = name;
        return this;
    }

    public int getBrewerId() {
        return brewerId;
    }

    public Beer setBrewerId(int brewerId) {
        this.brewerId = brewerId;
        return this;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public Beer setCategoryId(int categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public Beer setPrice(float price) {
        this.price = price;
        return this;
    }

    public int getStock() {
        return stock;
    }

    public Beer setStock(int stock) {
        this.stock = stock;
        return this;
    }

    public float getAlcohol() {
        return alcohol;
    }

    public Beer setAlcohol(float alcohol) {
        this.alcohol = alcohol;
        return this;
    }

    public int getVersion() {
        return version;
    }

    public Beer setVersion(int version) {
        this.version = version;
        return this;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brewerId=" + brewerId +
                ", categoryId=" + categoryId +
                ", price=" + price +
                ", stock=" + stock +
                ", alcohol=" + alcohol +
                ", version=" + version +
                '}';
    }
}
