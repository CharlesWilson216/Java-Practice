public class Multiples {
	public static void main(String[] args) {
		printMultiples(6, 9);
		printMultiples(-4, 3);
		printMultiples(0, 5);
	}
	public static void printMultiples(int number, int howMany) {
		
		int multiple = number;

		//print the sentence and the first multiple
		System.out.print("The first " + howMany + " multiples of " + number + " are " + number);

		//iterate throught multiples, i = 2 because we already printed the first one
		for (int i = 2; i <= howMany; ++i) {
			multiple = multiple + number;
			System.out.print(", " + multiple);
		}
		System.out.println();
	}
}

