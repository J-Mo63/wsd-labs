package uts.wsd;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;
import java.io.Serializable;


@XmlRootElement(name="users")
@XmlAccessorType(XmlAccessType.FIELD)
public class Users implements Serializable {

    @XmlElement(name="user")
    private ArrayList<User> list = new ArrayList<User>();

    public ArrayList<User> getList() {
        return list;
    }
    public boolean userExists(String email) {
        for (User user : list) {
            if (user.getEmail().equals(email))
                return true;
        }
        return false;
    }
    
    public User getUser(String email) {
        for (User user : list) {
            if (user.getEmail().equals(email))
                return user;
        }
        return null;
    }
    public void addUser(User user) {
        list.add(user);
    }
    public void removeUser(User user) {
        list.remove(user);
    }
    public User login(String email, String password) {
        // For each user in the list...
        for (User user : list) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password))
                return user; // Login correct. Return this user.
        }
        return null; // Login incorrect. Return null.
    }
}