public class Range {
	public static void main(String[] args) {
		int range = digitRange(68437);
		System.out.println("Range: " + range);
	}
	public static int digitRange(int num) {
		
		int digit;
		int test1;
		int test2;
		int high = -1;
		int low = 10;

		System.out.println("Integer: " + num);
		
		//if the integer to be tested is one digit long return 1 
		if (num / 10 < 1 && num / 10 >= 0) {
			return 1;
		}

		//do the first arithmetic step so its value can be stored in test1
		digit = num % 10;
		num = num / 10;

		while (num > 0) {
			
			// iterate through digits and save them in a variable called diigt
			//then rotate the curret value of digit between test1 and test2 so they may be compared
			test1 = digit;
			digit = num % 10;
			num = num / 10;
			test2 = digit;
			
			//test for the lowest digit
			if (low > test1 || low > test2) {
				low = Math.min(test1, test2);
			}

			//test for the highest digit
			if (high < test1 || high < test2) {
				high = Math.max(test1, test2);
			}
		}

		//calculate the range and return its value
		return (high - low + 1);
	}
}
