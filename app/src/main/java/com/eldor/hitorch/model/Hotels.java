package com.eldor.hitorch.model;

public class Hotels {

    private String title;
    private String image;
    private String cost;
    private String link;
    private float rating_bar;

    public Hotels(String title, String image, float rating_bar, String cost, String link) {
        this.title = title;
        this.image = image;
        this.rating_bar = rating_bar;
        this.cost = cost;
        this.link = link;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getRating_bar() {
        return rating_bar;
    }

    public void setRating_bar(float rating_bar) {
        this.rating_bar = rating_bar;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
