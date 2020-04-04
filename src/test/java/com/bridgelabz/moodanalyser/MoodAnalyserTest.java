package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in sad mood");
        Assert.assertEquals("SAD",moodAnalyser.getMood());
    }

    @Test
    public void givenMessage_Whenhappy_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in happy mood");
        Assert.assertEquals("HAPPY",moodAnalyser.getMood());
    }

    @Test
    public void givenAnyEmptyMessage_shouldThrowException() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser(" ");
            moodAnalyser.getMood();
        }
        catch (MoodAnalysisException e) {
            Assert.assertEquals(e.exceptionTypeObject,MoodAnalysisException.ExceptionType.EMPTY_EXCEPTION);
        }
    }

    @Test
    public void givenAnyNullMessage_shouldThrowException() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser(" ");
            moodAnalyser.getMood();
        }
        catch (MoodAnalysisException e) {
            Assert.assertEquals(e.exceptionTypeObject,MoodAnalysisException.ExceptionType.NULL_EXCEPTION);
        }
    }

    // Test for checking if two objects are equal or not
    @Test
    public void givenMessage_whenObjectsAreEqual_shouldReturnTrue() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        Constructor constructor = MoodAnalyserFactory.getConstructor("MoodAnalyser");
        MoodAnalyser moodAnalyserObject2 = MoodAnalyserFactory.createMoodAnalyserObject(constructor);
        boolean result = moodAnalyser.equals(moodAnalyserObject2);
        Assert.assertTrue("true",result);
    }


}
