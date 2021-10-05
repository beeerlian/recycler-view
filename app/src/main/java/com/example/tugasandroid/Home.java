package com.example.tugasandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugasandroid.adapter.ArticleAdapter;
import com.example.tugasandroid.model.Article;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    ArrayList<Article> articles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView articlesRV = findViewById(R.id.rvArticles);
        articles = Article.createContactsList(30);

        ArticleAdapter adapter = new ArticleAdapter(articles);
        articlesRV.setAdapter(adapter);
        articlesRV.setLayoutManager(new LinearLayoutManager(this));
    }
}