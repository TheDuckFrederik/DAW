// Import the scanner class
import java.util.Scanner;
//
public class A1_15 {
    //
    public static void main(String[] args) {
	// Declare all variables
	int minutes;
	int hours;
	int days;
	int weeks;
	double hoursEquivalent;
	double daysEquivalent;
	double weeksEquivalent;
	final int TIME_RATIO = 60;
	final int HOURS_TO_DAYS_RATIO = 24;
	final int DAYS_TO_WEEKS_RATIO = 7;
	Scanner keyboard = new Scanner(System.in);
	// 
	System.out.println("--------------------------------------------------------");
	System.out.println("---Welcome to the minute upscaling calculator program---");
	System.out.println("--------------------------------------------------------");
	// We will now ask the numbers, and assign them.
	System.out.println("Insert an ammout of minutes:");
	minutes = keyboard.nextInt();
	System.out.println("--------------------------------------------------------");
	// Calculate the equivalents
	hoursEquivalent = minutes / TIME_RATIO;
	daysEquivalent = hoursEquivalent / HOURS_TO_DAYS_RATIO;
	weeksEquivalent = daysEquivalent / DAYS_TO_WEEKS_RATIO;
	// Now we return the answer
	System.out.println("-Here are your weeks, days, hours, minutes and minutes:-");
	System.out.println("--------------------------------------------------------");
	System.out.println("· " + minutes + " minutes ammount to:");
	System.out.println("· " + weeksEquivalent + " weeks or " + daysEquivalent + " days or " + hoursEquivalent + " hours or " + minutes + " minutes"); // This only gives the equivalent of the whole quantity in hours, then minutes then minutes.
	//Here we properly calculate the equivalent to converting the minutes into hours, minutes, minutes. Here specifically the minutes to hours
	hours = 0;
	while (minutes >= TIME_RATIO) {
	    hours += 1;
	    minutes -= TIME_RATIO;
	}
	//Here the hours to days
	days = 0;
	while (hours >= HOURS_TO_DAYS_RATIO) {
	    days += 1;
	    hours -= HOURS_TO_DAYS_RATIO;
	}
	//Here the days to weeks
	weeks = 0;
	while (days >= DAYS_TO_WEEKS_RATIO) {
	    weeks += 1;
	    days -= DAYS_TO_WEEKS_RATIO;
	}
	System.out.println("· " + weeks + " weeks, " + days + " days, " + hours + " hours and " + minutes + " minutes");
	//
	System.out.println("--------------------------------------------------------");
	//
    }
    //
}
// Quack
