package Assignment2;

import java.util.Scanner;

public class Exercise1 {
	//Question1
	public static void question1() {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b;
		double c;
		b = a * 2.54;
		c = b * 12;
		System.out.println(a + "cm = " + b + "inch");
		System.out.println(a + "cm = " + c + "foot");
	}
	
	//Question2
	public static void question2() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int h = 0;
		h = i / 3600;
		int s = 0;
		s = i % 3600;
		System.out.print(h + ":");
	}

	//Question3
	public static void question3(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int max = 0;
		if(a > b && a > c && a > d) {
			max = a;
		}else if(b > a && b > c && b > d) {
			max = b;
		}else if(c > a && c > b && c > d) {
			max = c;
		}else if(d > a && d > b && d > c) {
			max = d;
		}
		System.out.println("max = " + max);
		int min = 0;
		if(a < b && a < c && a < d) {
			min = a;
		}else if(b < a && b < c && b < d) {
			min = b;
		}else if(c < a && c < b && c < d) {
			min = c;
		}else if(d < a && d< b && d < c) {
			min = d;
		}
		System.out.println("min = "+min);
	}
	
	//Question4
	public static void question4() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a - b > 0) {
			System.out.println("[Số thứ nhất lớn hơn số thứ hai]");
		}else if( a - b < 0) {
			System.out.println("[Số thứ nhất nhỏ hơn số thứ hai]");
		}
	}
	
	//Question5
	public static void question5() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a % b == 0) {
			System.out.println("a chia hết cho b");
		}else {
			System.out.println("a không chia hết cho b");
		}
	}
	 
	//Question6
	public static void question6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập điểm toán: ");
		float t = sc.nextFloat();
		System.out.println("Nhập điểm lý: ");
		float l = sc.nextFloat();
		System.out.println("Nhập điểm hóa: ");
		float h = sc.nextFloat();
		float tb = ((t * 2) + l + h) / 2;
		if(tb >= 9.0) {
			System.out.println("Loại xuất sắc");
		}else if(tb <= 8.0 && tb < 9.0) {
			System.out.println("Loại giỏi");
		}else if(tb <= 7.0 && tb < 8.0) {
			System.out.println("Loại khá");
		}
	}

	public static void main(String[] args) {
		question1();
		question2(); 
		question3();
		question4();
		question5();
		question6();
	}
}
