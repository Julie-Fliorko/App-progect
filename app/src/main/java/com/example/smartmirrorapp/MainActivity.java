package com.example.smartmirrorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.smartmirrorapp.ui.news.NewsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nickName = findViewById(R.id.etName);
        final EditText password = findViewById(R.id.etPassword);
        Button sigIn = findViewById(R.id.btmSigIn);
        Button continueWithGoogle = findViewById((R.id.btmContinueWithGoogle));
        CheckBox rememberMe = findViewById(R.id.checkBox);
        Button register = findViewById(R.id.register);

        sigIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nickName.getText().toString().equals("me") && password.getText().toString().equals("1")){

                    Intent intent = new Intent(MainActivity.this, NewsFragment.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Wrong username or password", Toast.LENGTH_SHORT).show();
                }

            }
        });

        SharedPreferences sharedpreferences; //keeps user loged in //TODO: Test this feature

        sharedpreferences = getApplicationContext().getSharedPreferences("Preferences", 0);
        String login = sharedpreferences.getString("LOGIN", null);


        if (login != null) {
            //put your code if user is logged. For example, go to another activity
        }else {

// to go login activity
        }
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

}