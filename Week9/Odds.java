public class Odds {
	public static void main(String[] args) {
		boolean result = allDigitsOdd(135319);
		System.out.println(result);
	}
	public static boolean allDigitsOdd(int num) {
		
		int tens = 1;
		int digitCount = 0;
		int test = 2;

		while (tens <= num) {
			tens = tens * 10;
			++digitCount;
		}
		for (int j = 0; j <= digitCount; ++j) {
			if (num % test == 0) {
				return false;
			} else {
				test = test * 10;
			}
		}
		return true;
	}
}
