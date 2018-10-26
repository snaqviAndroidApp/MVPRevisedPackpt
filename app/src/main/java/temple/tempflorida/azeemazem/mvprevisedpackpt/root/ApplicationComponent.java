package temple.tempflorida.azeemazem.mvprevisedpackpt.root;

import javax.inject.Singleton;

import dagger.Component;
import temple.tempflorida.azeemazem.mvprevisedpackpt.login.RevmvpPackt;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void InjectMain (RevmvpPackt target);
}
