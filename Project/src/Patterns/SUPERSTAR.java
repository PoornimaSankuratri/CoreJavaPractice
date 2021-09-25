package Patterns;

public class SUPERSTAR {
	public static void main(String args[]) {
		int num = 5;
		patternS(num);
		 System.out.println(); System.out.println("----------------"); patternU(num);
		 System.out.println(); System.out.println("----------------"); patternP(num);
		 System.out.println(); System.out.println("----------------"); patternE(num);
		 System.out.println(); System.out.println("----------------"); patternR(num);
		 System.out.println(); System.out.println("----------------"); patternS(num);
		 System.out.println(); System.out.println("----------------"); patternT(num);
		 System.out.println(); System.out.println("----------------"); patternA(num);
		 System.out.println(); System.out.println("----------------"); patternR(num);
	}

	public static void patternS(int num) {
		printNStars(num);
		System.out.println();
		print1Star(num);
		printNStars(num);
		for (int i = 0; i < num / 2; i++) {
			System.out.println();
			printSpaces(num);
			System.out.print("*");
		}
		System.out.println();
		printNStars(num);
	}

	public static void patternU(int num) {
		for (int i = 0; i < num; i++) {
			printFirstandLaststars(num);
			System.out.println();
		}
		printNStars(num);
	}

	public static void patternP(int num) {
		printNStars(num);
		for (int i = 0; i < num / 2; i++) {
			System.out.println();
			printFirstandLaststars(num);
		}
		System.out.println();
		printNStars(num);
		System.out.println();
		print1Star(num);
		System.out.print("*");
	}

	public static void patternE(int num) {
		printNStars(num);
		System.out.println();
		print1Star(num);
		printNStars(num);
		System.out.println();
		print1Star(num);
		printNStars(num);
	}

	public static void patternR(int num) {
		printNStars(num);
		System.out.println();
		for (int i = 0; i < num / 2; i++) {
			printFirstandLaststars(num);
			System.out.println();
		}
		printNStars(num);
		System.out.println();
		for (int i = 1; i <= num / 2 + 1; i++) {
			System.out.print("*");
			for (int j = 0; j < i * 2; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
	}

	public static void patternT(int num) {
		printNStars(num);
		for (int j = 0; j < num; j++) {
			System.out.println();
			for (int i = 0; i <= num / 2; i++) {
				System.out.print(" ");
			}
			System.out.print(" *");
		}
	}

	public static void patternA(int num) {
		printNStars(num);
		for (int i = 0; i < num / 2; i++) {
			System.out.println();
			printFirstandLaststars(num);
		}
		System.out.println();
		printNStars(num);
		for (int i = 0; i <= num / 2 ; i++) {
			System.out.println();
			printFirstandLaststars(num);
		}
	}

	public static void printNStars(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("* ");
		}
	}

	public static void print1Star(int num) {
		for (int i = 0; i < num / 2; i++) {
			System.out.println("* ");
		}
	}

	public static void printSpaces(int num) {
		for (int i = 2; i < num + num; i++) {
			System.out.print(" ");
		}
	}

	public static void printFirstandLaststars(int num) {
		System.out.print("*");
		for (int j = 0; j < num + num - 3; j++) {
			System.out.print(" ");
		}
		System.out.print("*");
	}

}
