package com.bridgelabs;

public class MoodAnalyzerUc1 {
    public String analyseMood(String message) {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
