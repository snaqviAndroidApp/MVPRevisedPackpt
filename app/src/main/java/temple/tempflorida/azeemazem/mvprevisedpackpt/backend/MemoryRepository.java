package temple.tempflorida.azeemazem.mvprevisedpackpt.backend;

import temple.tempflorida.azeemazem.mvprevisedpackpt.login.LoginRepository;

public class MemoryRepository implements LoginRepository{      // In current implementation, the user-info is being fetched locally, but it could be using remote-api / cloud / other application
    @Override
    public User getUser() {
        return null;
    }

    @Override
    public void saveUser() {

    }
}
