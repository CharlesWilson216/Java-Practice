public class WorkRecordTester {
	public static void main(String[] args) {
		WorkRecord wA = new WorkRecord("Andy");
		WorkRecord wH = new WorkRecord("Harold");

		System.out.println("Name: " + wA.name + ", Hours: " + wA.hours);
		wA.hours = 5;
		System.out.println("Value after the getHours() method for " + wA.name + ": " + wA.getHours());
		wA.addHours(3);
		System.out.println("After moreHours() method: " + wA.hours);

		System.out.println("Name: " + wH.name + ", Hours: " + wH.hours);
		wH.hours = 3;
		System.out.println("Value after the getHours() method for " + wH.name + ": " + wH.getHours());
		wH.addHours(4);
		System.out.println("After moreHours() method: " + wH.hours);

		System.out.println(wA.toString());
		System.out.println(wH.toString());
	}
}

