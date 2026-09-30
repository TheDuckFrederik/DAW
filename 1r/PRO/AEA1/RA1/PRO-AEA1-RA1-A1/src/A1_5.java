// Import the scanner class
import java.util.Scanner;
//
public class A1_5 {
    //
    public static void main(String[] args) {
	// Declare all variables
	double euros;
	double usDollars;
	final double EURO_TO_USD_RATIO = 1.15;
	Scanner keyboard = new Scanner(System.in);
	// 
	System.out.println("-----------------------------------------------------------");
	System.out.println("---Welcome to the Euros to US dollars calculator program---");
	System.out.println("-----------------------------------------------------------");
	// We will now ask the numbers, and assign them.
	System.out.println("Insert the Euros:");
	euros = keyboard.nextDouble();
	System.out.println("-----------------------------------------------------------");
	// Calculate the pounds
	usDollars = euros * EURO_TO_USD_RATIO;
	// Now we return the answer
	System.out.println("-------------------Here is your result:--------------------");
	System.out.println("-----------------------------------------------------------");
	System.out.println("· " + euros + " euros are " + usDollars + " US dollars");
	System.out.println("-----------------------------------------------------------");
	//
    }
    //
}
// Quack
