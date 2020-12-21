import java.lang.String;
import java.util.Scanner;

public class Interviewer {

	public static void main(String[] args) {
		Scanner sysIn = new Scanner(System.in);
		String name;
		String home;
		String major;
		int year;
		String ans;
		
		System.out.print("What is your name? ");
		name = sysIn.nextLine();
		
		System.out.print("What is your hometown? ");
		home = sysIn.nextLine();
		
		System.out.print("What is your major? ");
		major = sysIn.nextLine();
		
		System.out.print("What year are you in? ");
		year = sysIn.nextInt();
		
		String temp = sysIn.nextLine();
		
		System.out.print("Do we actually need a fifth question? ");
		ans = sysIn.nextLine();
		
		System.out.println("Their name is " + name + ".");
		System.out.println(name + " is from " + home + ".");
		System.out.println(name + " is a " + major + " major in year " + year + ".");
		System.out.println("When asked if we need a fifth question, they said:\n" + "\"" + ans + "\"");
	}

}