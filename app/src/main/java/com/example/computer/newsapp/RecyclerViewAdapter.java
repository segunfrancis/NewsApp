package com.example.computer.newsapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private List<News> newsList;

    public RecyclerViewAdapter(List<News> newsList) {
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        News news = newsList.get(position);
        holder.category.setText(news.getCategory());
        holder.headline.setText(news.getHeadline());
        holder.publisher.setText(news.getPublisher());
        holder.image.setImageResource(news.getImage());
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView category, headline, publisher;
        private ImageView image;

        public MyViewHolder(View itemView) {
            super(itemView);
            category = itemView.findViewById(R.id.category_text);
            headline = itemView.findViewById(R.id.headline_text);
            publisher = itemView.findViewById(R.id.publisher_text);
            image = itemView.findViewById(R.id.main_image);
        }
    }
}