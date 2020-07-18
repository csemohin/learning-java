import java.util.Scanner;

public class Hello {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Your Name is: "+name);
	}

}
