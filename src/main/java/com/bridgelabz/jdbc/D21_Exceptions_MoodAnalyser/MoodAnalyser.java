package com.bridgelabz.jdbc.D21_Exceptions_MoodAnalyser;

public class MoodAnalyser {

	String message;

	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {

		if (this.message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}

}
