public class Window {
	public static void main(String[] args) {
		
		pluses();
		tallness();
		pluses();
		tallness();
		pluses();
	
	}
	public static final int SIZE = 10;

	public static void wideness() {
		
		int space;

		System.out.print("|");
		for (space = 1; space <= SIZE; ++space) {
			System.out.print(" ");
		}
		System.out.print("|");
		for (space = 1; space <= SIZE; ++space) {
			System.out.print(" ");
		}
		System.out.println("|");
	}

	public static void pluses() {
		
		int amount;

		System.out.print("+");
		for (amount = 1; amount <= SIZE; ++amount) {
			System.out.print("=");
		}
		System.out.print("+");
		for (amount = 1; amount <= SIZE; ++amount) {
			System.out.print("=");
		}
		System.out.println("+");
	}
	public static void tallness() {
		
		int tall;

		for (tall = 1; tall <= SIZE; ++tall) {
			wideness();
		}
	}
}

