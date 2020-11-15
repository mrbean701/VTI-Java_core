package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
	private int groupid;
	private String groupname;
	private Account creator;
	private Account[] accounts;
	private LocalDate createDate;
	
	public Group() {

	}
	
	public Group(int groupid, String groupname, Account creator, Account[] accounts, LocalDate createDate) {
		this.groupid = groupid;
		this.groupname = groupname;
		this.accounts = accounts;
		this.createDate = createDate;
	}
	
	public Group(int groupid, String groupname, Account creator, String username, LocalDate createDate) {
		this.groupid = groupid;
		this.groupname = groupname;
		this.creator = creator;
		
		Account[] accounts = new Account[username.length()];
		for(int i = 0; i < username.length(); i++) {
			accounts[i] = new Account(username[i]);
		}
		this.createDate = createDate;
	}
	
	public int getid() {
		return groupid;
	}

	public void setid(int groupid) {
		this.groupid = groupid;
	}

	public String getname() {
		return groupname;
	}

	public void setname(String groupname) {
		this.groupname = groupname;
	}

	public Account[] getaccounts() {
		return accounts;
	}

	public void setaccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public Account getcreator() {
		return creator;
	}

	public void setcreator(Account creator) {
		this.creator = creator;
	}

	public LocalDate getcreatedate() {
		return createDate;
	}

	public void setcreatedate(LocalDate createDate) {
		this.createDate = createDate;
	}
	
	@Override
	public String toString() {
		return "Group{" + "id=" + groupid + ", name='" + groupname + '\'' + ", creator='" + creator + '\'' + ", createDate='"
				+ createDate + ", accounts=" + Arrays.toString(accounts) + '}';
	}
}
