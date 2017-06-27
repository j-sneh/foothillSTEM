package JTSprograms;
import java.util.*;
public class ArraySort {
	public static void bubbleSort(double[] arr){
		for (int i = 0; i < arr.length - 1;i++){
			for (int j = 0; j < arr.length - i - 1 ;j++){
				if (arr[j] > arr[j+1]){
					double temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] arr = new double[] {1,2,3,5,4,3,2,-1,4,-2,7,8,7,0,-99,-0.3,0.00000000000000000003,1/3.0,0.33333333333333};
		if (arr.length < 1){
			System.err.print("Array is too short");
			System.exit(0);
		}
		System.out.print("Unsorted Array: ");
		for (int i = 0; i < arr.length; i++){
			if(i == arr.length - 1){
			System.out.println(" " + arr[i]);
			} else {
				System.out.print(" " + arr[i]);
			}
		}
		bubbleSort(arr);
		System.out.print("Sorted Array: ");
		for (int i = 0; i < arr.length; i++){
			if(i == arr.length - 1){
			System.out.println(" " + arr[i]);
			} else {
				System.out.print(" " + arr[i]);
			}
		}
		input.close();

	}

}
