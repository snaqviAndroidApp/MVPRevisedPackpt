package temple.mvprevisedpackpt.login;

import temple.mvprevisedpackpt.backend.User;

public interface LoginRepository {

    User getUser();
    void saveUser(User user);
}
