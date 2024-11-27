import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractDriver {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private Integer teamID;
    @Version
    private Integer version;
    @CreationTimestamp
    private Date creationTime;
    @UpdateTimestamp
    private Date UpdateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeamID() {
        return teamID;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }
}
