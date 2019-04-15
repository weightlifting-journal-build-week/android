package com.rybarstudios.weightliftingjournal;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class WorkoutsAdapter extends RecyclerView.Adapter<WorkoutsAdapter.WorkoutsViewHolder> {
    private ArrayList<Workout> mWorkouts;

    @NonNull
    @Override
    public WorkoutsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull WorkoutsViewHolder workoutsViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return mWorkouts.size();
    }

    class WorkoutsViewHolder extends RecyclerView.ViewHolder {

        public WorkoutsViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
