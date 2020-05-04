package org.game.mvpandroidapplication.login;

import org.game.mvpandroidapplication.data.model.User;

//using MVP design pattern, Now I create login contract interface
public interface LoginActivityMVP {

    interface  View{
        String getFirstName();
        String getLastName();
        void showInputError();
        void setFirstName(String firstName);
        void setLastName(String lastName);
        void showUserSavedMessage();
    }

    interface Presenter{

        void setView(View view);
        void loginButtonClicked();
        void getCurrentUser();
    }

    interface Model{
        void createUser(String name, String lastName);
        User getUser();
    }
}
