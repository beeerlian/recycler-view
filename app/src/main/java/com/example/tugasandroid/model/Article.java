package com.example.tugasandroid.model;

import java.util.ArrayList;

public class Article {
    public String heading;
    public String subHeading;
    public String body;

    Article(String heading, String subHeading, String body){
        this.heading = heading;
        this.subHeading = subHeading;
        this.body = body;
    }

    public static ArrayList<Article> createContactsList(int numContacts) {
        ArrayList<Article> articles = new ArrayList<Article>();

        for (int i = 1; i <= numContacts; i++) {
            articles.add(new Article("Judul", "sub Judul","body"));
        }

        return articles;
    }
}
