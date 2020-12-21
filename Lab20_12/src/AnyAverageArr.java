import java.util.Scanner;


public class AnyAverageArr {

	public static void main(String[] args) {
		Scanner sysIn = new Scanner(System.in);
		
		System.out.println("This program will find the average of any set of numbers.");
		
		System.out.print("Please choose number of values to average: ");
		int max = sysIn.nextInt();
		
		if (max > 0) {
			System.out.print("Please choose column width for output formatting: ");
			int col = sysIn.nextInt();
			
			int[] vals = new int[max];
			int sum = 0;
			
			for (int i = 0; i < max; i++) {
				System.out.print("Please enter value #" + (i + 1) + ": ");
				vals[i] = sysIn.nextInt();
				sum += vals[i];
			}
			
			System.out.println("\nThe numbers being averaged are ...");
			
			for (int i = 1; i <= max; i++) {
				System.out.print(vals[i-1] + " ");
				if (i % col == 0 || i == max) {
					System.out.print("\n");
				}
			}
			
			System.out.println("\nAverage is: " + (double) sum / max);
		} else {
			System.out.println("No numbers to average. Exiting program.");
		}
		
		sysIn.close();
	}

}
