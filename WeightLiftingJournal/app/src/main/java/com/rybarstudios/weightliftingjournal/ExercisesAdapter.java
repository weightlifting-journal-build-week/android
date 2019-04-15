package com.rybarstudios.weightliftingjournal;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ExercisesAdapter extends RecyclerView.Adapter<ExercisesAdapter.ExercisesViewHolder>{
    private ArrayList<Exercise> mExercises;

    @NonNull
    @Override
    public ExercisesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ExercisesViewHolder exercisesViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ExercisesViewHolder extends RecyclerView.ViewHolder {

        public ExercisesViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
