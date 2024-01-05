//accept any number find sum of digit 

import java.util.Scanner;

public class WhileA1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt(),rn=0,r;
		while(n>0) {
			r = n%10;
			rn = rn+r;
			n = n/10;
		}
		System.out.println("Sum of digit is: "+ rn);
	}
}