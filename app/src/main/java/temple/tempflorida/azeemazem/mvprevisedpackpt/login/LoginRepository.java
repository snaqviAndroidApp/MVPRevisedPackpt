package temple.tempflorida.azeemazem.mvprevisedpackpt.login;

import temple.tempflorida.azeemazem.mvprevisedpackpt.backend.User;

public interface LoginRepository {

    User getUser();
    void saveUser();
}
