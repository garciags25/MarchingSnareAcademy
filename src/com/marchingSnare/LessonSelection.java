package com.marchingSnare;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.layout.CornerRadii;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class LessonSelection {	// lessonSelection displays all lesson cards in a scrollPane for lesson selection
	private LessonManager manager;
	private VBox layout;	// container for all lesson cards
	private ScrollPane scrollPane;	// holds layout
	private LessonSelectionHandler handler;
	
	public LessonSelection(LessonManager manager, LessonSelectionHandler handler, BackHandler backHandler) {
		this.manager = manager;	
		this.handler = handler;
		
		// styling each lesson card
		Color fillColor = Color.ALICEBLUE; // creates background color
		CornerRadii radii = new CornerRadii(20.0); // corner radius
		Insets inset = Insets.EMPTY;
		BackgroundFill backgroundFill = new BackgroundFill(fillColor, radii, inset);
		Background background = new Background(backgroundFill);
		
		layout = new VBox (
				20);
		
		for (int i = 0; i < manager.getLessons().size(); i++) {
			Lesson currLesson = manager.getLessons().get(i); // temporarily stores current lesson in iteration
			
			Label name = new Label(currLesson.getName());
			Label difficulty = new Label(currLesson.getDifficulty());
			Label bpm = new Label("" + currLesson.getBpm());
			Label description = new Label(currLesson.getDescription());
			
			
			Button startLesson = new Button("Start Lesson");
			startLesson.setOnAction(event -> {
				handler.handler(currLesson);
			});
			
			CheckBox checkbox = new CheckBox("Complete");
			checkbox.setSelected(currLesson.getComplete());
			
			checkbox.setOnAction(event -> {
				if (checkbox.isSelected()) {
					currLesson.setComplete(true);
					System.out.println(currLesson.getComplete());
				} else {
					currLesson.setComplete(false);
					System.out.println(currLesson.getComplete());
				}
			});
			
			VBox card = new VBox(	// displays information on each lesson card
					20,		// spacing between child nodes
					name,
					difficulty,
					bpm,
					description,
					checkbox,
					startLesson);
			
			layout.getChildren().add(card);		// adds unique lesson information each iteration
			card.setBackground(background);		// sets background color and corner radius
			card.setPadding(new Insets(30));
			card.setMaxWidth(675.0);
		}
		
		Button backButton = new Button("Go Back");
		backButton.setOnAction(event -> { backHandler.backHandler(); });
		
		HBox leftWrapper = new HBox(backButton);
		leftWrapper.setAlignment(Pos.TOP_LEFT);
		
		layout.getChildren().add(0, leftWrapper);
		layout.setAlignment(Pos.TOP_CENTER);
		layout.setPadding(new Insets(10));
		
		
		scrollPane = new ScrollPane();
		scrollPane.setFitToWidth(true);
		scrollPane.setContent(layout);
			
	}
	
	public ScrollPane getScrollPane() {
		return scrollPane;
	}
	
}
