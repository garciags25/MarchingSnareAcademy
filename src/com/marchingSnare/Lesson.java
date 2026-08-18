package com.marchingSnare;

public class Lesson {
	private String name;
	private String description;
	private String difficulty;
	private int bpm;
	
	public Lesson(String name, String description, String difficulty, int BPM) { // specifying constructor
		this.name = name;
		description = description;
		difficulty = difficulty;
		this.bpm = bpm;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getDifficulty() {
		return difficulty;
	}
	
	public int getBpm() {
		return bpm;
	}
	
}
