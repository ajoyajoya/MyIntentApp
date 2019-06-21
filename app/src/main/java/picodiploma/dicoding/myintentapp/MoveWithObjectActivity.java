package picodiploma.dicoding.myintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveWithObjectActivity extends AppCompatActivity {

    public static final String EXTRA_AGE = "extra_age";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_EMAIL = "extra_email";
    public static final String EXTRA_CITY = "extra_city";

    TextView tvObjectReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);

        tvObjectReceived = findViewById(R.id.tv_object_received);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE, 0);
        String email = getIntent().getStringExtra(EXTRA_EMAIL);
        String city = getIntent().getStringExtra(EXTRA_CITY);
        String text = "Name : " + name + ",\nYour Age : " + age + ",\nYour Email : " + email + ",\nYour City : " + city;
        tvObjectReceived.setText(text);
    }
}
