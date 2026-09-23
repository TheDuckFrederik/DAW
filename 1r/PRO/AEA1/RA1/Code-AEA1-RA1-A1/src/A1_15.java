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
	Scanner keyboard = new Scanner(System.in);
	// 
	System.out.println("--------------------------------------------------------");
	System.out.println("---Welcome to the minute upscaling calculator program---");
	System.out.println("--------------------------------------------------------");
	// We will now ask the numbers, and assign them.
	System.out.println("Insert an ammout of minutes:");
	minutes = keyboard.nextInt();
	System.out.println("--------------------------------------------------------");
	// Now we return the answer
	System.out.println("-Here are your weeks, days, hours, minutes and minutes:-");
	System.out.println("--------------------------------------------------------");
	System.out.println("· " + minutes + " minutes ammount to:");
	//Here we properly calculate the equivalent to converting the minutes into hours, minutes, minutes. Here specifically the minutes to hours
	weeks = minutes / 10080;
	days = (minutes / 1440) % 7;
	hours = (minutes / 60) % 24;
	minutes = minutes % 60;
	//
	System.out.println("· " + weeks + " weeks, " + days + " days, " + hours + " hours and " + minutes + " minutes");
	System.out.println("--------------------------------------------------------");
	//
    }
    //
}
// Quack
