public class Vowels {
	public static void main(String[] args) {
		String test = "i think, therefore i am";
		int[] count = vowelCount(test);
		for (int i = 0; i < count.length; ++i) {
			System.out.println(count[i]);
		}
	}
	public static int[] vowelCount(String words) {
		int[] vowels = new int[5];
		words = words.toLowerCase();
		for (int i = 0; i < words.length(); ++i) {
			if (words.charAt(i) == 'a') {
				++vowels[0];
			} else if (words.charAt(i) == 'e') {
				++vowels[1];
			} else if (words.charAt(i) == 'i') {
				++vowels[2];
			} else if (words.charAt(i) == 'o') {
				++vowels[3];
			} else if (words.charAt(i) == 'u') {
				++vowels[4];
			}
		}
		return vowels;
	}
}
