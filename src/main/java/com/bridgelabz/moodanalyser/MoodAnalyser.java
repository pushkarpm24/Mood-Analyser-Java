package com.bridgelabz.moodanalyser;

import java.util.Objects;

public class MoodAnalyser {
    String message;
    // Default cinstructor
    public MoodAnalyser() {

    }
    //parameterized Constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String getMood() throws MoodAnalysisException {

        try {
            if (message.length() == 0) {
                throw new MoodAnalysisException("Enter the message,it cannot be empty",
                        MoodAnalysisException.ExceptionType.EMPTY_EXCEPTION);
            }
            else if (message.contains("happy")) {
                return "HAPPY";
            }
            else {
                return "SAD";
            }
        }
        catch (NullPointerException e) {
            throw new MoodAnalysisException("Enter the message,it cannot be empty",
                    MoodAnalysisException.ExceptionType.NULL_EXCEPTION);
        }
    }
    public boolean equals (Object object1){
        if (this == object1) return true;
        if (object1 == null || getClass() != object1.getClass()) return false;
        MoodAnalyser object2 = (MoodAnalyser) object1;
        return Objects.equals(message, object2.message);

    }
}

