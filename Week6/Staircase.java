public class Staircase {
	public static void main(String[] args) {
		
		int x = Console.promptInt();
		drawStaircase(x);	// Call method to print stair case
	}
	public static void drawStaircase(int stairs) {
 		
		// Iterate through each stair; save the amount of #'s necessary for each stair in stairlength
		for (int stairlength = 2; stairlength <= (2 * stairs); stairlength = stairlength + 2) {	
			
			// Print #'s based on the value of stairlength
			for (int j = 1; j <= stairlength; ++j) {
				
				System.out.print("#");
			}
			//After printing #'s print two underscores
			System.out.println("__");
		}
	}
}
