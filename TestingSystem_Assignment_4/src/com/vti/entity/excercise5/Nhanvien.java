package com.vti.entity.excercise5;

import java.util.Scanner;

public class Nhanvien extends Canbo {
	private String congviec;
	public String getcongviec() {
		return congviec;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập công việc: ");
		congviec = sc.nextLine();
	}
	
	@Override
	public void getif() {
		super.getif();
		System.out.println("Công việc : "+congviec);
	}
}
