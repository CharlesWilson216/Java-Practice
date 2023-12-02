public class isSorted {
	public static void main(String[] args) {
		double[] test = {16.1, 12.3, 22.2, 14.4};
		double[] test2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};

		boolean value = isSorted(test);
		boolean value2 = isSorted(test2);

		System.out.println(value + " " + value2);
	}
	public static boolean isSorted(double[] arr) {
		
		for (int i = 0; i < arr.length - 1; ++i) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
