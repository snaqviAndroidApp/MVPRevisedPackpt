package temple.tempflorida.azeemazem.mvprevisedpackpt;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void InjectMain (RevMvpPackt target);
}
