package com.vti.backend;

import com.vti.entity.ex4.Student;

public class Exercise4 {
	//question1
	public static void question1() {
		Student student1 = new Student("Nam", "Quảng Ninh");
		student1.setscore(9);
		
		Student student2 = new Student("Ngân", "Thanh Hóa");
		student2.setscore(6);
		
		Student student3 = new Student("Huy", "Ninh Bình");
		student3.setscore(7);
		
		System.out.println("Question1");
		System.out.println(student1);
	}
}
