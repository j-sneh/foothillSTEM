package JTSprograms; // adds class to the program's package (if any new methods are created, may be usable by other classes.)

public class HelloWorld { // class begins

	public static void main(String[] args) throws Exception { // main begins
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
		
		String month = "February";
		int date = 28;
		int year = 2017;
		System.out.println(month + " " + date +", " + year);
		if (month.equalsIgnoreCase("february")&& date > 29){
			throw new Exception();
		}
		
		if (year == 2017){
			System.out.println("Present!");
		} else if (year > 2017){
			System.out.println("Future!");
		} else {
			System.out.println("Past");
		}
		
		if (month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")){
			System.out.println("It's summer!");
		} else if (month.equalsIgnoreCase("October")){
			System.out.println("Happy Halloween!");
		} else {
			System.out.println("brrr... It's cold");
		}
		
		int i = 0;
		while (i <= 5){
			System.out.println(i);
			i++;
		}
		
		for (int j = 0; j <= 5;j++){
			System.out.println(j);
		}
		for (int j = 10;j>=0;j--){
			if (j > 0){
				System.out.println(j);
			} else{
				System.out.println("Happy new year!");
			}
		}
		for (int j = 0; j <= 12; j++){
			System.out.println(j * 4);
		}
		double[] arr = new double[] {0,-3,2,18,0,-5,-5.10000};
		double min = arr[0];
		for (int j = 0; j < arr.length; j++){
			System.out.println(arr[j]);
		}
		for (int j = 0; j < arr.length-1; j++){
			if(min > arr[j+1]){
				min = arr[j+1];
			}
		}
		System.out.println("Minimum is:" + min);
	}	// main ends

} 
