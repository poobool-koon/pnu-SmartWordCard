package com.example.swordcard;

import java.util.Date;

public class WordEntry {
    public String english = "";
    public String mean = "";
    public Date date;
    public WordEntry(String english,String mean){
        this.english = english;
        this.mean = mean;
    }

    @Override
    public String toString() {
        return english + ':' + mean;
    }
}
