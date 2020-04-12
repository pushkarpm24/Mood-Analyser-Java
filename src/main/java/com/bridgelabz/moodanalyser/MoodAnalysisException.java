package com.bridgelabz.moodanalyser;
import java.lang.reflect.Constructor;


public class MoodAnalysisException extends Exception {
    enum ExceptionType
    {
        EMPTY_EXCEPTION,
        NULL_EXCEPTION,
        CLASS_NOT_FOUND,
        METHOD_NOT_FOUND,
        FIELD_NOT_FOUND,
        ILLEGAL_ACCESS_EXCEPTION,

    }
    ExceptionType exceptionTypeObject;
    public MoodAnalysisException(String message,ExceptionType exceptionTypeObject) {
        super (message);
        this.exceptionTypeObject=exceptionTypeObject;
    }
}
