import javax.persistence.*;

@Entity
@Table(name="owner")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToOne(mappedBy = "owner",
    cascade = {CascadeType.ALL},
    orphanRemoval = true)

    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
