package com.example.lonelytwitter;

public abstract class Mood {
    private String moodType;
    private Date moodDate;

    public Mood(String moodType) {
        this.moodType = moodType;
        this.moodDate = new Date();
    }
    public Mood (String moodType, Date moodDate) {
        this.moodName = moodType;
        this.moodDate = moodDate;
    }
}
