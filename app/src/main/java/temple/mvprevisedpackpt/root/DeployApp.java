package temple.mvprevisedpackpt.root;

import android.app.Application;

import temple.mvprevisedpackpt.login.PacktpubLoginModule;


public class DeployApp extends Application {

    private DeployComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerDeployComponent.builder()
                .deployModule(new DeployModule(this))
                .packtpubLoginModule(new PacktpubLoginModule())
                .build();
    }

    public DeployComponent getComponent(){
        return component;
    }
}
