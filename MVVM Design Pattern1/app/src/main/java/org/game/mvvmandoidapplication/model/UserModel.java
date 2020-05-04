package org.game.mvvmandoidapplication.model;

public class UserModel {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public UserModel(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public int checkUserValidity(String username, String password){
         if(username.trim().equals("") || password.trim().equals("")){
             return  -1;
         }
         return 0;
    }


}
