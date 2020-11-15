package com.vti.entity;

import java.time.LocalDate;


public class Exam {
	private int id;
	private String code;
	private String title;
	private CategoryQuestion[] categoryQuestion;
	private int duration;
	private Account account;
	private LocalDate createDate;
	private Question[] questions;
	
	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	public String getcode() {
		return code;
	}
	
	public void setcode(String code) {
		this.code = code;
	}
	
	public String gettitle() {
		return title;
	}
	
	public void settitle(String title) {
		this.title = title;
	}
	
	public CategoryQuestion[] categoryQuestion() {
		return categoryQuestion;
	}
	
	public void setCategoryQuestion(CategoryQuestion[] categoryQuestion) {
		this.categoryQuestion = categoryQuestion;
	}
	
	public int duration() {
		return duration;
	}
	
	public void setduration(int duration) {
		this.duration = duration;
	}
	
	public Account getaccount() {
		return account;
	}
	
	public void setaccount(Account account) {
		this.account = account;
	}
	
	public LocalDate getcreatedate() {
		return createDate;
	}
	
	public void getcreatdate(LocalDate createDate) {
		this.createDate = createDate;
	}
	
	public Question[] getquestions() {
		return questions;
	}
	
	public void setquestions(Question[] questions) {
		this.questions = questions;
	}
}
