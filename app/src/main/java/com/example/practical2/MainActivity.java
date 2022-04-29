package com.example.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    User newUser = new User("Jin Daat", "testing", 1, false);

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