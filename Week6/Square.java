public class Square {
	public static void main(String[] args) {
		printSquare(3, 7);
		printSquare(5, 9);
		printSquare(0, 0);
	}
	public static void printSquare(int min, int max) {
		
		int[] numbers = new int[max - min + 1];
		
		int initial = numbers[0];
		int current = min;
		int elements = max - min + 1;
		int constant;
		
		//initialize values for array
		for (int i = 0; i < elements; ++i) {
			numbers[i] = current;
			++current;
		}
		//iterate through lines
		for (int k = 0; k < elements; ++k) {
			
			constant = min;

			//print array	
			for (int j = 0; j < elements; ++j) {
				System.out.print(numbers[j]);
			}
			//make increments on each element of the array leading up to max
			for (int index = 0; index < elements - 1; ++index) {
				numbers[index] = numbers[index + 1];
				
				for (int c = 0; numbers[index] == 7 && index < (elements - 1); ++index) {
					++c;
					for (int z = 1; c >= 2; --c) {
						numbers[index] = constant;
						++constant;
					}
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
