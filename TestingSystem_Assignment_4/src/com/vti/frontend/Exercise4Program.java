package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.Exercise4;
import com.vti.backend.QLCB;

public class Exercise4Program {

	public static void main(String[] args) {
		Exercise4 ex4  = new Exercise4();
		Exercise4.question1();
	}
	
	private static void menuquestion1() {
		System.out.println("=============MENU==============");
		System.out.println("======  1.Thêm cán bộ     =====");
		System.out.println("======  2.Hiện thông tin  =====");
		System.out.println("======  3.Tìm cán bộ      =====");
		System.out.println("======  4.Xóa cán bộ      =====");
		System.out.println("======  0.Thoát           =====");
		System.out.println("===============================");
	}
	
	public static void question2() {
		QLCB ql = new QLCB(); 
		byte chooses;
		do {
			Scanner sc = new Scanner(System.in);
			menuquestion1();
			chooses = sc.nextByte();
			switch(chooses) {
			case 1:
				ql.addcanbo();
				break;
			case 2:
				ql.showif();
				break;
			case 3:
				ql.findcanbo();
				break;
			case 4:
				ql.deletecanbo();
				break;
			default:
				System.out.println("Nhập sai");
				System.out.println("Nhập lại");
				break;
			}
		}while(chooses != 0);
	}

}
