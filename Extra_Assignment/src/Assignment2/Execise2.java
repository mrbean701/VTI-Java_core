package Assignment2;

import java.util.Scanner;

public class Execise2 {
	//Question1
	public static int countElement(int arr[], float n, int i) {
		int count = 0;
		for(int j = 0; j < n; j++) {
			if(arr[j] == i) {
				count++;
			}
		}
		return(count);
	}
	public static void question1() {
		System.out.println("Nhập số phần tử của mảng: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập phần tử thứ"+ (i + 1)+" ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Các phần tử trong dãy xuất hiện 1 lần: ");
		for(int i = 0; i < n; i++) {
			if(countElement(arr, n , arr[i]) == 1) {
				System.out.print(" " + arr[i] );
			}
		}
	}

	//Question2
	public static int countElement2(int arr[], float n, int i) {
		int count = 0;
		for(int j = 0; j < n ;j++) {
			if(arr[j] == i) {
				count++;
			}
		}
		return(count);
	}
	public static void question2() {
		System.out.println("Nhập số phần tử của mảng: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n ; i++) {
			System.out.println("Nhập phần tử thứ "+ (i +1)+" ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Các phần tử trong dãy xuất hiện 1 lần: ");
		for(int i = 0; i < n ; i++) {
			if(countElement2(arr, n , arr[i]) == 2) {
				System.out.print(" "+arr[i]);
			}
		}
	}
	
	//Question3
	
	//Question4
	public static void question4() {
		int n, m, total =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên dương bất kỳ: ");
		n = sc.nextInt();
		while(n > 0) {
			m = n % 10;
			n = n / 10;
			total += m;
		}
		System.out.println("Tổng các chữ số: "+ total);
	}
	
	//Question5
	public static int nhapsotn() {
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		int n = 0;
		while (!check) {
			try {
				n = sc.nextInt();
				if(n < 0) {
					System.out.println("Chỉ được nhập số nguyên dương! Nhập lại: ");
					continue;
				}
				check = true;
			}catch(Exception e) {
				System.out.println("Chỉ được nhập số nguyên dương! Nhập lại: ");
			}
		}
		return(n);
	}
	public static boolean  isPrime(int n) {
		boolean check = true;
		if((n == 0) || (n == 1)) {
			return false;
		}else {
			for(int i = 2; i <= (int) Math.sqrt(n); i++) {
				if(n % i == 0) {
					check = false;
					break;
				}
			}
		}
		return check;	
	}
	public static String phantichtn1(int n) {
		int i = 2, count = 0;
		String str = "";
		while (n > 1) {
			if(isPrime(i) && (n % i == 0)) {
				do{
					n = n / i;
					count++;
				}while(n % i == 0);
				str = str +"(" + Integer.toString(i) + "^" + Integer.toString(count) + ")";
			}else {
				i++;
				count = 0;
			}
		}
		str = str.replaceAll("\\^1","");
		return str;
	}
	public static String phantichsnt(int n ) {
		int i = 2;
		String str = "";
		while(n > 1) {
			if(isPrime(i) && (n % i== 0)) {
				str += Integer.toString(i) + ".";
				n = n /i;
			}else {
				i++;
			}
		}
		str = str.substring(0,str.length() - 1);
		return str;
	}
	public static void question5() {
		System.out.println("Nhập số nguyên dương n: ");
		int n = nhapsotn();
		System.out.println(n + " phân tích ra thừa số nguyên tố là: ");
		System.out.println(phantichtn1(n));
	}
	
	//Question6
	public static int isPrime6(int n) {
		if(n < 2) {
			return 0;
		}
		int i;
		int squareRoot = (int)Math.sqrt(n);
		for(i = 2; i <= squareRoot; i++) {
			if(n % i == 0) {
				return 0;
			}
		}
		return 1;
	}
	public static void question6() {
		System.out.println("Nhập n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Tất cả các số nguyên tố nhỏ hơn "+n+" là: ");
		if(n >= 2) {
			System.out.println("2");
		}
		for(int i = 3; i <n ; i+=2) {
			if(isPrime6(i) == 1) {
				System.out.print(" "+ i);
			}
		}
	}
	
	//Question7
	public static boolean isPrime7(int n) {
		if(n < 2) {
			return false;
		}
		int i;
		int squareRoot = (int)Math.sqrt(n);
		for(i = 2; i <= squareRoot; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void question7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = sc.nextInt();
		int count = 0;
		int i = 2;
		while (count < n) {
			if(isPrime7(i)) {
				System.out.println(" "+ i);
				count++;
			}
			i++;
		}
	}
	
	//Question8
	public static int nhap() {
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		int n = 0;
		while(!check) {
			System.out.print(" ");
			try {
				n = sc.nextInt();
				check = true;
			}catch(Exception e) {
				System.out.println("Chỉ được nhập số! Nhập lại: ");
				sc.nextLine();
			}
		}
		return (n);
	}
	public static int UCLN(int a, int b) {
		while(a != b) {
			if(a > b) {
				a = a - b;
			}else {
				b = b - a;
			}
		}
		return (a);
	}
	public static void question8() {
		System.out.println("Nhập a: ");
		int a = nhap();
		System.out.println("Nhập b: ");
		int b = nhap();
		System.out.println("Ước chung lớn nhất của "+a+" và "+ b+ " là " +UCLN(a,b));
		System.out.println("Bội chung lớn nhất của "+a+" và "+b+" là "+((a*b)/UCLN(a,b)));
	}
	
	//Question10
	public static boolean test(int n) {
		StringBuilder xau = new StringBuilder();
		String str = "" + n;
		xau.append(str);
		String check = ""+xau.reverse();
		if(str.equals(check)) {
			return true;
		}else {
			return false;
		}
	}
	public static void question10() {
		int n, count = 0;
		for(n = 100000; n <= 999999; n++) {
			if(test(n)) {
				System.out.println(n);
				count++;
			}
		}
		System.out.println("Có "+count+" số thuận nghịch 6 chữ số");
	}
	
	//Question11
	public static int nhap11() {
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		int n =0;
		while(!check) {
			System.out.println(" ");
			try {
				n = sc.nextInt();
				check = true;
			}catch(Exception e) {
				System.out.println("Chỉ được nhập số nguyên dương! Nhập lại: ");
				sc.nextLine();
			}
		}
		return (n);
	}
	public static void question11() {
		System.out.println("Nhập n: ");
		int n = nhap11();
		int[] arr = new int[n +2 ];
		int i,j,k = n- 1,temp,check = 1;
		for(i = 0; i < n; i++) {
			arr[i] = i+1;
		}
		System.out.println("Các hoán vị kề là: ");
		try {
			i = n - 2;
			while(check > 0) {
				for(j = 0; j < n ; j++) {
					System.out.println(" " + arr[j]);
				}
				for(i = n - 2; i >= 0; i--) {
					check = 1;
					if(arr[i] < arr[i+1]) {
						if(i == n -2 ) {
							temp = arr[i];
							arr[i] = arr[n -1];
							arr[n -1] = temp;
							break;
						}else {
							k = i +1 ;
							for(j = i+ 1; j < n; j++) {
								if(arr[i +1 ]> arr[j] && arr[j] > arr[i]) {
									k = j;
								}
							}
							temp = arr[i];
							arr[i] = arr[k];
							arr[k] = temp;
							for(j = i+ 1; j< n; j++) {
								for(int m = i +1 ; m < n; m++) {
									if(arr[j] < arr[m]) {
										temp = arr[j];
										arr[j] = arr[m];
										arr[m] = temp;
									}
								}
							}
							break;
						}
					}else {
						check = 0;
					}
				}
			}
		}catch(Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		//question1();
		//question2();
	
		//question4();
		//question5();
		//question6();
		//question7();
		//question8();
		
		//question10();
		//question11();
	}
}
