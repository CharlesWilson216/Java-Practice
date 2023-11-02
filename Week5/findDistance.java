public class findDistance {
	public static void main(String[] args) {
		double distance = distance(10, 2, 3, 15);
		System.out.println(distance);
	}
	public static double distance(int x1, int y1, int x2, int y2) {
		double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return d;
	}
}

