package com.example.pablocovarrubias.githubapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    ImageView avatarIV;
    TextView usernameTV;
    TextView followersTV;
    TextView followingTV;
    TextView logInTV;
    TextView emailTV;
    Button repositoriesBTN;

    Bundle extras;
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        avatarIV =(ImageView) findViewById(R.id.avatar);
        usernameTV = (TextView) findViewById(R.id.username);
        followersTV = (TextView) findViewById(R.id.followers);
        followingTV = (TextView) findViewById(R.id.following);
        logInTV = (TextView) findViewById(R.id.logIn);
        emailTV = (TextView) findViewById(R.id.email);
        repositoriesBTN = (Button) findViewById(R.id.button_repositories);

        extras = getIntent().getExtras();
        newString = extras.getString("STRING_I_NEED");
        System.out.println(newString);
    }

    public void loadOwnRepos(View view){

    }
}
