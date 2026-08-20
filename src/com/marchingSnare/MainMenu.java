package com.marchingSnare;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MainMenu {
		LessonManager manager = new LessonManager();
		private VBox layout;
		
	public MainMenu() {
		Label title = new Label("Marching Snare Academy");
        Label subtitle = new Label("Learn. Practice. Improve.");

        Button startLearningButton = new Button("Start Learning");
        Button practiceButton = new Button("Practice");
        Button progressButton = new Button("My Progress");
        
        startLearningButton.setOnAction(event -> {
        	System.out.println("Start Learning Button was clicked!");
        }) ;
        
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
