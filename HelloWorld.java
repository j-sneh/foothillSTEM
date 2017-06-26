package JTSprograms; // adds class to the program's package (if any new methods are created, may be usable by other classes.)
public class HelloWorld { // class begins

	public static void main(String[] args) { // main begins
		// code only runs in main method.
		String name,position,location,website;
		name = "Jonathan Sneh \n";
		position = "Student \n";
		location = "PALY \n";
		website = "j-sneh.github.io \n";
		String sig = name + position + location + website;
		System.out.print(sig);
		
		int x = 0;
		int y = 3 * 2;
		int z = 1 / 2;
		System.out.println(x + "\n" + y + "\n" + z);
		System.out.println((int) Math.pow(6, 2));
		int apples = 3;
		double ppapples = 0.75;
		int bread = 2;
		double ppbread = 5.35;
		int soda = 6;
		double ppsoda = 0.85;
		double total = 0.01 * Math.floor((apples * ppapples + bread * ppbread + soda * ppsoda) * 100.0);
		System.out.println("Java Store -----------------------------------");
		System.out.println("Item\tQuantity\tPrice per Item\tSubotal");
		System.out.println("Apples \t"   + apples +"\t \t \t$" + ppapples + "\t" + "$" + apples * ppapples );
		System.out.println("Bread  \t"   + bread +"\t \t \t$" + ppbread + "\t" + "$" + bread * ppbread );
		System.out.println("Soda   \t"   + soda +"\t \t \t$" + ppsoda + "\t" + "$" + soda * ppsoda );
		System.out.println("Total  \t \t \t \t \t" + "$" + total);
		String emotion = "AgItAtEd";
		if (emotion.equalsIgnoreCase("happy")){
			System.out.println(":)");
		} else if (emotion.equalsIgnoreCase("sad")){
			System.out.println(":(");
		} else{
			System.out.println(":|");
		} 
		
	}	// main ends

} 
// class ends




//public class BuggyCode {
//
//	public static void main(String[] args) {
//		String thisCollege = "Foothill College";
//		String address = 12345 + " El Monte Road"; 
//		System.out.println(address);
//		String y = "Los Altos Hills ";
//		String State = "CA";
//	
//	
//	
//		System.out.println(thisCollege);
//		System.out.println("Hello, world!");
//		System.out.println(y + State + 94022);
//		
//	}
//}
