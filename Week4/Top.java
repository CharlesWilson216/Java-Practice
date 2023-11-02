public class Top {
	public static void main(String[] args) {
		topstick();
		topstars();
		middle();
		bottomstars();
		bottomstick();
		bottom();
	}
	public static final int SIZE = 20;

	public static void bottom() {
		int line;
		int amount;

		for (line = 1; line <= SIZE; ++line) {
			for (amount = 1; amount <= SIZE * 2; ++amount) {
				System.out.print("=");
			}
			System.out.println();
		}
	}
	public static void bottomstick() {
		int i;
		int lineNumber;
		int star;

		for (i = 1; i <= SIZE * 3; ++i) {	       
			printspaces();
			System.out.println("||");
		}
	}
	public static void middle() {
		int i;

		for (i = 1; i <= SIZE * 2; ++i) {
			System.out.print("=");
		}
		System.out.println();
	}
	public static void topstick() {
		int i;
		
		for (i = 1; i <= SIZE + 1; ++i) {
			printspaces();
			System.out.println("||");
		}
	}
	public static void topstars() {
		int spaces;
		int starsleft;
		int i;
		int starsright;

		for (spaces = SIZE - 1; spaces >= 0; --spaces) {
			for (i = 1; i <= spaces; ++i) {
					System.out.print(" ");
				}
			for (starsleft = spaces + 1; starsleft <= SIZE - 1; ++starsleft) {				
				System.out.print("*");
				}
			System.out.print("||");
			for (starsright = spaces + 1; starsright <= SIZE - 1; ++starsright) {
				System.out.print("*");
				}
				System.out.println();
			}
		
	}
	public static void bottomstars() {
		int spaces;
		int starsleft;
		int i;
		int starsright;

		for (spaces = SIZE - 2; spaces >= (-1); --spaces) {
			for (i = SIZE - 3; i >= spaces; --i) {
			       System.out.print(" ");
			}
	 		for (starsleft = spaces; starsleft >= 0; --starsleft) {
				System.out.print("*");
			}		
			System.out.print("||");
			for (starsright = spaces; starsright >= 0; --starsright) {
				System.out.print("*");
			}
			System.out.println();
		}
}
	public static void printspaces() {
		int spaces;
		int i;

		for (i = 1; i <= SIZE - 1; ++i) {
			System.out.print(" ");
		}
	}
}
