package com.bridgelabs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTestUc3 {
    //     Purpose : Analyse mood by passing the message in the constructor
    //     Input message: This is a sad message
    //     @return : HAPPY
    @Test
    public void testMoodAnalysis_whenMoodIsSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a sad message");
        String mood;
        try { 
            mood = moodAnalyzer.analyseMood();
            Assertions.assertEquals("SAD" , mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
    //     Purpose : Analyse mood by passing the message in the constructor
    //     Input message: This is a happy message
    //     @return : HAPPY
    @Test
    public void testMoodAnalysis_whenMoodIsHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a happy message");
        String mood;
        try {
            mood = moodAnalyzer.analyseMood();
            Assertions.assertEquals("HAPPY" , mood);
        }catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
    //    Purpose : Custom Exception if User Provides Invalid Mood
    //    Input message: null
   //    @return : custom exception message is null
    @Test
    public void testMoodAnalysis_whenMoodIsNull_ShouldThrowException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    //     Purpose : Custom Exception if User Provides Invalid Mood
    //     Input message: empty
   //     @return : custom exception message is empty
    @Test
    public void testMoodAnalysis_whenMoodIsEmpty_ShouldThrowException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            System.out.println(e);
            System.out.println(e.type);
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY , e.type);
        }
    }
}