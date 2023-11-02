public class starSquare {
	public static void main(String[] args) {
		int star;
		int line;

		for (line = 1; line <= 4; ++line) {
			for (star = 1; star <= 5; ++star) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
