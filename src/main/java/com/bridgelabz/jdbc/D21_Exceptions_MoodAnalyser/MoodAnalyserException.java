package com.bridgelabz.jdbc.D21_Exceptions_MoodAnalyser;

public class MoodAnalyserException extends Exception {

	enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY
	}

	ExceptionType type;

	public MoodAnalyserException(ExceptionType type, String message) {

		super(message);
		this.type = type;
	}

}