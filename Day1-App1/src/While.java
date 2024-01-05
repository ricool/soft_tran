import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt(),rn=0,r;
		while(n>0) {
			r = n%10;
			rn = rn*10+r;
			n = n/10;
		}
		System.out.println("Revers is: "+ rn);
	}
}
