package temple.tempflorida.azeemazem.mvprevisedpackpt.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.MessageFormat;
import java.util.Objects;
import android.support.design.widget.Snackbar;

import javax.inject.Inject;

import temple.tempflorida.azeemazem.mvprevisedpackpt.root.App;
import temple.tempflorida.azeemazem.mvprevisedpackpt.R;

public class RevmvpPackt extends AppCompatActivity implements LoginActivityMVP.View{            // Implements MVP's provided View

    @Inject
    LoginActivityMVP.Presenter loginPresenter;                // Presenter for current View, to use SetView Method using in onResume() lifeCycle callback method

    EditText fName;
    EditText lName;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rev_mvp_packt);

        fName = findViewById(R.id.etFirstN);
        lName = findViewById(R.id.etLastN);
        loginButton = findViewById(R.id.buLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // To be Implemented
            }
        });

        ((App) getApplication()).getComponent().InjectMain(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        loginPresenter.setView(this);                     // Presenting the View
    }

    @Override
    public String getFirstName() {
        return fName.getText().toString();
//        return null;   // auto-generated
    }

    @Override
    public String geLasttName() {
        return lName.getText().toString();
    }

    @Override
    public void showUserSavedMsg() {

    }

    @Override
    public void showUserNotAvailable() {                   //
        Snackbar.make(Objects.requireNonNull(getCurrentFocus())
                , MessageFormat.format("An Error occured, please try again ", null)
                , Snackbar.LENGTH_LONG).setAction("Action", null).show();

    }

    @Override
    public void showInputError() {

    }

    @Override
    public void setFirstName(String fname) {

    }

    @Override
    public void setLastName(String lname) {

    }
}
