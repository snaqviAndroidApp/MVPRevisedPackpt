package temple.tempflorida.azeemazem.mvprevisedpackpt.login;

import temple.tempflorida.azeemazem.mvprevisedpackpt.backend.User;

public interface LoginActivityMVP {

    interface View {
        String getFirstName();
        String geLasttName();

        void showUserSavedMsg();
        void showUserNotAvailable();
        void showInputError();

        void setFirstName(String fname);
        void setLastName(String lname);
    }

    interface Presenter {

        void setView(LoginActivityMVP.View view);
        void loginButtonClicked();
        void getCurrentUser();
    }

    interface Model {
        void createUser(String fname, String lname);
        User getCurrentUser();

    }
}
