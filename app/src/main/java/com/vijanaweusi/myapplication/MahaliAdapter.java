package com.vijanaweusi.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MahaliAdapter extends RecyclerView.Adapter<MahaliAdapter.MahaliViewHolder> {

    private Mahali[] places;

    public MahaliAdapter(Mahali[] places) {
        this.places = places;
    }

    @Override
    public int getItemCount() {
        return places.length;
    }

    @NonNull
    @Override
    public MahaliAdapter.MahaliViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mahali, parent, false);

        return new MahaliAdapter.MahaliViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MahaliAdapter.MahaliViewHolder holder, int position) {

        holder.bind(places[position]);
    }

    static class MahaliViewHolder extends RecyclerView.ViewHolder {

        private ImageView appImage;
        private TextView appTitle;
        private TextView appDescription;

        public MahaliViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage = itemView.findViewById(R.id.image_view_places_icon);
            appTitle = itemView.findViewById(R.id.text_view_places_title);
            appDescription = itemView.findViewById(R.id.text_view_places_description);
        }

        public void bind(Mahali project) {
            appTitle.setText(project.name);
            appDescription.setText(project.description);
            appImage.setImageResource(project.image);
        }
    }
}


