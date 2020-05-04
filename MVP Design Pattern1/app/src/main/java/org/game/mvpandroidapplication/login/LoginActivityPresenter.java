package org.game.mvpandroidapplication.login;

import org.game.mvpandroidapplication.LoginActivity;
import org.game.mvpandroidapplication.data.model.User;

/**
 * As per MVP, we have created Model, View on above, Now we will create a presenter for LoginActivity, Just create a java class with named
 * is LoginActivityPresenter which implementing LoginActivityMVP.Presenter. In presenter we are doing the following operation
 * Pass the view instance in the presenter in setView(View mView) methods
 * Defining onClick() event in loginButtonClicked() methods
 * Body on getCurrentUser() methods is retruning user instance
 */
public class LoginActivityPresenter implements LoginActivityMVP.Presenter {

    private LoginActivityMVP.View view;
    private LoginActivityMVP.Model model;

    public LoginActivityPresenter(LoginActivityMVP.Model model){
        this.model = model;
    }

    @Override
    public void setView(LoginActivityMVP.View view) {
        this.view = view;
    }

    @Override
    public void loginButtonClicked() {

        if(view != null){

            if(view.getFirstName().trim().equals("") || view.getLastName().trim().equals("")){
                view.showInputError();
            }
            else{
                model.createUser(view.getFirstName(),view.getLastName());
                view.showUserSavedMessage();
            }
        }
    }

    @Override
    public void getCurrentUser() {

        User user = model.getUser();

        if(user != null){

            if(view != null) {
                view.setFirstName(user.getFirstName());
                view.setLastName(user.getLastName());
            }
        }
    }
}
