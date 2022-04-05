package com.bridgelabs;

public class MoodAnalyzerUc2 {
    private String message;
    public MoodAnalyzerUc2() {                    //Default Constructor
    }
    public MoodAnalyzerUc2(String message) {
        this.message = message;
    }           //Parameterized Constructor
    public String analyseMood() {               //Handle NULLPOINTER Exception using try-catch block
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch(Exception e) {
            return "HAPPY";
        }
    }
}