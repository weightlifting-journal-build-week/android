package com.rybarstudios.weightliftingjournal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ExercisesAdapter extends RecyclerView.Adapter<ExercisesAdapter.ExercisesViewHolder>{
    private ArrayList<Exercise> mExercises;
    Context context;

    @NonNull
    @Override
    public ExercisesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.exercise_item_list, parent, false);
        return new ExercisesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExercisesViewHolder exercisesViewHolder, int i) {
        exercisesViewHolder.exercise.setText("testttttt");
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ExercisesViewHolder extends RecyclerView.ViewHolder {
        View parentLayout;
        TextView exercise;

        public ExercisesViewHolder(@NonNull View itemView) {
            super(itemView);
            parentLayout = itemView.findViewById(R.id.exercise_parent_layout);
            exercise = itemView.findViewById(R.id.exercise_name);
        }
    }
}
