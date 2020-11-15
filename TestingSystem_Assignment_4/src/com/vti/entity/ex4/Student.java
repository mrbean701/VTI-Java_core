package com.vti.entity.ex4;

public class Student {
	private int id;
	private String name;
	private String hometown;
	private float score;
	
	public Student(String name, String hometown) {
		this.name = name;
		this.hometown = hometown;
		this.score = 0;
	}
	
	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String gethometown() {
		return hometown;
	}
	
	public void sethometown(String hometown) {
		this.hometown = hometown;
	}
	
	public float getscore() {
		return score;
	}
	
	public void setscore(float score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		String grade;
		if (score < 4.0) {
			grade = "Yếu";
		} else if (score < 6) {
			grade = "Trung bình";
		} else if (score < 8) {
			grade = "Khá";
		} else {
			grade = "Giỏi";
		}

		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", hometown='" + hometown + '\'' + ", score="+ score + ", xepLoai='" + grade + '\'' + '}';
	}
}
