package com.example.computer.newsapp;

public class News {

    private String category, headline, publisher;
    private int image;

    public News(String category, String headline, String publisher, int image) {
        this.category = category;
        this.headline = headline;
        this.publisher = publisher;
        this.image = image;
    }

    public News() {

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}