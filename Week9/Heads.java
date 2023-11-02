import java.util.*;

public class Heads {
	public static void main(String[] args) {
		threeHeads();
	}
	public static void threeHeads() {
		Random flip = new Random();
		int value;
		int heads = 0;

		while (heads < 3) {
			
			value = flip.nextInt(2);
			if (value == 1) {
				System.out.print("H ");
				++heads;
			} else if (value == 0) {
				System.out.print("T ");
				heads = 0;
			}
		}
		System.out.println("\nThree heads in a row!");
	}
}

