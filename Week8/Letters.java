public class Letters {
	public static void main(String[] args) {
		int result = secondHalfLetters("ruminates");
		System.out.println(result);
	}
	public static int secondHalfLetters(String letters) {
		int length = letters.length();
		char testChar;
		int result = 0;
		
		letters = letters.toLowerCase();

		for (int i = 0; i < length; ++i) {
			testChar = letters.charAt(i);

			if (testChar >= 'n' && testChar <= 'z') {
				++result;
			}
		}
		return result;
	}
}
