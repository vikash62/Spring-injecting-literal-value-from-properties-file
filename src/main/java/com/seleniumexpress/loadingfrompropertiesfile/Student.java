package com.seleniumexpress.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
  private String name;
  private String intrestedCourse;
  private String hobby;

  @Value("${student.name}")
public void setName(String name) {   
	this.name = name;
}
 
  @Required
  @Value("${student.intrestedCourse}")

public void setIntrestedCourse(String intrestedCourse) {
	this.intrestedCourse = intrestedCourse;
}
  @Value("football")
public void setHobby(String hobby) { 
	this.hobby = hobby;
}
   public void displayStudentInfo() {
	   System.out.println("student name "+ name);
	   System.out.println("student intrestedCourse "+ intrestedCourse);
	   System.out.println("student hobby "+ hobby);
   
   }
  
}
