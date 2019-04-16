package com.rybarstudios.weightliftingjournal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ExerciseTypeAdapter extends RecyclerView.Adapter<ExerciseTypeAdapter.ExerciseTypeViewHolder> {
    Context context;

    @NonNull
    @Override
    public ExerciseTypeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.exercise_type_item_list, parent, false);
        return new ExerciseTypeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseTypeViewHolder exerciseTypeViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ExerciseTypeViewHolder extends RecyclerView.ViewHolder {
        View exerciseTypeParentLayout;
        TextView exerciseTypeTextView;

        public ExerciseTypeViewHolder(@NonNull View itemView) {
            super(itemView);
            exerciseTypeParentLayout = itemView.findViewById(R.id.exercise_type_parent_layout);
            exerciseTypeTextView = itemView.findViewById(R.id.exercise_type_text_view);
        }
    }
}
