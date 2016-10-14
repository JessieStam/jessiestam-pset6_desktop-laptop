package jessie_stam.jessiestam_pset6_desktop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signUp(View view) {

        String title = "Signing up";
        String instr = "Welcome! Enter your e-mail adress and password to sign up.";
        String pass_confirm = "visible";

        Intent signUpUser = new Intent(this, EmailPasswordActivity.class);

        signUpUser.putExtra("log_sign", title);
        signUpUser.putExtra("instr", instr);
        signUpUser.putExtra("pass_confirm", pass_confirm);

        startActivity(signUpUser);
    }

    public void logIn(View view) {

        String title = "Logging in";
        String instr = "Welcome back! You know the drill: e-mail and password to continue.";
        String pass_confirm = "invisible";

        Intent logInUser = new Intent(this, EmailPasswordActivity.class);

        logInUser.putExtra("log_sign", title);
        logInUser.putExtra("instr", instr);
        logInUser.putExtra("pass_confirm", pass_confirm);

        startActivity(logInUser);
    }
}
