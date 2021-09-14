package be.infernalwhale;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainCustomModel {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");

        emf.close();
    }
}
