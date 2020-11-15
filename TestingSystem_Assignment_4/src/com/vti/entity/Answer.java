package com.vti.entity;


public class Answer {
	private int id;
	private String content;
	private Question question;
	private Boolean isCorrect;
	
	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	public String getcontent() {
		return content;
	}
	
	public void setcontent(String content) {
		this.content = content;
	}
	
	public Question getquestion() {
		return question;
	}
	
	public void setquestion(Question question) {
		this.question = question;
	}
	
	public Boolean getcorrect() {
		return isCorrect;
	}
	
	public void setcorrect(Boolean correct) {
		isCorrect = correct;
	}
}
