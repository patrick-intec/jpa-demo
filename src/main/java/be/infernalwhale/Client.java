package be.infernalwhale;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToMany(mappedBy = "client")
    private List<Cake> cakes;

    public int getId() {
        return id;
    }

    public Client setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Client setName(String name) {
        this.name = name;
        return this;
    }

    public List<Cake> getCakes() {
        return cakes;
    }

    public void addCake(Cake cake) {
        if (this.cakes == null) cakes = new ArrayList<>();
        this.cakes.add(cake);
    }
}
