public class xo {
	public static void main(String[] args) {
		XO(30);
	}
	public static void XO(int size) {
		char[] row = new char[size];
		
		for (int h = 0; h < size; ++h) {
			row[h] ='O';
		}
		for (int i = 0; i < size; ++i) {
			row[i] = 'X';
			row[row.length - i - 1] = 'X';
			for (int j = 0; j < size; ++j) {
				System.out.print(row[j]);
			}
			System.out.println();
			for (int z = 0; z < size; ++z) {
				row[z] = 'O';
			}
		}
	}
}
