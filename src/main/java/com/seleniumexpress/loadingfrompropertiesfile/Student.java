package com.seleniumexpress.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	  @Value("${student.name}")
  private String name;
	  @Value("${student.intrestedCourse}")
  private String intrestedCourse;
	  @Value("football")
  private String hobby;

   public void displayStudentInfo() {
	   System.out.println("student name "+ name);
	   System.out.println("student intrestedCourse "+ intrestedCourse);
	   System.out.println("student hobby "+ hobby);
   
   }
  
}
