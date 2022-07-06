package com.bridgelabz.jdbc.D21_Exceptions_MoodAnalyser;

import com.bridgelabz.jdbc.D21_Exceptions_MoodAnalyser.MoodAnalyserException.ExceptionType;

public class MoodAnalyser {

	String message;

	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyzeMood() throws MoodAnalyserException {

        try {
            if (message.length() == 0) {
                throw new MoodAnalyserException(ExceptionType.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");
            }
            if (this.message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyserException(ExceptionType.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
        }
    }

}
