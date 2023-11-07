public class Odds2 {
	public static void main(String[] args) {
		boolean call1 = hasAnOddDigit(4822116);
		boolean call2 = hasAnOddDigit(2448);
		boolean call3 = hasAnOddDigit(-7004);
		System.out.println(call1 + "\n" + call2 + "\n" + call3);
	}
	public static boolean hasAnOddDigit(int num) {
		num = Math.abs(num);

		while (num > 0) {
			if (num % 2 != 0) {
				return true;
			}
			num = num / 10;
		}
		return false;
	}
}
