package temple.mvprevisedpackpt.login;

import temple.mvprevisedpackpt.backend.User;

public class PacktpubLoginModel implements LoginActivityMVP.Model{

    private LoginRepository repository;

    public PacktpubLoginModel(LoginRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createUser(String fname, String lname) {
        repository.saveUser(new User(fname, lname));
    }

    @Override
    public User getUser() {
        return repository.getUser();
    }
}
