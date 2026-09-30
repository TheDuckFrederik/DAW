// Import the scanner class
import java.util.Scanner;
//
public class A1_2 {
    //
    public static void main(String[] args) {
	// Declare all variables
	double base;
	double height;
	double perimeter;
	Scanner keyboard = new Scanner(System.in);
	// 
	System.out.println("-----------------------------------------------------------");
	System.out.println("---Welcome to the rectangle perimeter calculator program---");
	System.out.println("-----------------------------------------------------------");
	// We will now ask the numbers, and assign them.
	System.out.println("Insert the base of the rectangle:");
	base = keyboard.nextDouble();
	System.out.println("-----------------------------------------------------------");
	System.out.println("Insert the height of the rectangle:");
	height = keyboard.nextDouble();
	System.out.println("-----------------------------------------------------------");
	// Calculate the perimeter
	perimeter = 2 * (base + height);
	// Now we return the answer
	System.out.println("-------------------Here is your result:--------------------");
	System.out.println("-----------------------------------------------------------");
	System.out.println("· Base: " + base + ", height: " + height);
	System.out.println("· Perimeter: " + perimeter);
	System.out.println("-----------------------------------------------------------");
	//
    }
    //
}
// Quack
