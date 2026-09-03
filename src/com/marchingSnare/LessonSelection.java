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
		
		layout = new VBox (
				20);
		
		for (int i = 0; i < manager.getLessons().size(); i++) {
			Label name = new Label(manager.getLessons().get(i).getName());
			Label difficulty = new Label(manager.getLessons().get(i).getDifficulty());
			Label bpm = new Label("" + manager.getLessons().get(i).getBpm());
			Label description = new Label(manager.getLessons().get(i).getDescription());
			
			VBox card = new VBox(
					name,
					difficulty,
					bpm,
					description);
			
			layout.getChildren().add(card);
		}
		
		scrollPane = new ScrollPane();
		
		scrollPane.setContent(layout);
			
	}
	
	public ScrollPane getScrollPane() {
		return scrollPane;
	}
	
}
