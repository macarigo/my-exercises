import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sandbox {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("fanstatics");
        EntityManager em = emf.createEntityManager();

        Team team = new Team();
        team.setTeamName("Mercedes");
        team.setTeamID(1);
        Team team1 = new Team();
        team1.setTeamName("Red Bull");
        team.setTeamID(2);
        Team team2 = new Team();
        team2.setTeamName("Ferrari");
        team.setTeamID(3);
        Team team3 = new Team();
        team3.setTeamName("McLaren");
        team.setTeamID(4);

        Driver driver = new Driver();
        driver.setDriverName("Lewis Hamilton");
        driver.setCarNumber(44);
        driver.setTeamID(team.getTeamID());

        Driver driver6 = new Driver();
        driver6.setDriverName("George Russel");
        driver6.setCarNumber(63);
        //driver6.setTeamName(team.getTeamName());

        Driver driver1 = new Driver();
        driver1.setDriverName("Max Verstappen");
        driver1.setCarNumber(1);
        //driver1.setTeamName(team1.getTeamName());

        Driver driver3 = new Driver();
        driver3.setDriverName("Sergio Perez");
        driver3.setCarNumber(11);
        //driver3.setTeamName(team1.getTeamName());

        Driver driver2 = new Driver();
        driver2.setDriverName("Charles Leclerc");
        driver2.setCarNumber(16);
        //driver2.setTeamName(team2.getTeamName());

        Driver driver4 = new Driver();
        driver4.setDriverName("Carlos Sainz Jr");
        driver4.setCarNumber(55);
        //driver4.setTeamName(team2.getTeamName());

        Driver driver5 = new Driver();
        driver5.setDriverName("Lando Norris");
        driver5.setCarNumber(4);
        //driver5.setTeamName(team3.getTeamName());

        Driver driver7 = new Driver();
        driver7.setDriverName("Oscar Piastri");
        driver7.setCarNumber(81);
        //driver7.setTeamName(team3.getTeamName());

        em.getTransaction().begin();
        em.persist(team);
        em.persist(team1);
        em.persist(team2);
        em.persist(team3);
        em.persist(driver);
        em.persist(driver1);
        em.persist(driver2);
        em.persist(driver3);
        em.persist(driver4);
        em.persist(driver5);
        em.persist(driver6);
        em.persist(driver7);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
