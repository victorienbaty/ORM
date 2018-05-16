package fr.epsi.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "channel",uniqueConstraints =
@UniqueConstraint(columnNames={"ChannelName"}))

public class Channel {
    @Id
    @GeneratedValue
    private long ID;
    private String ChannelName;
    private String LockType;
    @OneToMany(mappedBy = "channel", fetch = FetchType.EAGER)
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.DELETE})
    private List<Message> messages;
    @ManyToMany(mappedBy = "channel", fetch = FetchType.LAZY)
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.DELETE})
    private List<User> users;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getChannelName() {
        return ChannelName;
    }

    public void setChannelName(String channelName) {
        ChannelName = channelName;
    }

    public String getLockType() {
        return LockType;
    }

    public void setLockType(String lockType) {
        LockType = lockType;
    }

    /*
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    //private List<String> messages;
    //@ManyToOne(fetch = FetchType.EAGER)
    //private User user;
*/

}
