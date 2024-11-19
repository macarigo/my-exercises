package io.codeforall.fanstatics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Version;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

public class Sandbox {
    public static void main(String[] args) {

        // Use the test persistence unit to configure a new
        // entity manager factory and start up JPA
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        // Open a new database connection by getting a new
        // entity manager from the entity manager factory
        EntityManager em = emf.createEntityManager();

        Cadet cadet = new Cadet();
        cadet.setName("John Doe");
        cadet.setAge(30);
        cadet.setAddress(new Address(123, "Main Street", "New York"));

        Cadet cadet2 = new Cadet();
        cadet2.setName("Jane Doe");
        cadet2.setAge(28);
        cadet2.setAddress(new Address(456, "Main Street", "New York"));

        Cadet cadet3 = new Cadet();
        cadet3.setName("Quim Barreiros");
        cadet3.setAge(53);
        cadet3.setAddress(new Address(789, "Main Street", "New York"));

        em.getTransaction().begin();
        em.persist(cadet);
        em.persist(cadet2);
        em.persist(cadet3);
        em.getTransaction().commit();

        em.getTransaction().begin();
        Cadet tempCadet = em.merge(cadet);
        tempCadet.setAge(31);
        em.getTransaction().commit();
        // Close the database connection
        em.close();

        // Shutdown JPA
        emf.close();
    }
}