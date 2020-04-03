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
        try {
            if (message.contains("happy")) {
                return "HAPPY";
            } else {
                return "SAD";
            }
        }
        catch (NullPointerException e) {
            return "HAPPY";
        }
    }

}
