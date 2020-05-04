package org.game.mvpandroidapplication.root;
import android.app.Application;
import android.content.Context;
import javax.inject.Singleton;
import dagger.Provides;
//Now create a new class name AppModule in root package
public class AppModule {

    private Application application;

    public AppModule(Application application){
        this.application = application;
    }

    @Provides
    @Singleton
    public Context provideContext(){
        return application;
    }
}
