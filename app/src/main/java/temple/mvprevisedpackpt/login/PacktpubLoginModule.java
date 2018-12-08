package temple.mvprevisedpackpt.login;

import dagger.Module;
import dagger.Provides;
import temple.mvprevisedpackpt.backend.MemoryRepository;

@Module
public class PacktpubLoginModule {

    @Provides
    public LoginActivityMVP.Presenter providePacktpubLoginPresenter(LoginActivityMVP.Model model){
        return new PacktpubLoginPresenter(model);
    }

    @Provides
    public LoginActivityMVP.Model provdePacktpubLoginModel(LoginRepository repo){
        return new PacktpubLoginModel(repo);
    }

    @Provides
    public LoginRepository provideLoginRepository(){
        return new MemoryRepository();
    }
}
