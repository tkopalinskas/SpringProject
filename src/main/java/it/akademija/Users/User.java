package it.akademija.Users;

public class User {
    private String username;
    private String fristName;
    private String lastName;
    private String email;

    public User(){}
    public User(String username, String firstName, String lastName, String email){
        this.username = username;
        this.fristName = firstName;
        this.lastName = lastName;
        this.email = email;
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
}
