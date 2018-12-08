package temple.mvprevisedpackpt.backend;

import temple.mvprevisedpackpt.login.LoginRepository;

public class MemoryRepository implements LoginRepository{      // In current implementation, the user-info is being fetched locally, but it could be using remote-api / cloud / other application

    private User user;

    @Override
    public User getUser() {

        if(user == null ){
            User user = new User("Dummy FName", "Dummy LName");
            user.setId(0);
            return user;
        }else {
            return user;
        }
    }

    @Override
    public void saveUser(User user) {
        if(user == null){
            user = getUser();
        }
        this.user = user;

    }
}
