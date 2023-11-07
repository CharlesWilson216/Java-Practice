import java.util.*;

public class IntsvsReal {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		scannerYouTyped(console);
	}
	public static void scannerYouTyped(Scanner console) {
		System.out.print("Type a number: ");

		if (console.hasNextInt()) {
			int num = console.nextInt();
			System.out.println("You typed the integer: " + num);
		} else if (console.hasNextDouble()) {
			double real = console.nextDouble();
			System.out.println("You typed the real number: " + real);
		}
	}
}
