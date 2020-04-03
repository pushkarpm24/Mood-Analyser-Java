package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in sad mood");
        Assert.assertEquals("SAD",moodAnalyser.getMood());
    }

    @Test
    public void givenMessage_Whenhappy_ShouldReturnhappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in happy mood");
        Assert.assertEquals("HAPPY",moodAnalyser.getMood());
    }

    @Test
    public void givenAnyOtherMessage_shouldReturnInvalidMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        Assert.assertEquals("Invalid Mood",moodAnalyser.getMood());
    }
}
