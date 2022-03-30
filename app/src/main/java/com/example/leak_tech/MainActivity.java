package com.example.leak_tech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText text_emailid;
    EditText text_password;
    ImageView text_Login;
    Button text_signup;
    Button text_forgetpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_emailid = (EditText) findViewById(R.id.get_Email_id) ;
        text_password= (EditText) findViewById(R.id.get_password) ;
        text_Login = (ImageView) findViewById(R.id.login) ;
        text_signup = (Button) findViewById(R.id.sign_up);
        text_forgetpassword = (Button) findViewById(R.id.forget_password);

        text_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signup_Intent = new Intent(MainActivity.this,Signup.class);
                startActivity(signup_Intent);
            }
        });
        text_forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgetpassword_Intent = new Intent(MainActivity.this,Forgetpassword.class);
                startActivity(forgetpassword_Intent);
            }
        });
        text_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loading_login_Intent = new Intent(MainActivity.this,loading_login.class);
                startActivity(loading_login_Intent);
            }
        });

    }
}