package com.example.smartmirrorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity {
    protected EditText Email;
    protected EditText NickName;
    protected EditText Password;
    protected EditText OneMorePassword;
    protected Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Email = (EditText)findViewById(R.id.email);
        NickName = (EditText)findViewById(R.id.username);
        Password = (EditText)findViewById(R.id.password);
        OneMorePassword = (EditText)findViewById(R.id.passwordAgain);
        Register = (Button)findViewById(R.id.register);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkDataEntered();
                Intent intent = new Intent(RegisterActivity.this, BasicActivity.class);
                startActivity(intent);
                /*public void checkUsername() {
                    boolean isValid = true;
                    if (isEmpty(nickName)) {
                        nickName.setError("You must enter username to login!");
                        isValid = false;
                    } else {
                        if (!isEmail(nickName)) {
                            nickName.setError("Enter valid email!");
                            isValid = false;
                        }
                    }
                    if (isEmpty(password)) {
                        password.setError("You must enter password to login!");
                        isValid = false;
                    } else {
                        if (password.getText().toString().length() < 4) {
                            password.setError("Password must be at least 4 chars long!");
                            isValid = false;
                        }
                    }
                    //check email and password
                    //IMPORTANT: here should be call to backend or safer function for local check; For example simple check is cool
                    //For example simple check is cool
                    if (isValid) {
                        String usernameValue = nickName.getText().toString();
                        String passwordValue = password.getText().toString();
                        if (usernameValue.equals("test@test.com") && passwordValue.equals("password1234")) {
                            //everything checked we open new activity
                            Intent i = new Intent(MainActivity.this, RegisterActivity.class);
                            startActivity(i);
                            //we close this activity
                            this.finish();
                        } else {
                            Toast t = Toast.makeText(this, "Wrong email or password!", Toast.LENGTH_SHORT);
                            t.show();
                        }
                    }
                }*/
            }
        });

    }

    boolean isEmail(EditText text){
        CharSequence email = text.getText().toString();
        return( !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }
    private void checkDataEntered() {
        if (isEmail(Email)){
            Email.setError("Your email isn`t valid!");
        }
        if (isEmpty(NickName)){
            NickName.setError("Nickname should have ......");
        }
        if (isEmpty(Password)){
            Password.setError("Password should have ......");
        }
        if (isEmpty(OneMorePassword)){
            OneMorePassword.setError("Password should have ......");
        }

    }

}