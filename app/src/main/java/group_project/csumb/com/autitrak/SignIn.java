package group_project.csumb.com.autitrak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class SignIn extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        View signUpButton = findViewById(R.id.signUp);
        signUpButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        EditText userName;
        EditText userPassword;
        EditText userEmail;
        EditText userFirstName;
        EditText userLastName;

        userName = (EditText)findViewById(R.id.username);

    }
}