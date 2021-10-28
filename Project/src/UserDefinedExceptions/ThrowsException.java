package UserDefinedExceptions;

import java.util.Scanner;

public class ThrowsException {
	public static void main(String args[]) throws ArithmeticException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a / b;
		System.out.println(c);
		int d = a * b;
		System.out.println(d);
	}
}
