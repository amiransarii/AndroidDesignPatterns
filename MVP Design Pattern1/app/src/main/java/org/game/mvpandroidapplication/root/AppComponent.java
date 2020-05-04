package org.game.mvpandroidapplication.root;

import org.game.mvpandroidapplication.LoginActivity;
import org.game.mvpandroidapplication.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

//Let’s create a interface name is AppComponent and add below code
@Singleton
@Component(modules = {AppModule.class, LoginModule.class})
public interface AppComponent {
    public void inject(LoginActivity target);

}
