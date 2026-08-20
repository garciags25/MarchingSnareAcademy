package com.marchingSnare;
import java.util.ArrayList;

public class LessonManager {
	private ArrayList<Lesson> lessonList = new ArrayList<>();
	
	public void addLesson(Lesson lesson) {
		lessonList.add(lesson);
	}
	
	public ArrayList<Lesson> getLessons() {
		return lessonList;
	}
	
	public LessonManager() {
		Lesson lesson1 = new Lesson("Quarter Notes", "Temporary Description", "Beginner", 80);
		Lesson lesson2 = new Lesson("Eighth Notes", "Temporary Description", "Beginner", 80);
		Lesson lesson3 = new Lesson("Sixteenth Notes", "Temporary Description", "Beginner", 80);
		addLesson(lesson1);
		addLesson(lesson2);
		addLesson(lesson3);
	}
}
