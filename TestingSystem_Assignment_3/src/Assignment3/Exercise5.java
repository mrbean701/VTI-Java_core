package Assignment3;

public class Exercise5 {

	public static void main(String[] args) {
		Department[] departments = new Department[5];

		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketing";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Boss of director";

		Department department4 = new Department();
		department4.id = 4;
		department4.name = "Waiting room";

		Department department5 = new Department();
		department5.id = 5;
		department5.name = "Accounting";
		question1(department1);
		departments[0] = department1;
		departments[1] = department2;
		departments[2] = department3;
		departments[3] = department4;
		departments[4] = department5;
		question2(departments);
	    question3(department1);
		question4(department1);
		question5(department1, department2);
		question6(departments);
	    question7(departments);
		
		
		}
	//question1
	public static void question1(Department department) {
		System.out.println("Question1: ");
		System.out.println(department);
		System.out.println("\n");
	}
	
	//question2
	public static void question2(Department[] departments) {
		System.out.println("Question2: ");
		for(Department department : departments) {
			System.out.println(department);
		}
		System.out.println("\n");
	}
	
	//question3
	public static void question3(Department department) {
		System.out.println("Question3: ");
		System.out.println(department.hashCode());
		System.out.println("\n");
	}
	
	//question4
	public static void question4(Department department) {
		System.out.println("Question4: ");
		if(department.name.equals("Phòng A")) {
			System.out.println("Có tên là phòng A");
		}else {
			System.out.println("Không có tên là phòng A");
		}
		System.out.println("\n");
	}
	
	//question5
	public static void question5(Department department1,Department department2) {
		System.out.println("Question5: ");
		if(department1.equals(department2)) {
			System.out.println("Hai phòng ban bằng nhau");
		}else {
			System.out.println("Hai phòng ban không bằng nhau");
		}
		System.out.println("\n");
	}
	
	//question6
	public static void question6(Department[] departments) {
		System.out.println("Question6: ");
		for(int i = 0; i < departments.length; i++) {
			for(int j = 0; j < departments.length - 1; j++) {
				if(departments[i].name.compareToIgnoreCase(departments[j].name) < 0) {
					Department temp = departments[i];
					departments[i] = departments[j];
					departments[j] = temp;
				}
			}
		}
		for(Department department : departments) {
			System.out.println(department);
			}
		System.out.println("\n");
	}
	
	//question7
	public static void question7(Department[] departments) {
		System.out.println("Question7: ");
		for(int i = 0; i < departments.length; i++) {
			String reverseNameDepartment = reverseWords(departments[i].name);
			for(int j = 0; j < departments.length; j++) {
				String reversenameComparingDepartment = reverseWords(departments[j].name);
				if(reverseNameDepartment.compareToIgnoreCase(reversenameComparingDepartment) < 0) {
					Department temp = departments[i];
					departments[i] = departments[j];
					departments[j] = temp;
				}
			}
		}
		for(Department department : departments) {
			System.out.println(department);
		}
	}
	private static String reverseWords(String str) {
		str = str.trim();
		str = str.replaceAll("\\s", " ");
		String[] words = str.split(" ");
		str="";
		for(int i = words.length - 1; i >= 0; i--) {
			str += words[i] + " ";
		}
		return str.substring(0, str.length() -2);
	}
}
