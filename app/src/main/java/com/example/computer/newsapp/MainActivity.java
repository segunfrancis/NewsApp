package com.example.computer.newsapp;

import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private List<News> newsList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recycler_view);

        recyclerViewAdapter = new RecyclerViewAdapter(newsList);

        // Declaring Linear Layout Manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        // Setting Layout Manager to recycler view
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(recyclerViewAdapter);

        prepareNewsData();
    }

    private void prepareNewsData() {
        String firstCategory = getString(R.string.first_category);
        String firstHeadline = getString(R.string.first_headline);
        String firstPublisher = getString(R.string.first_publisher);
        int firstImage = R.drawable.first_image;

        String secondCategory = getString(R.string.second_category);
        String secondHeadline = getString(R.string.second_headline);
        String secondPublisher = getString(R.string.second_publisher);
        int secondImage = R.drawable.second_image;

        String thirdCategory = getString(R.string.third_category);
        String thirdHeadline = getString(R.string.third_headline);
        String thirdPublisher = getString(R.string.third_publisher);
        int thirdImage = R.drawable.third_image;

        String fourthCategory = getString(R.string.fourth_category);
        String fourthHeadline = getString(R.string.fourth_headline);
        String fourthPublisher = getString(R.string.fourth_publisher);
        int fourthImage = R.drawable.fourth_image;

        String fifthCategory = getString(R.string.fifth_category);
        String fifthHeadline = getString(R.string.fifth_headline);
        String fifthPublisher = getString(R.string.fifth_publisher);
        int fifthImage = R.drawable.fifth_image;

        String sixthCategory = getString(R.string.sixth_category);
        String sixthHeadline = getString(R.string.sixth_headline);
        String sixthPublisher = getString(R.string.sixth_publisher);
        int sixthImage = R.drawable.sixth_image;


        News news = new News(firstCategory, firstHeadline, firstPublisher, firstImage);
        newsList.add(news);

        news = new News(secondCategory, secondHeadline, secondPublisher, secondImage);
        newsList.add(news);

        news = new News(thirdCategory, thirdHeadline, thirdPublisher, thirdImage);
        newsList.add(news);

        news = new News(fourthCategory, fourthHeadline, fourthPublisher, fourthImage);
        newsList.add(news);

        news = new News(fifthCategory, fifthHeadline, fifthPublisher, fifthImage);
        newsList.add(news);

        news = new News(sixthCategory, sixthHeadline, sixthPublisher, sixthImage);
        newsList.add(news);
    }
}