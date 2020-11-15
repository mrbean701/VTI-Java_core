package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.excercise5.Canbo;
import com.vti.entity.excercise5.Kysu;
import com.vti.entity.excercise5.Nhanvien;
import com.vti.entity.excercise5.congnhan;

public class QLCB {

	//excercise5 question2
	private ArrayList<Canbo> canbos;
	public QLCB(){
		canbos = new ArrayList<>();
	}
	//thêm cán bộ mới
	public void addcanbo() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số cán bộ muốn thêm: ");
		n = sc.nextInt();
		
		byte chooses;
		Canbo canBo = new Canbo();
		for(int i = 0; i < n; i++) {
			System.out.println("Chọn loại cán bộ muốn thêm(1: công nhân, 2: kỹ sư, 3: nhân viên): ");
			chooses = sc.nextByte();
			
			switch(chooses) {
			case 1:
				canBo = new congnhan();
				break;
			case 2:
				canBo = new Kysu();
				break;
			case 3:
				canBo = new Nhanvien();
				break;
				default:
					System.out.println("Chọn sai");
					System.out.println("Chọn lại");
					i--;
					break;
			}
			canBo.nhap();
			canbos.add(canBo);
		}
	}
	
	//tìm kiếm họ tên
	public void findcanbo() {
		Scanner sc = new Scanner(System.in);
		String fullname;
		System.out.println("Nhập họ tên cán bộ cần tìm: ");
		fullname = sc.nextLine();
		for(Canbo canBo : canbos) {
			if(fullname.equals(canBo.getfullname())) {
				canBo.getif();
			}
		}
	}
	
	//Hiển thị thông tin về danh sách các bộ
	public void showif() {
		for(Canbo canBo : canbos) {
			canBo.getif();
		}
	}
	
	//Nhập vào tên của cán bộ và dalete cán bộ đó
	public void deletecanbo() {
		Scanner sc = new Scanner(System.in);
		String fullname;
		System.out.println("Nhập họ tên cần xóa: ");
		fullname = sc.nextLine();
		canbos.removeIf(cb -> fullname.equals(cb.getfullname()));
	}
}
