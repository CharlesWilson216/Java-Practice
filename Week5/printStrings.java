public class printStrings {
	public static void main(String[] args) {
		printStrings("abc", 5);
	}

	public static void printStrings(String s, int x) {
		
		int i;

		for (i = 0; i <= x; ++i) {
			System.out.print(s);
		}
	}
}
