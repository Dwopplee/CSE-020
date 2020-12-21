import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		System.out.println("Enter 0 or less to stop entering numbers.");
		
		Scanner sysIn = new Scanner(System.in);
		
		int i = 0;
		int input = 0;
		int sum = 0;
		
		do {
			sum += input;
			i++;
			
			System.out.print("Enter value #" + i + ": ");
			input = sysIn.nextInt();
			
		} while (input > 0);
		
		
		if (sum != 0) {
			System.out.println("Average is " + (double) sum / (i - 1));
		} else {
			System.out.println("No positive numbers were input");
		}
		
	}

}
