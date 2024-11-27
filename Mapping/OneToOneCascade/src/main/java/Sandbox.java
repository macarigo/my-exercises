import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;

public class Sandbox {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("fanstatics");
        EntityManager em = emf.createEntityManager();

        Owner owner = new Owner();
        owner.setName("Fernando Alonso");
        Owner owner1 = new Owner();
        owner1.setName("Max Verstappen");
        Owner owner2 = new Owner();
        owner2.setName("Oscar Piastri");
        Owner owner3 = new Owner();
        owner3.setName("Charles Leclerc");
        Owner owner4 = new Owner();
        owner4.setName("Lewis Hamilton");

        Car car = new Car();
        car.setMake("Ferrari");
        car.setModel("488 Pista");
        car.setOwner(owner3);

        Car car1 = new Car();
        car1.setMake("Lamborghini");
        car1.setModel("Huracan STO");
        car1.setOwner(owner1);

        Car car2 = new Car();
        car2.setMake("McLaren");
        car2.setModel("765LT");
        car2.setOwner(owner2);

        Car car3 = new Car();
        car3.setMake("Porsche");
        car3.setModel("911 GT3 RS");
        car3.setOwner(owner4);

        Car car4 = new Car();
        car4.setMake("Aston Martin");
        car4.setModel("DB11");
        car4.setOwner(owner);

        em.getTransaction().begin();
        em.persist(car);
        em.persist(car1);
        em.persist(car2);
        em.persist(car3);
        em.persist(car4);
        em.persist(owner);
        em.persist(owner1);
        em.persist(owner2);
        em.persist(owner3);
        em.persist(owner4);
        em.getTransaction().commit();

        em.getTransaction().begin();
        em.remove(owner4);
        em.find(Owner.class, 2);
        em.merge(owner);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
