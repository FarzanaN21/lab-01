package com.example.petshop;

import java.util.Date;

public class Excited extends Mood {

    public Excited(){
        super();
    }

    public Excited(Date moodDate){
        super(moodDate);
    }

    @Override
    public String moodRep() {
        return "Yay!!";
    }
}
