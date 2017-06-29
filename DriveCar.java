package JTSprograms;

public class DriveCar {
	public static void main(String[] args){
		Car toyota = new Car("chartruse",0,0,150);
		toyota.toString();
		System.out.println(toyota);
		toyota.drive(100, 51);
		System.out.println(String.format("$%.2f",toyota.getSpent()));
	}

}
