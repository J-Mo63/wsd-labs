package uts.wsd;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class User implements Serializable {

    // Fields
    private String email;
    private String name;
    private String password;
    private String gender;
    private String favouriteColour;

    // Constructors
    public User() {
        super();
    }

    public User(String email, String name, String password, String gender, String favouriteColour) {
        super();
        this.email = email;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.favouriteColour = favouriteColour;
    }


    // Getters & Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFavouriteColour() {
        return favouriteColour;
    }

    public void setFavouriteColour(String favouriteColour) {
        this.favouriteColour = favouriteColour;
    }
}
