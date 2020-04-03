package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    String message;
    // Default cinstructor
    public MoodAnalyser() {

    }
    //parameterized Constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String getMood() {
        if (message.contains("sad"))
            return "SAD";
        if (message.contains("happy"))
            return "HAPPY";
        return "Invalid Mood";
    }

}
