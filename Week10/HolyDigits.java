import java.util.*;

public class HolyDigits {
	public static void main(String[] args) {
		String code = codeCracker();
		System.out.println("The code is: " + code);
	}
	public static String codeCracker() {
		Random newNum = new Random();
		
		int a = newNum.nextInt(10); // one's place
		int b = newNum.nextInt(10); // ten's place
		int c = newNum.nextInt(10); // hundred's place
		int d = newNum.nextInt(10); // thousand's place
		String code;
					
		while (!(a != b && a != c && a != d && b != c && b != d && c != d && a + b + c + d == 25 && d == 2 * b && a % 2 == 0)) {
			a = newNum.nextInt(10);
			b = newNum.nextInt(10);
			c = newNum.nextInt(10);
			d = newNum.nextInt(10);
		}
		String ones = Integer.toString(a);
		String tens = Integer.toString(b);
		String hundreds = Integer.toString(c);
		String thousands = Integer.toString(d);

		code = thousands + hundreds + tens + ones;
		return code;
	}
}


			






