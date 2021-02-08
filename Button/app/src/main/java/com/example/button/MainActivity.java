package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    private Button loginId;
    private TextView textView;
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginId = findViewById(R.id.loginBid);
        textView = findViewById(R.id.textViewid);
        logout = findViewById(R.id.logOut);

        loginId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                Toast.makeText(MainActivity.this, "this is toast example instead of textview", Toast.LENGTH_SHORT).show();
                //textView.setText("Login Button is clicked " + count + " times");
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast = Toast.makeText(MainActivity.this, "this is toast by setting position", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();

                //textView.setText("Logout Button is clicked!");
                count = 0;
            }
        });
    }
}