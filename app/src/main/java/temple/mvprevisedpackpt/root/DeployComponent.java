package temple.mvprevisedpackpt.root;

import javax.inject.Singleton;

import dagger.Component;
import temple.mvprevisedpackpt.login.PacktpubLoginApp;
import temple.mvprevisedpackpt.login.PacktpubLoginModule;

@Singleton
@Component(modules = {DeployModule.class,PacktpubLoginModule.class})
public interface DeployComponent {

    void inject(PacktpubLoginApp target);
}
