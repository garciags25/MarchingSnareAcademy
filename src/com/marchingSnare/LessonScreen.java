package com.marchingSnare;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class LessonScreen {
	private Lesson lesson;
	
	public LessonScreen(Lesson lesson) {
		this.lesson = lesson;
		
		Label name = new Label(lesson.getName());
		Label difficulty = new Label(lesson.getDifficulty());
		Label bpm = new Label("" + lesson.getBpm());
		Label description = new Label(lesson.getDescription());
		
		VBox layout = new VBox(
				20,
				name,
				difficulty,
				bpm,
				description );
	}
}
