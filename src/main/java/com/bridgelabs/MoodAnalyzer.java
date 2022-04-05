package com.bridgelabs;

public class MoodAnalyzer {
    private String message;
    public MoodAnalyzer() {                     //Default Constructor
    }
    public MoodAnalyzer(String message) {
        this.message = message;
    }            //Parameterized Constructor
    public String analyseMood() throws MoodAnalysisException {                   //Handle Customized Exception using try-catch block
        try {
            if (message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY , "Please enter proper message!");
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch(NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL , "Please enter proper message!");
        }
    }
}