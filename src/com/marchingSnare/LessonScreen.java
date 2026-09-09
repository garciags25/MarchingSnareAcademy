package com.marchingSnare;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;
import javafx.scene.media.AudioClip;
import java.lang.ClassLoader;
import java.net.URL;

public class LessonScreen {
	private Lesson lesson;
	private VBox layout;
	private Timeline timeline = new Timeline();
	int beat = 0;
	
	public LessonScreen(Lesson lesson) {
		this.lesson = lesson;
		
		Label name = new Label(lesson.getName());
		Label difficulty = new Label(lesson.getDifficulty());
		Label bpm = new Label("" + lesson.getBpm());
		Label description = new Label(lesson.getDescription());
		
		Button startPractice = new Button("Start Practice");
		
		// using Timeline, KeyFrame, URL, and AudioClip to create metronome
		URL normalClickUrl = getClass().getResource("/sounds/NormalClick.wav");
		URL accentedClickUrl = getClass().getResource("/sounds/AccentedClick.wav");
		
		AudioClip normalClick = new AudioClip(normalClickUrl.toString());
		AudioClip accentedClick = new AudioClip(accentedClickUrl.toString());
		
		double millisecondsPerBeat = 60000 / lesson.getBpm();
		Duration duration = new Duration(millisecondsPerBeat);
		KeyFrame keyframe = new KeyFrame(duration, event -> {
			if (beat == 0) {
				accentedClick.play();
				System.out.println("accent click");
				beat++;
			} else {
				normalClick.play();
				System.out.println("normal click");
				beat++;
			}
			if (beat == 4) {
				beat = 0;
			}
		});
		
		timeline.getKeyFrames().add(keyframe);
		timeline.setCycleCount(8);
		
		startPractice.setOnAction(event -> { timeline.play(); normalClick.play();});
		
		layout = new VBox(
				20,
				name,
				difficulty,
				bpm,
				description,
				startPractice);
		
		layout.setAlignment(Pos.TOP_CENTER);
		
	}
	
	public VBox getLayout() {
		return layout;
	}
}
