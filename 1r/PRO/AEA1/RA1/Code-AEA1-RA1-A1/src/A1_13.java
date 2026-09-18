// Import the scanner class
import java.util.Scanner;
//
public class A1_13 {

    public static void main(String[] args) {
	// Declare all variables
	int hours;
	int minutes;
	int seconds;
	int totalSeconds;
	final int TIME_RATIO = 60;
	Scanner keyboard = new Scanner(System.in);
	// 
	System.out.println("--------------------------------------------------------");
	System.out.println("---Welcome to the time downscaling calculator program---");
	System.out.println("--------------------------------------------------------");
	// We will now ask the numbers, and assign them.
	System.out.println("Insert an ammout of hours:");
	hours = keyboard.nextInt();
	System.out.println("--------------------------------------------------------");
	System.out.println("Insert an ammout of minutes:");
	minutes = keyboard.nextInt();
	System.out.println("--------------------------------------------------------");
	System.out.println("Insert an ammout of seconds:");
	seconds = keyboard.nextInt();
	System.out.println("--------------------------------------------------------");
	// Calculate the totals
	totalSeconds = (((hours * TIME_RATIO) + minutes) * TIME_RATIO) + seconds;
	//Now we return the answer
	System.out.println("----------------Here are your seconds:------------------");
	System.out.println("--------------------------------------------------------");
	System.out.println("· " + hours + " hours, " + minutes + " minutes and " + seconds + " seconds ammount to:");
	System.out.println("· " + totalSeconds + " seconds");
	System.out.println("--------------------------------------------------------");
	//
    }
    //
}
// Quack
