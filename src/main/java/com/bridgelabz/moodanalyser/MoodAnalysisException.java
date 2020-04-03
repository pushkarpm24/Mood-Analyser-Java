package com.bridgelabz.moodanalyser;

public class MoodAnalysisException extends Exception {
    enum ExceptionType
    {
        EMPTY_EXCEPTION,
        NULL_EXCEPTION
    }
    ExceptionType exceptionTypeObject;
    public MoodAnalysisException(String message,ExceptionType exceptionTypeObject) {
        super (message);
        this.exceptionTypeObject=exceptionTypeObject;
    }
}
