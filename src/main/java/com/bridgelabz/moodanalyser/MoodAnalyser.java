package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    public String getMood(String massage) {
        if (massage.contains("sad"))
            return "SAD";
        if (massage.contains("happy"))
            return "HAPPY";
        return "Invalid Mood";
    }

}
