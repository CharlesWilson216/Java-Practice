public class Digit {
	public static void main(String[] args) {
		int c = lastDigit(183598);

		System.out.println(c);
	}

	public static int lastDigit(int digit) {
		
		int s = 234;

		for (int i = 1000000; i >= 10; i = (i / 10)) {
			s = (digit % i);
		}
		return s;
	}
}

