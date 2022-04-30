package com.example.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    User newUser = new User(
            "JINESE",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            1,
            false
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set User name
        TextView userName = (TextView)findViewById(R.id.userName);
        userName.setText(newUser.name);

        //Set User description
        TextView userDesc = (TextView)findViewById(R.id.userDesc);
        userDesc.setText(newUser.description);
    }

    //Method to change text when follow button is clicked
    public void followPerson(View view){
        Button followBtn = findViewById(R.id.follow);

        if (!newUser.followed){
            followBtn.setText("Unfollow");
            newUser.followed = true;
        }
        else{
            followBtn.setText("Follow");
            newUser.followed = false;
        }
    }

}