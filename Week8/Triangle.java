public class Triangle {
	public static void main(String[] args) {
		printTriangleType(5, 7, 7);
		printTriangleType(6, 6, 6);
		printTriangleType(5, 7, 8);
		printTriangleType(2, 18, 2);
	}
	public static void printTriangleType(int a, int b, int c) {
		if (a == b && a == c) {
			System.out.println("equilateral");
		} else if (a + b < c || a + c < b || b + c < a) {
			throw new IllegalArgumentException("Side length cannot be longer than the sum of the other two");
			} else if (a == b || a == c || b == c) {
				System.out.println("isosceles");
			} else if (a != b && a != c && b != c) {
				System.out.println("scalene");
			}
	}
}
