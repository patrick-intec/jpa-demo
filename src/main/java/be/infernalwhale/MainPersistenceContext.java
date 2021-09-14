package be.infernalwhale;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainPersistenceContext {
    public static void main(String[] args) {
        // Persistence Context...
        // WTF is the persistence context....

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();

//        Beer b1 = em.find(Beer.class, 7);
//        Beer b2 = em.find(Beer.class, 7);
//
//        System.out.println(b1.toString());
//        System.out.println(b2.toString());

        // Will only retrieve (SELECT) the data 1 time!
        // >> Internal Collection<Object> >> Persistence Context

        // Why? Next step is saving NEW shit to the database...
        Beer newBeer = new Beer();
        newBeer.setId(6);
        newBeer.setName("Duff Beer");
        newBeer.setAlcohol(25);
        newBeer.setPrice(2.0f);

        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(newBeer);
        et.commit();

        // Updating existing data
        Beer fromDB = em.find(Beer.class, 20);
        fromDB.setPrice(3.0f);

//        EntityTransaction et = em.getTransaction();
        et.begin();
        et.commit();

        Beer anotherBeer = em.find(Beer.class, 21);
        anotherBeer.setPrice(4.0f);
        et.begin();
        et.commit();

        // Deleting records

        Beer toDelete = em.find(Beer.class, 6);
        em.remove(toDelete);

        em.getTransaction().begin();
        em.getTransaction().commit();

    }
}
