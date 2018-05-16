package fr.epsi.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "admin")
    public class Admin extends User {

    private String pseudo;
    @OneToMany(mappedBy = "admin", fetch = FetchType.EAGER)
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.DELETE})
    private List<CreditCard> creditCards;

    @Override
    public String getPseudo() {
        return pseudo;
    }

    @Override
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
}
