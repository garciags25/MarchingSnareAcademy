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
		Lesson lesson1 = new Lesson("Quarter Notes", "Learn to play Quarter Notes.", "Beginner", 80);
		Lesson lesson2 = new Lesson("Eighth Notes", "Learn to play Eighth Notes.", "Beginner", 80);
		Lesson lesson3 = new Lesson("Sixteenth Notes", "Learn to play Sixteenth Notes", "Beginner", 80);
		Lesson lesson4 = new Lesson("Triplets", "Learn to play Triplet Notes.", "Beginner", 80);
		Lesson lesson5 = new Lesson("Accented Notes", "Learn to play Accented Notes.", "Beginner-Intermediate", 80);
		Lesson lesson6 = new Lesson("Double Stroke Roll", "Learn to play a Double Stroke Roll.", "Intermediate", 80);
		Lesson lesson7 = new Lesson("Flams", "Learn to play a Flam.", "Intermediate", 80);
		Lesson lesson8 = new Lesson("Paradiddles","Learn to play a Paradiddle.","Intermediate",80);
		
		addLesson(lesson1);
		addLesson(lesson2);
		addLesson(lesson3);
		addLesson(lesson4);
		addLesson(lesson5);
		addLesson(lesson6);
		addLesson(lesson7);
		addLesson(lesson8);
	}
}
