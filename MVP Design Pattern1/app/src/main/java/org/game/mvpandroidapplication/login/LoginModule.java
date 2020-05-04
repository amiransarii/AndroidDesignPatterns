package org.game.mvpandroidapplication.login;

import org.game.mvpandroidapplication.data.model.LoginModel;
import org.game.mvpandroidapplication.data.repo.LoginRepository;
import org.game.mvpandroidapplication.data.repo.UserRepository;

import dagger.Provides;
//Now create a java class named is LoginModule.java which annotated with @Module annotation
public class LoginModule {

    @Provides
    public LoginActivityMVP.Presenter provideLoginActivityPresenter(LoginActivityMVP.Model model){
        return new LoginActivityPresenter(model);
    }

    @Provides
    public LoginActivityMVP.Model provideLoginActivityModel(LoginRepository repository){
        return new LoginModel(repository);
    }


    @Provides
    public LoginRepository provideLoginRepository(){
        return new UserRepository();
    }




}
