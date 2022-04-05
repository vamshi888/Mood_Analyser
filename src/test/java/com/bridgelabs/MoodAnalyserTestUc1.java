package com.bridgelabs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MoodAnalyserTestUc1 {
    @Test
    public void testMoodAnalysis_whenMoodIsSad() {
        MoodAnalyzerUc1 moodAnalyzer = new MoodAnalyzerUc1();
        String mood = moodAnalyzer.analyseMood("This is a sad message");
        Assertions.assertEquals(mood, "SAD");
    }
    @Test
    public void testMoodAnalysis_whenMoodIsHappy() {
        MoodAnalyzerUc1 moodAnalyzer = new MoodAnalyzerUc1();
        String mood1 = moodAnalyzer.analyseMood("This is a happy message");
        Assertions.assertEquals(mood1, "HAPPY");
    }
}
