package org.game.mvpandroidapplication.data.repo;

import org.game.mvpandroidapplication.data.model.User;

/**
 * In LoginModel you see we are using a LoginRepository. To create a new interface which provides user
 * instance and save the user instance in the repository.
 */
public interface LoginRepository {

    User getUser();
    void saveUser(User user);
}
