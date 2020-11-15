package com.vti.entity;

public class Position {
	private int id;
	private String name;
	
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
	
    @Override
    public String toString() {
        return "Position{" + "id=" + id +", name='" + name + '\'' + '}';
    }
}
