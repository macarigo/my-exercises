import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sgroup")
public class SecurityGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @ManyToMany(mappedBy = "sgroups", fetch = FetchType.LAZY)

    private List<User> users;

    public SecurityGroup() {
        this.users = new ArrayList<>();
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
