// Import the scanner class
import java.util.Scanner;
//
public class A1_14 {
    //
    public static void main(String[] args) {
	// Declare all variables
	int seconds;
	int minutes;
	int hours;
	double minutesEquivalent;
	double hoursEquivalent;
	final int TIME_RATIO = 60;
	Scanner keyboard = new Scanner(System.in);
	// 
	System.out.println("--------------------------------------------------------");
	System.out.println("---Welcome to the second upscaling calculator program---");
	System.out.println("--------------------------------------------------------");
	// We will now ask the numbers, and assign them.
	System.out.println("Insert an ammout of seconds:");
	seconds = keyboard.nextInt();
	System.out.println("--------------------------------------------------------");
	// Calculate the equivalents
	minutesEquivalent = seconds / TIME_RATIO;
	hoursEquivalent = minutesEquivalent / TIME_RATIO;
	// Now we return the answer
	System.out.println("------Here are your hours, minutes and seconds:-------");
	System.out.println("--------------------------------------------------------");
	System.out.println("· " + seconds + " seconds ammount to:");
	System.out.println("· " + hoursEquivalent + " hours or " + minutesEquivalent + " minutes or " + seconds + " seconds"); // This only gives the equivalent of the whole quantity in hours, then minutes then seconds.
	//Here we properly calculate the equivalent to converting the seconds into hours, minutes, seconds. Here specifically the seconds to minutes
	minutes = 0;
	while (seconds >= TIME_RATIO) {
	    minutes += 1;
	    seconds -= TIME_RATIO;
	}
	//Here the minutes to hours
	hours = 0;
	while (minutes >= TIME_RATIO) {
	    hours += 1;
	    minutes -= TIME_RATIO;
	}
	System.out.println("· " + hours + " hours, " + minutes + " minutes and " + seconds + " seconds");
	//
	System.out.println("--------------------------------------------------------");
	//
    }
    //
}
// Quack
