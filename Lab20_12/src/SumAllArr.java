import java.util.Scanner;

public class SumAllArr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");

		int max = input.nextInt();

		if (max <= 0) {
			System.out.println("No numbers to sum up. Exiting program.");
		} else {
			int[] arr1 = new int[max + 1];
			int[] arr2 = new int[max + 1];
			int[] arr3 = new int[max + 1];

			int i = 1;

			// For-loop to calculate sums
			for (i = 1; i <= max; i++)
				arr1[i] = arr1[i - 1] + i * i;

			i = 1;

			// While-loop to calculate sums
			while (i <= max) {
				arr2[i] = arr2[i - 1] + i * i;
				i++;
			}

			i = 1;

			// Do-While-loop to calculate sums
			do
				arr3[i] = arr3[i - 1] + i * i;
			while (++i <= max);
			
			System.out.println("\nContents of Arr1 (for-loop), Arr2 (while-loop), Arr3 (do-while-loop) are:");

			for (i = 0; i <= max; i++)
				System.out.println("Arr1: " + arr1[i] + ", Arr2: " + arr2[i] + ", Arr3: " + arr3[i]);

			System.out.println("\nSum of squares of numbers 1 to " + max + " is: " + arr1[max]);
		}

		input.close();
	}
}
