package com.bridgelabz.moodanalyser;

import java.lang.reflect.Constructor;

public class MoodAnalyserFactory {
    //Default Constructor
    public static Constructor getConstructor(String className , Class... parameter) throws MoodAnalysisException {
        try {
            Class<?> moodAnalyserClass = Class.forName(className);
            return moodAnalyserClass.getConstructor(parameter);
        }
        catch (ClassNotFoundException e) {
            throw new MoodAnalysisException("class not found",MoodAnalysisException.ExceptionType.CLASS_NOT_FOUND);
        }
        catch (NoSuchMethodException e) {
            throw new MoodAnalysisException("method not found",MoodAnalysisException.ExceptionType.METHOD_NOT_FOUND);
        }
    }
}
