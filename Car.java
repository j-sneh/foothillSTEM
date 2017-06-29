package JTSprograms;

public class Car {
	private int x = 0;
	private int y = 0;
	private int fuel = 100;
	private String color = "white";
	private static final double price = 3.59;
	private double spent = 0;
	private int year = 2017;
	Car(){
	}
	Car(String ncolor,int newX,int newY,int nfuel){
		drive(newX,newY);
		setColor(ncolor);
		addFuel(nfuel);
	}
	public void addFuel(int newFuel){
		if (newFuel > fuel){
			fuel = newFuel;
			spent += fuel*price;
			System.out.println(String.format("You now have %d gallons of fuel in the tank. It costed $%.2f.",fuel,fuel*price));
		} else if (newFuel  < fuel ){
			System.out.println("You can't redrive fuel");
		} else {
			System.out.println("Fuel is equal to old fuel.");
		}
	}
	public void setColor(String newColor){
		color = newColor;
	}
	public double getSpent(){
		return spent;
	}
	public void drive(int newX, int newY){
		
		if (Math.abs(x-newX) + Math.abs(y-newY) > fuel){
			System.out.println("You do not have enough fuel to make this trip, please fill it up with more.");
		}else{
			fuel -= Math.abs(x - newX);
			fuel -= Math.abs(y-newY);
			x = newX;
			y = newY;
			System.out.printf("Your car is now at location (%d,%d) and you now have %d gallons of fuel.%n",x,y,fuel);
		}
	}
	public String getLocation(){
		return String.format("(%d,%d)", x,y);
	}
	public int getFuel(){
		return fuel;
	}
	public String toString(){
		return String.format("This car is a %s car with %d gallons of fuel left and is in location (%d,%d)",color,fuel,x,y);
	}
	public int getYear(){
		return year;
	}
	public void setYear(int newYear){
		if (year < 1885){
			System.out.println("Cars didn't exist back then.");
		} else {
			year = newYear;
		}
	}
}
