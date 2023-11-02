public class Factors {
	public static void main(String[] args) {
		printFactors(24);
	}
	public static void printFactors(int num) {
		
		System.out.print("1");
		for (int i = 2; i <= num; ++i) {
			if (num % i == 0) {
				System.out.print(" and " + i);
			}
		}
		System.out.println();
	}
}
