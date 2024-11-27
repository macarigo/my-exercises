import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)

    private List<SecurityGroup> sgroups;

    public User() {
        this.sgroups = new ArrayList<>();
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<SecurityGroup> getsGroups() {
        return sgroups;
    }

    public void setsGroups(List<SecurityGroup> sGroups) {
        this.sgroups = sGroups;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sgroups=" + sgroups +
                '}';
    }
}
