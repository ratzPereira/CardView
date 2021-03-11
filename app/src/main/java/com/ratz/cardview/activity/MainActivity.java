package com.ratz.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.ratz.cardview.R;
import com.ratz.cardview.activity.adapter.PostAdapter;
import com.ratz.cardview.activity.model.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private List<Post> posts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //define layout
       // LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);

        //make posts
        this.makePosts();

        //define adapter
        PostAdapter postAdapter = new PostAdapter(posts);
        recyclerView.setAdapter(postAdapter);
    }

    public void makePosts () {

        Post post = new Post("Ratz Pereira", "#nicetrip", R.drawable.imagem1);
        this.posts.add(post);

        post = new Post("Sogra Pereira", "#nicetripOK", R.drawable.imagem4);
        this.posts.add(post);

        post = new Post("Carol Pereira", "#nicetripeome", R.drawable.imagem3);
        this.posts.add(post);

        post = new Post("Nasus Pereira", "#nicetripAuau", R.drawable.imagem2);
        this.posts.add(post);
    }
}
