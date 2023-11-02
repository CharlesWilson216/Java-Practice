public class Calendar {
	public static void main(String[] args) {
		
		int days = 31;
		int startdate = 1;

		for (int i = 1; i <= 4; ++i) {	
			System.out.println("\n(" + days + ", " + startdate + ")");
			printHeader();
			printContents(days, startdate);
			border();
			--days;
			++startdate;
		}
	}
	public static void printContents(int days, int startdate) {
		int Current_date = 1;
		int dayofWeek;

		System.out.println();
		for (int weekNumber = 1; weekNumber <= 6; ++weekNumber) {
			for (dayofWeek = 1; dayofWeek <= 7; ++dayofWeek) {
			//	System.out.print("|   *  ");
				for (int k = startdate; k <= startdate && weekNumber == 1 && startdate > 1 && dayofWeek == 1; ++k) {
					dayofWeek = 9 - startdate;
				}
				for (int l = 1; l <= dayofWeek - 1 && weekNumber == 1 && Current_date == 1; ++ l) {
					System.out.print("|      ");
				}
				for (int i = 1; i <= 1 && Current_date <= days; ++i) {
					for (int h = 1; h <= 1 && Current_date < 10; ++h) {
						System.out.print("|   " + Current_date + "  ");
					}
					for (int j = 1; j <= 1 && Current_date >= 10; ++j) {
						System.out.print("|  " + Current_date + "  ");
					}	
					++Current_date;
				}
			}
			System.out.print("|\n");
		}
	}
	public static void printHeader() {
		System.out.println("  Sun    Mon    Tues    Wed    Thu    Fri    Sat");
		border();
	}
	public static void border() {
		for (int i = 1; i <= 7; ++i) {
			System.out.print("+------");
		}
		System.out.print("+");
	}
}

