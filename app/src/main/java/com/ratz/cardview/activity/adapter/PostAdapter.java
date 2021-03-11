package com.ratz.cardview.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ratz.cardview.R;
import com.ratz.cardview.activity.model.Post;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.MyViewHolder> {

    private List<Post> posts;

    public PostAdapter(List<Post> postsList) {

        this.posts = postsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_list, parent,false);

        return  new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Post post = posts.get(position);


        holder.image.setImageResource(post.getImage());
        holder.post.setText(post.getPost());
        holder.title.setText(post.getTitle());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView post;
        private ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.titleText);
            post = itemView.findViewById(R.id.postText);
            image = itemView.findViewById(R.id.imageId);
        }
    }
}
