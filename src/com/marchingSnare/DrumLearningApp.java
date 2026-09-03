package com.marchingSnare;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DrumLearningApp extends Application {
	private Stage stage;
	private LessonManager manager = new LessonManager();
	
    @Override
    public void start(Stage stage) {
    	this.stage = stage;
    	MainMenu menu = new MainMenu(event -> { startLearning(); });

        Scene scene = new Scene(menu.getLayout(), 800, 600);

        this.stage.setTitle("Marching Snare Academy");
        this.stage.setScene(scene);
        this.stage.show();
        
    }
    
    public void startLearning() {
    	LessonSelection lessons = new LessonSelection(manager);
    	Scene lessonScene = new Scene(lessons.getScrollPane(), 800, 600);
    	stage.setScene(lessonScene);
    }
    
    public static void main(String[] args) {
        launch(args);   
    }
}