package temple.tempflorida.azeemazem.mvprevisedpackpt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RevMvpPackt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rev_mvp_packt);

        ((App) getApplication()).getComponent().InjectMain(this);
    }
}
