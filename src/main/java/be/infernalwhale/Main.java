package be.infernalwhale;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
    // 1. Security >> login information is plain text AND publicly available
    // 2. Information is hardcoded >> TC (Tight Coupling)

        // Devs don't need access to the prod database
        // Devs don't WANT access to the prod database
        //    >> if we make a mistake, at least it's not in production
        //    >> if something happens to the production database... IT WASN'T ME!!

        // Developers >> schrijven code...
        // NOT A DEV  >> manages databases (manage access, username, pwd,....)

        // Information stored in META-INF/persistence.xml

        // Manage entities... BUT, what is an entity??
        // Every Entity is an object
        // Not every object is an entity...
        // Only objects derived from a row in a table IS an entity.

        // Table  == Class
        // Column == property
        // Row    == Entity

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();

        Beer beer = em.find(Beer.class, 4);
        System.out.println(beer.toString());

        Beer b2 = em.getReference(Beer.class, 4);


        // Connection
        // SQL string
        // Statement
        // Statement naar db sturen
        // ResultSet
        // ResultSet omzetten naar een beer object
        // Beer object afdrukken
    }
}
