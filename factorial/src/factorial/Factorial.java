package factorial;
import java.util.Scanner;

public class Factorial {
	public int factorial(int x) {
		int f = 1,i;
		for(i = 1; i <= x; i++) {
			f = f*i;
		}
		return f;
	}
	
	public static void main(String[] args) {
		int n, fact;
		System.out.println("Enter a number: ");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Factorial facto = new Factorial();
		fact = facto.factorial(n);
		System.out.println(fact);
		
	}
}



