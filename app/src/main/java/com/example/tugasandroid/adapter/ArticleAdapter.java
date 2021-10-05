package com.example.tugasandroid.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasandroid.R;
import com.example.tugasandroid.model.Article;

import java.util.List;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ViewHolder> {

    public List<Article> articleList;

    public ArticleAdapter(List<Article> articleList){
        this.articleList = articleList;
    }

    @NonNull
    @Override
    public ArticleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View articleView = inflater.inflate(R.layout.item_article, parent, false);

        ViewHolder itemVH = new ViewHolder(articleView);
        return itemVH;
    }

    @Override
    public void onBindViewHolder(ArticleAdapter.ViewHolder holder, int position) {
        Article article = articleList.get(position);

        TextView articleTV = holder.titleTV;
        articleTV.setText(article.heading);

    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView titleTV;

        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            titleTV = (TextView) itemView.findViewById(R.id.titleItemTV);

        }

    }
}
