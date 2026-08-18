package com.marchingSnare;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DrumLearningApp extends Application {

    @Override
    public void start(Stage stage) {

        Label title = new Label("Marching Snare Academy");
        Label subtitle = new Label("Learn. Practice. Improve.");

        Button startLearningButton = new Button("Start Learning");
        Button practiceButton = new Button("Practice");
        Button progressButton = new Button("My Progress");
        
        startLearningButton.setOnAction(event -> {
        	System.out.println("Start Learning Button was clicked!");
        }) ;
        
        VBox layout = new VBox(
            20,
            title,
            subtitle,
            startLearningButton,
            practiceButton,
            progressButton
        );

        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 800, 600);

        stage.setTitle("Marching Snare Academy");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);   
    }
}