package temple.mvprevisedpackpt.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.MessageFormat;
import java.util.Objects;
import com.google.android.material.snackbar.Snackbar;

import javax.inject.Inject;

import temple.mvprevisedpackpt.root.DeployApp;
import temple.mvprevisedpackpt.R;

public class PacktpubLoginApp extends AppCompatActivity implements LoginActivityMVP.View {            // Implements MVP's provided View

    @Inject
    LoginActivityMVP.Presenter loginPresenter;                // Presenter for current View, to use SetView Method using in onResume() lifeCycle callback method

    EditText fName;
    EditText lName;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rev_mvp_packt);

        ((DeployApp) getApplication()).getComponent().inject(this);

        fName = findViewById(R.id.etFirstN);
        lName = findViewById(R.id.etLastN);
        loginButton = findViewById(R.id.buLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO: 11/12/18 Implement this method
                loginPresenter.loginButtonClicked();   // to get default user
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        loginPresenter.setView(this);                     // Presenting the View
        loginPresenter.getCurrentUser();                  // get current / default user
    }

    @Override
    public String getFirstName() {
        return fName.getText().toString();
//        return null;   // auto-generated
    }

    @Override
    public String getLastName() {
        return lName.getText().toString();
    }

    @Override
    public void showUserSavedMsg() {
        Toast.makeText(this,"User saved",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showUserNotAvailable() {                   //
        Snackbar.make(Objects.requireNonNull(getCurrentFocus())
                , MessageFormat.format("An Error occured, please try again ", null)
                , Snackbar.LENGTH_LONG).setAction("Action", null).show();

    }

    @Override
    public void showInputError() {
        Snackbar.make(Objects.requireNonNull(getCurrentFocus())
                , MessageFormat.format("First or Last Name cannot be empty, please try again ", null)
                , Snackbar.LENGTH_LONG).setAction("Action", null).show();

    }

    @Override
    public void setFirstName(String fname) {
        fName.setText(fname);

    }

    @Override
    public void setLastName(String lname) {
        lName.setText(lname);

    }
}
