package com.vti.entity.excercise5;

import java.util.Scanner;

public class congnhan extends Canbo {
	private byte level;
	
	public byte getlevel() {
		return level;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập cấp bậc của công nhân: ");
		level = sc.nextByte();
	}
	
	@Override
	public void getif() {
		super.getif();
		System.out.println("Bậc : "+level);
	}
}
