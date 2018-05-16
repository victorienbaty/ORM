package fr.epsi.dao;

import com.sun.xml.internal.bind.v2.model.core.ID;
import fr.epsi.model.Channel;
import fr.epsi.model.Channel;
import fr.epsi.model.Message;
import fr.epsi.model.User;
import org.junit.Test;

import java.util.Calendar;
import java.sql.Date;

public class UserDaoTest {

    @Test
    public void insertUser() {
        User user = new User();
        user.setPseudo("UserTest");
        user.setEmail("User47.test@test.fr");
        user.setPassword("thatsatest");
        System.out.println(new UserDao().save(user));
    }

    @Test
    public void getUser() {
        User u = new UserDao().get(21);
        //System.out.println(u.getFirstname());
        System.out.println(u.getPseudo());
        System.out.println(u.getEmail());
    }

    @Test
    public void insertChannel(){
        Channel channel=new Channel();
        channel.setChannelName("privateTest1");
        channel.setLockType("private");
        System.out.println(new ChannelDao().save(channel));
        //channel.setChannelName("publicTest2");
        //channel.setLockType("public");
        //channel.setChannelName("directTest1");
        //channel.setLockType("direct");
    }


    @Test

    public void getChannel(){
        Channel c=new ChannelDao().get(22);
        System.out.println(c.getChannelName());
        System.out.println(c.getLockType());

    }

    @Test
    public void insertMessage(){
        Message message=new Message();
        message.setText("Ceci est le premier message de la conversation");
        message.setPoints(0);
    }

    @Test
    public void getMessage(){
        Message m=new MessageDao().get(1);
        System.out.println(m.getText());
        System.out.println(m.getPoints());
    }
/*
    @Test
    public void getTweet(){
        Tweet tweet=new Tweet();
        System.out.println(tweet.getText());
    }*/
}