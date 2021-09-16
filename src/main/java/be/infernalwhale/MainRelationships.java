package be.infernalwhale;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainRelationships {
    public static void main(String[] args) {
        final int ALL_THE_CHOCOLATE = 2000000;

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();

        Icing icing = new Icing();
        icing.setName("Merengue");

        Cake cake = new Cake();
        cake.setFlavour("Strawberry");
        cake.setCalories(200000000);
        cake.setPrice(2);
        cake.setHasChocolate(true);
        cake.setHowMuchChocolate(ALL_THE_CHOCOLATE);
        cake.setWeight(500);

        icing.setCake(cake);
        cake.setIcingOnTheCake(icing);

        Client client = new Client().setName("Yorick");
        cake.setClient(client);

        em.getTransaction().begin();
        em.persist(cake);
        em.persist(icing);
        em.persist(client);
        em.getTransaction().commit();


        EntityManager newEM = emf.createEntityManager();
        Icing icingFromDB = newEM.find(Icing.class, 2);
        System.out.println(icingFromDB);
    }
}
