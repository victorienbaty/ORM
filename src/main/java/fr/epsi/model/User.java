package fr.epsi.model;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "user", uniqueConstraints=
@UniqueConstraint(columnNames={"email"}),indexes = {@Index(columnList = "email")})
public class User implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String pseudo;
    private String password;
    private String email;
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Channel> Channels;

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList channels;
}
