package com.example.tugasnavdrawer;

public class Makanan {
    private String foodName;
    private int imageResourceId; // Resource ID for the image

    public Makanan(String foodName, int imageResourceId){
        this.foodName = foodName;
        this.imageResourceId = imageResourceId;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
