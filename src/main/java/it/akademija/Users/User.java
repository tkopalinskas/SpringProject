package it.akademija.Users;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;


@Entity
public class User{
    @Column
    private String username;
    @Column
    private String fristName;
    @Column
    private String lastName;
    @Column
    private String email;
    private static AtomicInteger count = new AtomicInteger(0);
    @Column
    private int ID;

    public User(){}
    public User(String username, String firstName, String lastName, String email){
        this.username = username;
        this.fristName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.ID = count.incrementAndGet();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public String getFristName() {
        return fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getID(){
        return ID;
    }
}
