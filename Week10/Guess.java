import java.util.*;;

public class Guess {
	public static void main(String[] args) {
		makeGuesses();
	}
	public static void makeGuesses() {
		Random num = new Random();
		int guess = num.nextInt(49) + 1;
		int count = 0;

		while (!(guess >= 48 && guess <= 50)) {
			System.out.println("guess = " + guess);
			guess = num.nextInt(49) + 1;
			++count;
		}
		System.out.println("guess = " + guess);
		System.out.println("total guesses = " + count);
	}
}

