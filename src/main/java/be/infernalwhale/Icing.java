package be.infernalwhale;

import javax.persistence.*;

@Entity
// Relationship is One To One (1-1) with Cake
// 1-1       : pk en fk (de fk MAG gekozen worden aan een of beide kanten)
// 1-many    : pk en fk (de fk MOET aan de many kant opgeslagen worden)
// many-many : intermediate table (1-m EN m-1)

// bidirectional
// unidirectional

public class Icing {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToOne(mappedBy = "icingOnTheCake")
    private Cake cake;

    public int getId() {
        return id;
    }

    public Icing setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Icing setName(String name) {
        this.name = name;
        return this;
    }

    public Cake getCake() {
        return cake;
    }

    public Icing setCake(Cake cake) {
        this.cake = cake;

        return this;
    }

    @Override
    public String toString() {
        return "Icing{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
