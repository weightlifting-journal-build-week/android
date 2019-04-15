package com.rybarstudios.weightliftingjournal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class WorkoutsAdapter extends RecyclerView.Adapter<WorkoutsAdapter.WorkoutsViewHolder> {
    private ArrayList<Workout> mWorkouts;
    Context context;

    @NonNull
    @Override
    public WorkoutsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.workouts_item_list, parent, false);
        return new WorkoutsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkoutsViewHolder workoutsViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return mWorkouts.size();
    }

    class WorkoutsViewHolder extends RecyclerView.ViewHolder {
        View workoutsParentLayout;

        public WorkoutsViewHolder(@NonNull View itemView) {
            super(itemView);
            workoutsParentLayout = itemView.findViewById(R.id.workouts_parent_layout);
        }
    }
}
