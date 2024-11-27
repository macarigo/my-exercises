package io.codeforall.fanstatics;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;

@MappedSuperclass
public abstract class AbstractDriver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
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
}
