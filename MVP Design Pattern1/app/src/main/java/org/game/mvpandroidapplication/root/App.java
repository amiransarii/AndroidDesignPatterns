package org.game.mvpandroidapplication.root;

import android.app.Application;
import org.game.mvpandroidapplication.login.LoginModule;

public class App extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public AppComponent getComponent() {
        return component;
    }
}
