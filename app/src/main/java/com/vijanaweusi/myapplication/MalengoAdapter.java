package com.vijanaweusi.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MalengoAdapter extends RecyclerView.Adapter<MalengoAdapter.MalengoViewHolder> {

    private Malengo[] goals;

    public MalengoAdapter(Malengo[] goals) {
        this.goals = goals;
    }

    @Override
    public int getItemCount() {
        return goals.length;
    }

    @NonNull
    @Override
    public MalengoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_malengo, parent, false);

        return new MalengoViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MalengoAdapter.MalengoViewHolder holder, int position) {

        holder.bind(goals[position]);

    }

    static class MalengoViewHolder extends RecyclerView.ViewHolder {

        private ImageView appImage;
        private TextView appTitle;
        private TextView appDescription;

        public MalengoViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage = itemView.findViewById(R.id.image_view_goals_icon);
            appTitle = itemView.findViewById(R.id.text_view_goals_title);
            appDescription = itemView.findViewById(R.id.text_view_goals_description);
        }

        public void bind(Malengo project) {
            appTitle.setText(project.name);
            appDescription.setText(project.description);
            appImage.setImageResource(project.image);
        }
    }
}
