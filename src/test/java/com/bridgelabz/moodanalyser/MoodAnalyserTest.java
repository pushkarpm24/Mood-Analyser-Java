package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.getMood("i m sad");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_Whenhappy_ShouldReturnhappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.getMood("i m happy");
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenAnyOtherMessage_shouldReturnInvalidMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.getMood("");
        Assert.assertEquals("Invalid Mood",mood);
    }
}
