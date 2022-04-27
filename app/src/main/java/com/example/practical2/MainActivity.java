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

    //Method to change text when follow button is clicked
    public void followPerson(View view){
        Button button = findViewById(R.id.follow);
        String btnText = button.getText().toString();
        if (btnText.equals("Follow")){
            button.setText("Unfollow");
        }
        else{
            button.setText("Follow");
        }
    }

}