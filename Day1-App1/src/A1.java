import java.util.Scanner;

public class A1 {

	
//1.⁠ ⁠Write a program to read a weekday number and print weekday name using switch statement

//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Select weekday Number from 1-7");
//		int day= s.nextInt();
//		
//		if(day>7) {
//			switch(day) {
//			case 1:
//				System.out.println("Mon"); break;
//			case 2:
//				System.out.println("Tue"); break;
//			case 3:
//				System.out.println("Wed"); break;
//			case 4:
//				System.out.println("Thu"); break;
//			case 5:
//				System.out.println("Fri"); break;
//			case 6:
//				System.out.println("Sat"); break;
//			case 7:
//				System.out.println("Sun"); break;
//			}
//		}
//		else {
//			System.out.println("Invalid Number.");
//		}
//	}
//
//}
	
	
//2. Write a program to read gender(M/F) and print the corresponding gender using a switch statement
//	public static void main(String[] args) {
//	Scanner s = new Scanner(System.in);
//	System.out.println("Gender 1.Male 2.Female:");
//	int gen= s.nextInt();
//	
//	if(gen>0 && gen<=2) {
//		switch(gen) {
//			case 1: System.out.println("Male"); break;
//			case 2: System.out.println("Female"); break;
//		}	
//	}
//	else {
//		System.out.println("Invalid choice");
//	}
//	}
//}
	
//3.⁠ ⁠Write a program to Check whether a character is a vowel or consonant using switch statement
//	public static void main(String[] args) {
//	Scanner s = new Scanner(System.in);
//	System.out.println("Write Char:");
//	char v= s.next().charAt(0);
//	
//	if(v>='a' && v<='z') {
//		switch(v) {
//		case 'a': 
//		case 'e': 
//		case 'i': 
//		case 'o': 
//		case 'u': 
//			System.out.println("Vowel: "+ v);
//		default:
//			System.out.println("Constant: "+ v);
//		}
//		
//	}
//	else {
//		System.out.println("Not a character.");
//	}
//	
//	}
//}
	
//4. Write a program to Check whether the number is even or odd using switch statement
//	public static void main(String[] args) {
//	Scanner s = new Scanner(System.in);
//	System.out.println("Number:");
//	int n= s.nextInt();
//	switch(n%2) {
//		case 0: System.out.println("Even"); break;
//		case 1: System.out.println("Odd"); break;
//	}
//	
//}
//}

//5. Write a program to Find the number of days in a month using a switch statement
//	public static void main(String[] args) {
//	Scanner s = new Scanner(System.in);
//	System.out.println("Month in Number [1-12]:");
//	int n= s.nextInt();
//	if(n>=1 && n<=12) {
//		switch(n) {
//		case 2:
//			System.out.println("28 dayss"); break;
//		
//		case 1: 
//		case 3: 
//		case 5: 
//		case 7: 
//		case 8: 
//		case 10:
//		case 12: 
//			System.out.println("31 Dayss"); break;
//			
//		case 4:
//		case 6: 
//		case 9: 
//		case 11: 
//			System.out.println("30 dayss"); break;
//		}
//	}
//	else {
//		System.out.println("Invalid Month");
//	}
//	
//}
//}
	
//6. Write a program to create simple calculator using switch Statement
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("A:");
		int a= s.nextInt();
		System.out.println("B:");
		int b= s.nextInt();
		System.out.println("Select Any in number [1-4]:\n1. Add\n2. Sub\n3. Multi\n4. Div");
		int choice = s.nextInt();
		switch(choice){
			case 1:
				System.out.println("A + B ="+ (a+b)); break;
			case 2:
				System.out.println("A - B ="+ (a-b)); break;
			case 3:
				System.out.println("A x B ="+ (a*b)); break;
			case 4:
				System.out.println("A / B ="+ (a/b)); break;
			default:
				System.out.println("Invalid Choice.");
		}
	}
}