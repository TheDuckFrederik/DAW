// Import the scanner class
import java.util.Scanner;
//
public class A1_2 {

    public static void main(String[] args) {
	// Declare all variables
	float base;
	float height;
	float perimeter;
	Scanner keyboard = new Scanner(System.in);
	// 
	System.out.println("-----------------------------------------------------------");
	System.out.println("---Welcome to the rectangle perimeter calculator program---");
	System.out.println("-----------------------------------------------------------");
	// We will now ask the numbers, and assign them.
	System.out.println("Insert the first decimal number:");
	base = keyboard.nextFloat();
	System.out.println("----------------------------------------------------");
	System.out.println("Insert the second decimal number:");
	height = keyboard.nextFloat();
	System.out.println("----------------------------------------------------");
	// Now we return the answer
	System.out.println("----------------Here is your result:----------------");
	System.out.println("----------------------------------------------------");
	System.out.println("· Base: " + base + ", height: " + height);
	System.out.println("· Perimeter: " + perimeter);
	System.out.println("----------------------------------------------------");
	//
    }

}
// Quack
