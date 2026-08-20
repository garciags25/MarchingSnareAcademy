package com.marchingSnare;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DrumLearningApp extends Application {

    @Override
    public void start(Stage stage) {
    	MainMenu menu = new MainMenu();

        Scene scene = new Scene(menu.getLayout(), 800, 600);

        stage.setTitle("Marching Snare Academy");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);   
    }
}