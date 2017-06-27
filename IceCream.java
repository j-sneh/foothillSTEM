package JTSprograms;
import java.util.*;
public class IceCream {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to buy ice cream? (Y/N)");
		String wantsCream = input.nextLine(),useCred;
		int credits = 0;
		while(wantsCream.equalsIgnoreCase("y") || wantsCream.equalsIgnoreCase("yes")){
			int creams = 0;
			if (credits >= 10){
				System.out.println("Do you want to buy ice cream? (B) or recieve a free ice cream using 10 credits (C)");
				useCred = input.nextLine();
				if (useCred.equalsIgnoreCase("c")){
					System.out.printf("You have recieved a free ice cream, you now have %d credits. %n",credits);
				} else if (useCred.equalsIgnoreCase("b")){
					System.out.println("How many ice creams do you want to buy?");
					creams = input.nextInt();
					credits += creams;
					System.out.printf("You have bought %d ice creams and now have %d credits",creams,credits);
				} else {
					System.out.println("Please write B or C.");
				}
			} else {
				System.out.println("How many ice creams do you want to buy?");
				creams = input.nextInt();
				credits += creams;
				System.out.printf("You have bought %d ice creams and now have %d credits %n",creams,credits);
			}
			
			System.out.println("Do you want to buy ice cream? (Y/N)");
			wantsCream = input.nextLine();
		}
		System.out.println("Thank you for coming to the ice cream shop! Have a nice day!");
		input.close();
	}
}
