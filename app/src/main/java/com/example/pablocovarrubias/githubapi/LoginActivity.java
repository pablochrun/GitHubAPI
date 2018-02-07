package com.example.pablocovarrubias.githubapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private Button logIn;
    private EditText username;

    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        logIn = (Button) findViewById(R.id.btn_login);
        username = (EditText) findViewById(R.id.input_username);
    }

    public void getUser(View view){
        i = new Intent(LoginActivity.this, UserActivity.class);
        i.putExtra("STRING_I_NEED", username.getText().toString());
        startActivity(i);
    }
}
