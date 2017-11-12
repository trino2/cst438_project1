package group_project.csumb.com.autitrak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View individualButton = findViewById(R.id.individual);
        individualButton.setOnClickListener(this);

        View caregiverButton = findViewById(R.id.caregiver);
        caregiverButton.setOnClickListener(this);

        View nextButton = findViewById(R.id.next);
        nextButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.next:
                Intent signInPage = new Intent(this, SignIn.class);
                startActivity(signInPage);
                break;
        }
    }
}