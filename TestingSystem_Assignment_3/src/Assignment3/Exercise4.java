package Assignment3;

import java.util.Scanner;


public class Exercise4 {
	//Question1
		public static void question1(){
			System.out.println("Question1: ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập chuỗi: ");
			String s = sc.nextLine();
			String[] word = s.split(" ");
			System.out.println("Số lượng từ trong chuỗi: "+word.length);
			System.out.println("\n");
		}
		
		//Question2
		public static void question2(){
			System.out.println("Question2: ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập chuỗi 1: ");
			String qs1 = sc.nextLine();
			System.out.println("Nhập chuỗi 2: ");
			String qs2 = sc.nextLine();
			System.out.println("Chuỗi sau khi nối: "+qs1.concat(qs2)+"\n");
		}
		
		//Question3
		public static void question3(){
			System.out.println("Question3: ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập tên: ");
			String name1 = sc.nextLine();
			String first = name1.substring(0, 1).toUpperCase();
			String next = name1.substring(1);
			name1 = first + next;
			System.out.println(name1);
			System.out.println("\n");
		}
		
		//Question4
		public static void question4(){
			System.out.println("Question4: ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập tên: ");
			String name = sc.nextLine();
			name = name.toUpperCase();
			for(int i = 0; i < name.length(); i++){
				System.out.println("Ký tự thứ "+i+" là: "+ name.charAt(i));
			}
			System.out.println("\n");
		}
		
		//Qustion5
		public static void question5(){
			System.out.println("Question5: ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập tên: ");
			String firstname = sc.nextLine();
			System.out.println("Nhập họ: ");
			String lastname = sc.nextLine();
			System.out.println("Họ tên: "+lastname+" "+firstname);
			System.out.println("\n");
		}
		
		//Question6
		public static void question6(){
			System.out.println("Quesiton6: ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập họ và tên: ");
			String fullname = sc.nextLine();
			fullname = fullname.trim();
			String[] word = fullname.split(" ");
			String lastname6="",firstname6="",middlename6="";
			lastname6 = word[0];
			firstname6 = word[word.length - 1];
			for(int i = 1; i <= word.length -2; i++){
				middlename6 += word[i]+" ";
			}
			System.out.println("Họ là: "+lastname6);
			System.out.println("Tên đệm là: "+middlename6);
			System.out.println("Tên là: "+ firstname6);
			System.out.println("\n");
		}
		
		//Question7
		public static void question7(){
			System.out.println("Question7: ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập họ và tên: ");
			String fullname7 = sc.nextLine();
			//a
			fullname7 = fullname7.trim();
			fullname7 = fullname7.replace("\\s+"," ");
			String[] word = fullname7.split(" ");
			fullname7 ="";
			//b
			for(String words : word){
				String first7 = words.substring(0, 1).toUpperCase();
				String next7 = words.substring(1);
				words = first7 + next7;
				fullname7 += words + " ";
			}
			System.out.println("Họ và tên: "+fullname7);
			System.out.println("\n");
		}
		
		//Question8
		public static void question8(){
			System.out.println("Question8: ");
			
		}
		
		//Question9
		public static void question9() {
			System.out.println("Question9: ");
			String[] groupnames = {"Java", "C#","C++"};
			for(String groupname : groupnames) {
				if(groupname.equals("Java")) {
					System.out.println(groupname);
				}
			}
		}

		public static void main(String[] args) {
			Group gr1 = new Group();
			gr1.groupid = 1;
			gr1.groupname = "Java";
			
			Group gr2 = new Group();
			gr2.groupid = 2;
			gr2.groupname = "C#";
			
			Group gr3 = new Group();
			gr3.groupid = 3;
			gr3.groupname = "C++";
			//question1();
			//question2();
			//question3();
			//question4();
			//question5();
			//question6();
			//question7();
			//question8();
			question9();
		}

}
