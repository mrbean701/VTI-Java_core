package com.vti.entity.excercise5;

import java.util.Scanner;

public class Kysu extends Canbo {
	private String nganhdaotao;
	
	public String getnganhdaotao() {
		return nganhdaotao;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập ngành đào tạo: ");
		nganhdaotao = sc.nextLine();
	}
	
	@Override
	public void getif() {
		super.getif();
		System.out.println("Ngành đào tạo: "+nganhdaotao);
	}
}
