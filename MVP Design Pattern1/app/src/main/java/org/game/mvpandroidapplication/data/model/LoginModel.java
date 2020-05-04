package org.game.mvpandroidapplication.data.model;
//Just create a new class java which implements LoginActivityMVP

import org.game.mvpandroidapplication.data.repo.LoginRepository;
import org.game.mvpandroidapplication.login.LoginActivityMVP;

public class LoginModel implements LoginActivityMVP.Model {

    private LoginRepository repository;

    public  LoginModel(LoginRepository repository){
        this.repository= repository;
    }

    @Override
    public void createUser(String name, String lastName) {
      repository.saveUser(new User(name,lastName));
    }


    @Override
    public User getUser() {
        return repository.getUser();
    }
}
