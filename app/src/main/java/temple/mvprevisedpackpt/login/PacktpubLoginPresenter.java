package temple.mvprevisedpackpt.login;

import androidx.annotation.Nullable;
import temple.mvprevisedpackpt.backend.User;

public class PacktpubLoginPresenter implements LoginActivityMVP.Presenter {

    @Nullable                             // JLint hint
    private LoginActivityMVP.View view;
    private LoginActivityMVP.Model model;

    public PacktpubLoginPresenter(LoginActivityMVP.Model model) {       // for Constructor Injection
        this.model = model;
    }

    @Override
    public void setView(LoginActivityMVP.View view) {
        this.view = view;

    }

    @Override
    public void loginButtonClicked() {
        if(view != null){
            if(view.getFirstName().trim().equals("") || view.getLastName().trim().equals("")){
                view.showInputError();
            }else {
                model.createUser(view.getFirstName(),view.getLastName());
                view.showUserSavedMsg();
            }
        }

    }

    @Override
    public void getCurrentUser() {

        User user = model.getUser();
        if(user == null) {
            if (view != null) {
                view.showUserNotAvailable();
            }
        }else {
            if(view != null)
            view.setFirstName(user.getFirstName());
            view.setLastName(user.getLastName());
        }

    }
}
