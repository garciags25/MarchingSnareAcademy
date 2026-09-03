package com.marchingSnare;
import javafx.scene.layout.VBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Label;

public class LessonSelection {
	LessonManager manager;
	private VBox layout;
	private ScrollPane scrollPane;
	
	public LessonSelection(LessonManager manager) {
		this.manager = manager;
		
		Label test = new Label("testing");
		
		layout = new VBox (
				20,
				test);
		scrollPane = new ScrollPane();
		
		scrollPane.setContent(layout);
	}
	
	public ScrollPane getScrollPane() {
		return scrollPane;
	}
	
}
