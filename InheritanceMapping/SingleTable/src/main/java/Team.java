import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "F1_Teams")
public class Team extends AbstractDriver {
    private String teamName;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

}
