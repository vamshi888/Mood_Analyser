package com.bridgelabs;
//Customized Exception extended from Exception superclass
public class MoodAnalysisException extends Exception {
    ExceptionType type;
    enum ExceptionType {             //To inform user whether the mood entered is empty or null
        ENTERED_NULL, ENTERED_EMPTY
    }
    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
