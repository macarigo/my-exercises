import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sandbox{
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("fanstatics");
        EntityManager em = emf.createEntityManager();


        SecurityGroup admin = new SecurityGroup();
        admin.setName("admin");
        SecurityGroup regular = new SecurityGroup();
        regular.setName("regular");

        User vip = new User();
        vip.setUsername("vip");
        vip.setPassword("vip");
        vip.getsGroups().add(admin);
        vip.getsGroups().add(regular);

        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        user.getsGroups().add(admin);

        User superuser = new User();
        superuser.setUsername("superadmin");
        superuser.setPassword("superadmin");
        superuser.getsGroups().add(admin);

        User pleb = new User();
        pleb.setUsername("pleb");
        pleb.setPassword("");
        pleb.getsGroups().add(regular);

        User pawn = new User();
        pawn.setUsername("pawn");
        pawn.setPassword("");
        pawn.getsGroups().add(regular);


        em.getTransaction().begin();

        em.persist(vip);
        em.persist(user);
        em.persist(superuser);
        em.persist(pleb);
        em.persist(pawn);
        System.out.println("The user I'm looking for is: " + em.find(User.class, 1));

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}