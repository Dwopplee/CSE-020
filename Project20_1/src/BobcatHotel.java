import java.util.Scanner;
import java.util.Random;

public class BobcatHotel {

	public static void main(String[] args) {

		Scanner sysIn = new Scanner(System.in);
		Random rng = new Random();

		System.out.println("ROOM OPTIONS\n"
				+ "1. Single @ $50.50 per night\n"
				+ "2. Double @ $75.00 per night\n"
				+ "3. Queen @ $100.75 per night\n"
				+ "4. King @ $150.25 per night\n"
				+ "5. Master Suite @ $225.50 per night\n");

		System.out.print("Please specify the number of guests: ");
		int guests = sysIn.nextInt();

		System.out.print("Please select your room choice (enter 1/2/3/4/5 corresponding to the"
				+ " options shown above): ");
		int room = sysIn.nextInt();

		double roomPrice = 0.0;

		switch(room) {
		case 1:
			roomPrice = 50.50;
			break;

		case 2:
			roomPrice = 75.00;
			break;

		case 3:
			roomPrice = 100.75;
			break;

		case 4:
			roomPrice = 150.25;
			break;

		case 5:
			roomPrice = 225.50;
			break;
		}

		System.out.print("Please enter then number of nights: ");
		int nights = sysIn.nextInt();

		System.out.print("Are you an AAA member (enter 1 for yes, 0 for no)? ");
		boolean AAA = (sysIn.nextInt() == 1);

		System.out.print("Are you a club member (enter 1 for yes, 0 for no)? ");
		boolean club = (sysIn.nextInt() == 1);

		if (club) {
			if (rng.nextInt(10) >= 4) {
				if (nights <= 4) {
					club = false;
				}

				System.out.println("\nCongratulations! You've qualified for our \"Stay 4 nights"
						+ " get 1 free promotion\"\n"
						+ "Discount will be applied during checkout depending on the number of"
						+ " days");
			} else {
				club = false;
				System.out.println("\nUnfortunately, you didn't qualify for our \"Stay 4 nights"
						+ " get 1 free promotion\".\n"
						+ "Better luck next time!");
			}
		}

		System.out.print("\nMEAL PACKAGES (PRICES SHOWN ARE PER GUEST PER NIGHT)\n"
				+ "0. Complementary @ $0.00 per guest\n"
				+ "1. Standard @ $30.00 per guest\n"
				+ "2. Deluxe @ $50.00 per guest\n");
		if (room == 5) {
			System.out.println("3. Indulgence @ $85.00 per guest\n");
			System.out.print("Please select your desired meal package (enter 0/1/2/3"
					+ " corresponding to the options shown above): ");
		} else {
			System.out.print("\nPlease select your desired meal package (enter 0/1/2"
					+ " corresponding to the options shown above): ");
		}

		int meal = sysIn.nextInt();

		double mealPrice = 0.0;

		switch(meal) {
		case 0:
			mealPrice = 0.00;
			break;

		case 1:
			mealPrice = 30.00;
			break;

		case 2:
			mealPrice = 50.00;
			break;

		case 3:
			mealPrice = 85.00;
			break;
		}

		sysIn.close();

		double tRoomPrice = nights * roomPrice;

		double tMealPrice = nights * guests * mealPrice;

		double prelimPrice = tRoomPrice + tMealPrice;

		if (meal == 0) {
			System.out.print("\nCHECKOUT\n"
					+ "Room Cost:\t\t $" + tRoomPrice + '\n'
					+ "Preliminary Total Cost:\t $" + prelimPrice + '\n');
		} else {
			System.out.print("\nCHECKOUT\n"
					+ "Room Cost:\t\t $" + tRoomPrice + '\n'
					+ "Meal Cost:\t\t+$" + tMealPrice + '\n'
					+ "Preliminary Total Cost:\t $" + prelimPrice + '\n');
		}


		double AAADis = 0.0;
		double clubDis = 0.0;
		if (AAA) {
			AAADis = prelimPrice * 0.1;
			System.out.println("AAA Discount:\t\t-$" + AAADis);
		}
		if (club) {
			clubDis = (nights / 4) * roomPrice;
			System.out.println("Club Member Discount:\t-$" + clubDis);
		}
		if (!(AAA || club)) {
			System.out.println("No Discounts Applied");
		}

		double tPrice = prelimPrice - AAADis - clubDis;

		System.out.println("Total Cost of Booking:\t $" + tPrice);
	}

}
