package org.game.mvvmdesignapplication2.model;

//The Model would hold the user’s email and password. The following User.java class does it:
public class User {

    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }




}
