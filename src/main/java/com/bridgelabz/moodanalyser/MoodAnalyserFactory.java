package com.bridgelabz.moodanalyser;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MoodAnalyserFactory {
    //Default Constructor
    public static Constructor getConstructor(String className, Class... parameter) throws MoodAnalysisException {
        try {
            Class<?> moodAnalyserClass = Class.forName(className);
            return moodAnalyserClass.getConstructor(parameter);
        } catch (ClassNotFoundException e) {
            throw new MoodAnalysisException("class not found", MoodAnalysisException.ExceptionType.CLASS_NOT_FOUND);
        } catch (NoSuchMethodException e) {
            throw new MoodAnalysisException("method not found", MoodAnalysisException.ExceptionType.METHOD_NOT_FOUND);
        }
    }

    public static MoodAnalyser createMoodAnalyserObject(Constructor constructor, Object... moodAnalyserObject)
    {
        try {
            return (MoodAnalyser) constructor.newInstance(moodAnalyserObject);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object invokeMethod(Object moodAnalyserObject , String analyseMood) throws MoodAnalysisException {
        try {
            Class objectClass = moodAnalyserObject.getClass();
            Method moodMethod = objectClass.getMethod(analyseMood);
            Object result = moodMethod.invoke(moodAnalyserObject);
            return result;
        }
        catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}