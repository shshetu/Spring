package com.shetu.springdemo;

public class MyApp {
	public static void main(String[] args) {
		//create the object
		Coach theCoach = new TrackCoach(); //we call the trackCoach
		//use the object
		System.out.println(theCoach.getDailyWorkout());
	}
}
