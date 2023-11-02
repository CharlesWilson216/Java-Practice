public class Income {
	public static void main(String[] args) {
		
		double c = pay(4.0, 11);
		System.out.println(c);
	}
	
	public static double pay(double salary, int hours) {

		int c = Math.min(hours, 8);
		double overtime = 0;
		double total = 0;
		int overtimehours = 0;
		double overtimepay = 0;
		double regularpay = 0;

		for (c = Math.max(hours, 8); c > 8; --c) {
			++overtimehours;
		}
		for (int i = 1; i <= overtimehours; ++i) {
			overtimepay = overtimepay + (salary * 1.5);
		}
		for (int h = 1; h <= 8 && h <= hours; ++h) {
			regularpay = regularpay + (salary);
		}
		total = overtimepay + regularpay;
		return total;
	}
}


