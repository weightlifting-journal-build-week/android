package com.rybarstudios.weightliftingjournal;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class ExerciseTypeAdapter extends RecyclerView.Adapter<ExerciseTypeAdapter.ExerciseTypeViewHolder> {


    @NonNull
    @Override
    public ExerciseTypeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseTypeViewHolder exerciseTypeViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ExerciseTypeViewHolder extends RecyclerView.ViewHolder {

        public ExerciseTypeViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
