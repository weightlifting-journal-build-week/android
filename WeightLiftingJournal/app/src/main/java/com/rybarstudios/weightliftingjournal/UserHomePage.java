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

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home_page);
        context = this;

        Intent intent = getIntent();

    }

    @Override
    public void onBackPressed() {

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

    public void newWorkout(View view) {
        Intent newWorkoutIntent = new Intent(context, ExerciseType.class);
        startActivityForResult(newWorkoutIntent, Constants.NEW_WORKOUT_REQUEST_CODE);
    }
}
