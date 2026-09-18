// Import the scanner class
import java.util.Scanner;
//
public class A1_4 {
    //
    public static void main(String[] args) {
	// Declare all variables
	double kilograms;
	double pounds;
	final double KILIOGRAMSTOPOUNDSRATIO = 2.20462;
	Scanner keyboard = new Scanner(System.in);
	// 
	System.out.println("-----------------------------------------------------------");
	System.out.println("---Welcome to the kilograms to pounds calculator program---");
	System.out.println("-----------------------------------------------------------");
	// We will now ask the numbers, and assign them.
	System.out.println("Insert the kilograms:");
	kilograms = keyboard.nextDouble();
	System.out.println("-----------------------------------------------------------");
	// Calculate the pounds
	pounds = kilograms * KILIOGRAMSTOPOUNDSRATIO;
	// Now we return the answer
	System.out.println("-------------------Here is your result:--------------------");
	System.out.println("-----------------------------------------------------------");
	System.out.println("· " + kilograms + " kgs are " + pounds + " lbs");
	System.out.println("-----------------------------------------------------------");
	//
    }
    //
}
// Quack
