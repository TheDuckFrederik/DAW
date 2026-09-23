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
	Scanner keyboard = new Scanner(System.in);
	// 
	System.out.println("--------------------------------------------------------");
	System.out.println("---Welcome to the second upscaling calculator program---");
	System.out.println("--------------------------------------------------------");
	// We will now ask the numbers, and assign them.
	System.out.println("Insert an ammout of seconds:");
	seconds = keyboard.nextInt();
	System.out.println("--------------------------------------------------------");
	// Now we return the answer
	System.out.println("------Here are your hours, minutes and seconds:-------");
	System.out.println("--------------------------------------------------------");
	System.out.println("· " + seconds + " seconds ammount to:");
	//Here we properly calculate the equivalent to converting the seconds into hours, minutes, seconds. Here specifically the seconds to minutes
	hours = seconds / 3600;
	minutes = (seconds / 3600) % 60;
	seconds = seconds % 60;
	//
	System.out.println("· " + hours + " hours, " + minutes + " minutes and " + seconds + " seconds");
	System.out.println("--------------------------------------------------------");
	//
    }
    //
}
// Quack
