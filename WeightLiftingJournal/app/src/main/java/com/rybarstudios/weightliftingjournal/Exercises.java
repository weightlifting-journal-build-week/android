package com.rybarstudios.weightliftingjournal;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Exercises extends AppCompatActivity {
    RecyclerView mRecyclerView;
    ExercisesAdapter mExercisesAdapter;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);
        context = this;

        Intent intent = getIntent();

        mExercisesAdapter = new ExercisesAdapter();

        RecyclerView recyclerView = findViewById(R.id.recycler_view_exercises);
        recyclerView.setAdapter(mExercisesAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);
    }
}
