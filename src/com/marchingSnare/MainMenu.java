package com.marchingSnare;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MainMenu {
		private VBox layout;
		private EventHandler<ActionEvent> startLearningHandler;
	
	public MainMenu(EventHandler<ActionEvent> event) {
		startLearningHandler = event;
		Label title = new Label("Marching Snare Academy");
        Label subtitle = new Label("Learn. Practice. Improve.");

        Button startLearningButton = new Button("Start Learning");
        Button practiceButton = new Button("Practice");
        Button progressButton = new Button("My Progress");
        
        startLearningButton.setOnAction(startLearningHandler);
        
        layout = new VBox(
            20,
            title,
            subtitle,
            startLearningButton,
            practiceButton,
            progressButton
        );

        layout.setAlignment(Pos.CENTER);
	}
	
	public VBox getLayout() {
		return layout;
	}
}
