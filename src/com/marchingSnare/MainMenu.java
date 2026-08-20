package com.marchingSnare;

public class MainMenu {
	public static void main(String []args) {
		LessonManager manager = new LessonManager();
		
		for (int i = 0; i < manager.getLessons().size(); i++) {
			System.out.println(manager.getLessons().get(i).getName());
		}
	}
}
