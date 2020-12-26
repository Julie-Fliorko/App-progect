package com.example.smartmirrorapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class LogIn extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        final EditText nickName = findViewById(R.id.etName);
        final EditText password = findViewById(R.id.etPassword);
        Button sigIn = findViewById(R.id.btmSigIn);
        Button continueWithGoogle = findViewById((R.id.btmContinueWithGoogle));
        CheckBox rememberMe = findViewById(R.id.checkBox);
        Button register = findViewById(R.id.register);

        /*sigIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nickName.getText().toString().equals("me") && password.getText().toString().equals("1")) {

                    Intent intent = new Intent(LogIn.this, BasicActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Wrong username or password", Toast.LENGTH_SHORT).show();
                }

            }
        });*/
    }
}