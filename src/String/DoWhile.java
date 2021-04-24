package String;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		char choice1;
		// Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		do {
			// System.out.println("Do you want to continue");
			System.out.println("Enter the first number");
			int a = sc.nextInt();
			System.out.println("Enter the second number");
			int b = sc.nextInt();
			add(a, b);
			System.out.println("Do you want to continue");
			String choice = sc.next();
			choice1 = choice.charAt(0);
			
		} while (choice1 == 'y');
	}

	public static void add(int a, int b) {
		System.out.println(a + b);
	}
}
