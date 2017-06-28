package JTSprograms;
import java.util.*;
public class Blackjack {
	public static int dealerAI(int dealertotal){
		if (dealertotal <= 16){
			return draw();
		} else {
			return 0;
		}
	}
	public static int draw(){
		Random r = new Random();
		return r.nextInt(11) + 1;
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String status;
		int draw1 = draw();
		int draw2 = draw();
		int total = draw1 + draw2;
		System.out.println("Welcome to Jonathan's Blackjack Table! \n");
		
		System.out.printf("You drew a %d and a %d %n",draw1,draw2);
		System.out.println("Your total is " + total);
		int dealerTotal = draw();
		int realdTotal = dealerTotal + draw();
		System.out.println("\nThe dealer has two cards, one showing, one hidden."
				+ " The showing one has a value of " + dealerTotal);
		boolean dealerWin = false;
		boolean playerWin = false;
		while (playerWin == false && dealerWin == false){
			System.out.println("Would you like to \"hit\" or \"stay\"?");
			status = input.nextLine().trim();
			if (status.equalsIgnoreCase("hit")){
				int newdraw = draw();
				total += newdraw;
				System.out.printf("You drew a %d, Your total is now %d %n",newdraw,total);
				if(total > 21){
					System.out.println("You have more than 21... BUSTED!");
					dealerWin = true;
				}
			} else if (status.equalsIgnoreCase("stay")){
				System.out.println("You set your cards down.");
			}else{
				System.err.println("Write either \"stay\" or \"hit\"");
				continue;
			}
			int dealerHit = dealerAI(realdTotal);
			if (status.equalsIgnoreCase("stay")){
				while(dealerHit != 0){
					dealerTotal += dealerHit;
					realdTotal += dealerHit;
					System.out.printf("The dealer's visible total is %d %n", dealerTotal);
					dealerHit = dealerAI(realdTotal);
				}
			}
		}
		if (dealerWin){
			System.out.printf("The dealer won! He had a total of %d. %n",total);
		} else {
			System.out.println("You won!");
		}
		input.close();
	}

}
