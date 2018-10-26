package temple.tempflorida.azeemazem.mvprevisedpackpt.root;

import android.app.Application;

import temple.tempflorida.azeemazem.mvprevisedpackpt.login.RevmvpPacktModule;


public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .revmvppacktmodule(new RevmvpPacktModule())
                .build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }
}
