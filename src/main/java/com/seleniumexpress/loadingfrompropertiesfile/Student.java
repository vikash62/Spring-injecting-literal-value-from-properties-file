package com.seleniumexpress.loadingfrompropertiesfile;

public class Student {
  private String name;
  private String intrestedCourse;
  private String hobby;

public void setName(String name) {   
	this.name = name;
}

public void setIntrestedCourse(String intrestedCourse) {
	this.intrestedCourse = intrestedCourse;
}

public void setHobby(String hobby) { 
	this.hobby = hobby;
}
   public void displayStudentInfo() {
	   System.out.println("student name "+ name);
	   System.out.println("student intrestedCourse "+ intrestedCourse);
	   System.out.println("student hobby "+ hobby);
   
   }
  
}
