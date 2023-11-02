import java.util.*;

public class Score {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		printGPA(console);
		printGPA(console);
		printGPA(console);
	}
	public static void printGPA(Scanner console) {
		System.out.print("Enter a student record: ");
		String name = console.next();
		int scores = console.nextInt();
		double total;
		
		int[] gradeNum = new int[scores];

		for (int i = 0; i < scores; ++i) {
			gradeNum[i] = console.nextInt();
		}
		total = gradeNum[0];
		for (int h = 1; h < scores; ++h) {
			total = total + gradeNum[h];
		}
		double average = total / scores;

		System.out.println(name + "'s grade is " + average);
	}
}
