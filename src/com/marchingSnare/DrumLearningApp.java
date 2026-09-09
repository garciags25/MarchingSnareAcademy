package com.marchingSnare;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Stack;

public class DrumLearningApp extends Application implements BackHandler {
	private Stage stage;
	private LessonManager manager = new LessonManager();
	private Lesson lesson;
	private Stack<Scene> stack = new Stack<>();

	
    @Override
    public void start(Stage stage) {
    	this.stage = stage;
    	MainMenu menu = new MainMenu(event -> { startLearning(); });

        Scene scene = new Scene(menu.getLayout(), 800, 600);

        this.stage.setTitle("Marching Snare Academy");
        this.stage.setScene(scene);

        stack.push(scene);
        this.stage.show();
        
    }
    
    public void startLearning() {
    	stack.push(stage.getScene());
    	LessonSelection lessons = new LessonSelection(manager, lesson -> startLesson(lesson, this), this);
    	Scene lessonScene = new Scene(lessons.getScrollPane(), 800, 600);
    	stage.setScene(lessonScene);
    }
    
    public void startLesson(Lesson lesson, BackHandler handler) {
    	stack.push(stage.getScene());
    	this.lesson = lesson;
    	LessonScreen lessonScreen = new LessonScreen(lesson, this);
    	Scene scene = new Scene(lessonScreen.getLayout(), 800, 600);
    	stage.setScene(scene);
    }
    
    public static void main(String[] args) {
        launch(args);   
    }

	@Override
	public void backHandler() {
		if (stack.isEmpty()) {
			return;
		}
		Scene previousScreen = stack.pop();
    	stage.setScene(previousScreen);
		
	}
}