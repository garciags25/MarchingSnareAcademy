package com.marchingSnare;
import javafx.scene.layout.VBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.layout.CornerRadii;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;

public class LessonSelection {
	LessonManager manager;
	private VBox layout;	// container for all lesson cards
	private ScrollPane scrollPane;	// holds layout
	
	public LessonSelection(LessonManager manager) {
		this.manager = manager;	
		
		// styling each lesson card
		Color fillColor = Color.ALICEBLUE; // creates background color
		CornerRadii radii = new CornerRadii(20.0); // corner radius
		Insets inset = Insets.EMPTY;
		BackgroundFill backgroundFill = new BackgroundFill(fillColor, radii, inset);
		Background background = new Background(backgroundFill);
		
		layout = new VBox (
				20);
		
		for (int i = 0; i < manager.getLessons().size(); i++) {
			Label name = new Label(manager.getLessons().get(i).getName());
			Label difficulty = new Label(manager.getLessons().get(i).getDifficulty());
			Label bpm = new Label("" + manager.getLessons().get(i).getBpm());
			Label description = new Label(manager.getLessons().get(i).getDescription());
			
			Button startLesson = new Button("Start Lesson");
			
			VBox card = new VBox(	// displays information on each lesson card
					20,		// spacing between child nodes
					name,
					difficulty,
					bpm,
					description,
					startLesson);
			
			layout.getChildren().add(card);		// adds unique lesson information each iteration
			card.setBackground(background);		// sets background color and corner radius
			card.setPadding(new Insets(30));
			card.setMaxWidth(675.0);
		}
		
		layout.setAlignment(Pos.TOP_CENTER);
		scrollPane = new ScrollPane();
		scrollPane.setFitToWidth(true);
		scrollPane.setContent(layout);
			
	}
	
	public ScrollPane getScrollPane() {
		return scrollPane;
	}
	
}
