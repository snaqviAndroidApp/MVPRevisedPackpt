package temple.mvprevisedpackpt.root;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DeployModule {

    private Application application;

    public DeployModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Context provideContext(){
     return application;

    }

}
