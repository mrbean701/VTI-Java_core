package com.vti.entity;

import java.time.LocalDate;

public class Question {
	private int id;
	private String content;
	private CategoryQuestion categoryQuestion;
	private TypeQuestion typeQuestion;
	private Account account;
	private LocalDate createDate;
	
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
	
	public CategoryQuestion getcategoryQuestion() {
		return categoryQuestion;
	}
	
	public void setcategoryQuestion(CategoryQuestion categoryQuestion) {
		this.categoryQuestion = categoryQuestion;
	}
	
	public TypeQuestion gettypeQuestion() {
		return typeQuestion;
	}
	public void settypeQuestion(TypeQuestion typeQuestion) {
		this.typeQuestion = typeQuestion;
	}
	
	public Account getaccount() {
		return account;
	}
	
	public void setaccount(Account account) {
		this.account = account;
	}
	
	public LocalDate getcreateDate() {
		return createDate;
	}
	
	public void setcreateDate(LocalDate creaDate) {
		this.createDate = creaDate;
	}
}
