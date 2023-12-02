public class range {
	public static void main(String[] args) {
		
		int[] a1 = {8, 3, 5, 7, 2, 4};
		int[] a2 = {3, 10000000, 5, -29, 4};

		int value = range(a1);
		int value2 = range(a2);
		System.out.println("range" + a1 + " returns " + value);
		System.out.println("range" + a2 + " returns " + value2);
	}
	public static int range(int[] arr) {
		int lowest = arr[0];
		int highest = arr[1];

		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] > highest) {
				highest = arr[i];
			}
			if (arr[i] < lowest) {
				lowest = arr[i];
			}
		}
		return (highest - lowest + 1);
	}
}
