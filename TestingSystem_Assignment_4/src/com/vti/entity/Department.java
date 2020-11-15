package com.vti.entity;

public class Department {
	private	int id;
	private String name;
	
	public Department() {
		
	}
	
	public Department(String name) {
		this.id = 0;
		this.name = name;
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
	
	public void setname() {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Department{" + "id= "+id+", name= '"+name+'\''+ "}";
	}
}
