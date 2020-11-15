package com.vti.entity.excercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class Canbo {
	private String fullname;
	private byte age;
	private Gender gioitinh;
	private String add;
	
	public String getfullname() {
		return fullname;
	}
	
	public Byte getage() {
		return age;
	}
	
	public void setgioitinh(int gioitinh) {
		if(gioitinh == 0) {
			this.gioitinh = Gender.valueOf("MALE");
		}else if(gioitinh == 1) {
			this.gioitinh = Gender.valueOf("FEMALE");
		}else {
			this.gioitinh = Gender.valueOf("UNKNOWN");
		}
	}
	
	public String getadd() {
		return add;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ tên: ");
		fullname = sc.nextLine();
		System.out.println("Nhập tuổi: ");
		age = sc.nextByte();
		System.out.println("Nhập giới tình(0: Nam, 1:Nữ, khác: Unknown): ");
		setgioitinh(sc.nextInt());
		System.out.println("Nhập địa chỉ: ");
		add = sc.nextLine();
	}
	
	public void getif() {
		System.out.println("Họ tên     : "+fullname);
		System.out.println("Tuổi       : "+age);
		System.out.println("Giới tính  : "+gioitinh);
		System.out.println("Địa chỉ    : "+add);
	}
	@Override
	public String toString() {
		return "Canbo{"+"họ tên='"+fullname+'\''+", tuổi" + age+", giới tính="+gioitinh+", địa chỉ='"+add+'\''+'}';
	}
}
