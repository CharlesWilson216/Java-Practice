import java.util.*;

public class Average {
	public static void main(String[] args) {
		scannerAverage3();
	}
	public static void scannerAverage3() {
		Scanner console = new Scanner(System.in);
		
		int num1 = 123456;
		int num2 = 123456;
		int num3 = 123456;
		double average;

		System.out.print("Type an integer: ");

		while (num1 == 123456) {
			if (console.hasNextInt()) {
				num1 = console.nextInt();
				System.out.print("Type an integer: ");
			} else {
				console.nextLine();
				System.out.print("Type an integer: ");
			}
		}
		while (num2 == 123456) {
			if (console.hasNextInt()) {
				num2 = console.nextInt();
				System.out.print("Type an integer: ");
			} else {
				console.next();
				System.out.print("Type an integer: ");
			}
		}
		while (num3 == 123456) {
			if (console.hasNextInt()) {
				num3 = console.nextInt();
			} else {
				console.next();
				System.out.print("Type an integer: ");
			}
		}

		
		
		average = (num1 + num2 + num3) / 3.0;
		System.out.println("Average: " + average);

	}
}
