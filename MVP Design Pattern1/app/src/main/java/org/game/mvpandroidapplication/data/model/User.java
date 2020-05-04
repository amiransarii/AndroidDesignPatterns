package org.game.mvpandroidapplication.data.model;

/**
 * Create a model class with named User.Java , which hold some user properties with getter
 * setter such as id, first name, last name
 */
public class User {
    private int id;
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}
