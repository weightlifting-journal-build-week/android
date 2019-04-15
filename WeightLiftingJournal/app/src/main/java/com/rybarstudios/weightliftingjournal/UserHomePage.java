package com.rybarstudios.weightliftingjournal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserHomePage extends AppCompatActivity {

    Button newWorkoutButton;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home_page);
        context = this;

        Intent intent = getIntent();

        newWorkoutButton = findViewById(R.id.button_new_workout);
        newWorkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newWorkoutIntent = new Intent(context, Workouts.class);
                startActivityForResult(newWorkoutIntent, Constants.NEW_WORKOUT_REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK && requestCode == Constants.NEW_WORKOUT_REQUEST_CODE) {
            if(data != null) {
                Uri uri = data.getData();
            }
        }
    }
}
