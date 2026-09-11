package com.marchingSnare;

public class Lesson {
	private String name;
	private String difficulty;
	private String description;
	private String howToPlay;
	private int bpm;
	private boolean complete;
	
	public Lesson(String name, String description, String difficulty, int bpm, String howToPlay) { // specifying constructor
		this.name = name;
		this.description = description;
		this.difficulty = difficulty;
		this.bpm = bpm;
		complete = false;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDifficulty() {
		return difficulty;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getHowToPlay() {
		return howToPlay;
	}
	
	public int getBpm() {
		return bpm;
	}
	
	public boolean getComplete() {
		return complete;
	}
	
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	
}
