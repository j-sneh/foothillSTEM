package JTSprograms;

public class Receipt {
	public static String recepitItem(String item,int amount,double price){
		double subtotal = amount * price;
		String recepit = String.format("%s  \t %d \t \t \t$%.2f \t$%.2f ",item,amount,price,subtotal);
		return recepit;
	}
	public static void main(String[] args) {
		System.out.println(recepitItem("Avocados",3,2.50));
		System.out.println(recepitItem("Bread   ",5,3.00));
		System.out.println(recepitItem("Toaster",1,59.99));
		

	}

}
