package com.example.tugasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView judulTV;
    private TextView subjudulTV;
    private TextView articleTV;

    String judul = "Golang: why should you choose this language?";
    String subjudul = "How to implement Go to the current project: benefits and challenges";
    String body = "Hundreds of IT products are brought to the market annually. Over time, users have new requests: change the interface, speed up, optimize the application, and so on. To fix bugs and improve the system, developers are looking for the most effective solution for the client and the least labor-intensive solution for the team.\n" +
            "\n" +
            "Looking for convenient tools for working on the web, Google engineers in 2007 thought about a simpler version of C and C ++. The idea was successfully implemented in the form of Golang - a compiled multithreaded programming language. It was planned that it would be used only for Google tasks (a derivative of the Google language). But soon the engineers shared their best practices with the entire community.\n" +
            "\n" +
            "In this article, I want to talk about the benefits of using Golang and how it attracts backend developers. \n" +
            "\n" +
            "Docker and Kubernetes applications popular among all programmers are written in Go. The backend of the mobile version of Uber too. By the way, the company's developers were among the first to come up with a standard for the design and maintenance of the Golang code. Go also succeeded in the blockchain. Hyperledger Fabric, a platform for implementing blockchain projects, also actively uses Go. This list can be continued for a long time, but the world statistics looks far more eloquent.\n" +
            "\n" +
            "According to Stack Overflow, Golang is in the top 3 languages \u200B\u200Bin which programmers would like to write code. Python and JavaScript are in the lead. In Popularity of Programming Language ranking, Golang is in 13th place out of 28. For comparison, it was in 30th place five years ago. All this suggests that the popularity and perspective of the language are growing. My advice to you: to be on the same wavelength with the global IT community and learn Golang today.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        judulTV = findViewById(R.id.judul);
        subjudulTV = findViewById(R.id.subjudul);
        articleTV = findViewById(R.id.article);

        judulTV.setText(judul);
        subjudulTV.setText(subjudul);
        articleTV.setText(body);
    }

    public void countingAngka(View view) {
        int i = 1;
    }
}