import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {
		Scanner sysIn = new Scanner(System.in);

		System.out.print("Please enter the sample size: ");
		int size = sysIn.nextInt();

		if (size > 0) {

			int trials = 4;

			int[][] data = new int[trials][size];
			int[] sums = new int[trials];

			for (int i = 0; i < trials; i++) {
				System.out.println("\nEnter numbers for Trial " + (i + 1));
				for (int j = 0; j < size; j++) {
					System.out.print("Enter sample #" + (j + 1) + ": ");
					data[i][j] = sysIn.nextInt();
					sums[i] += data[i][j];
				}
			}

			double[] avgs = new double[trials];

			// Should always be set to first average before comparisions
			double min = 0;
			double max = 0;

			for (int i = 0; i < trials; i++) {				
				avgs[i] = (double) sums[i] / size;

				if (i == 0) {
					min = avgs[i];
					max = avgs[i];
				} else if (min > avgs[i]) {
					min = avgs[i];
				} else if (max < avgs[i]) {
					max = avgs[i];
				}
			}

			System.out.print("\n\tSample #\tTrial 1\tTrial 2\tTrial 3\tTrial 4");
			for (int j = 0; j < size; j++) {
				System.out.print("\n\t" + (j + 1) + "\t");
				for (int i = 0; i < trials; i++) {
					System.out.print("\t" + data[i][j]);
				}
			}

			System.out.println("\n\t-----------------------------------------------");

			System.out.print("Averages:\t");
			for (int i = 0; i < trials; i++) {
				System.out.print("\t" + avgs[i]);
			}

			System.out.println("\n\nMin Average: " + min + "\nMax Average: " + max);

			if (min == max) {
				System.out.println("\nThe trials match EXACTLY!");
			} else if (max < 2 * min) {
				System.out.println("\nThe trials concur with each other!");
			} else {
				System.out.println("\nThe trials do NOT concur!");
			}

		} else {
			System.out.println("No data to analyze. Ending program.");
		}

		sysIn.close();	

	}

}
