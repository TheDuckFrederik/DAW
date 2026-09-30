// Import the scanner class
import java.util.Scanner;
//
public class A1_3 {
    //
    public static void main(String[] args) {
	// Declare all variables
	double base;
	double height;
	double area;
	Scanner keyboard = new Scanner(System.in);
	// 
	System.out.println("-----------------------------------------------------");
	System.out.println("---Welcome to the triangle area calculator program---");
	System.out.println("-----------------------------------------------------");
	// We will now ask the numbers, and assign them.
	System.out.println("Insert the base of the triangle:");
	base = keyboard.nextDouble();
	System.out.println("-----------------------------------------------------");
	System.out.println("Insert the height of the triangle:");
	height = keyboard.nextDouble();
	System.out.println("-----------------------------------------------------");
	// Calculate the area
	area = (base * height) / 2;
	// Now we return the answer
	System.out.println("----------------Here is your result:-----------------");
	System.out.println("-----------------------------------------------------");
	System.out.println("· Base: " + base + ", height: " + height);
	System.out.println("· area: " + area);
	System.out.println("-----------------------------------------------------");
	//
    }
    //
}
// Quack
