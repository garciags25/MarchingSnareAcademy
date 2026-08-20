package com.marchingSnare;
import java.util.ArrayList;

public class LessonManager {
	ArrayList<Lesson> lessonList = new ArrayList<>();
	
	public void addLesson(Lesson lesson) {
		lessonList.add(lesson);
	}
	
	public ArrayList<Lesson> getLessons() {
		return lessonList;
	}
}
