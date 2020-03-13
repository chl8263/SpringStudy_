package me.ewan.springdata.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Account {

    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    private String password;

    @Temporal(TemporalType.DATE)
    private Date date = new Date();

    @Transient
    private String no;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
