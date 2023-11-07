public class Months {
	public static void main(String[] args) {
		boolean result = monthApart(6, 14, 9, 21);
		System.out.println(result);
	}
	public static boolean monthApart(int month1, int day1, int month2, int day2) {
		if (month1 == month2) {
			return false;
		} else if (month1 == month2 + 1) {
			if (day1 - day2 == -1) {
				return false;
			}
			if (day1 - day2 <= 0) {
				return true;
			} else {
				return false;
			}
		}
		else if (month1 == month2 - 1) {
			if (day1 - day2 == 1) {
				return false;
			}
			if (day1 - day2 >= 0) {
				return false;
			} else {
				return true;
			}
		}
		return true;
	}
}

