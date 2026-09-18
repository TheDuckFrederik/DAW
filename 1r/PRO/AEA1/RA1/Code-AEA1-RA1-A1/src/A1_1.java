// Import the scanner class
import java.util.Scanner;
//
public class A1_1 {

    public static void main(String[] args) {
	// Declare all variables
	float firstNum;
	float secondNum;
	Scanner keyboard = new Scanner(System.in);
	// 
	System.out.println("----------------------------------------------------");
	System.out.println("---Welcome to the decimal number sumatory program---");
	System.out.println("----------------------------------------------------");
	// We will now ask the numbers, and assign them.
	System.out.println("Insert the first decimal number:");
	firstNum = keyboard.nextFloat();
	System.out.println("----------------------------------------------------");
	System.out.println("Insert the second decimal number:");
	secondNum = keyboard.nextFloat();
	System.out.println("----------------------------------------------------");
	// Now we return the answer
	System.out.println("----------------Here is the result:-----------------");
	System.out.println("----------------------------------------------------");
	System.out.println("· " + firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
	System.out.println("----------------------------------------------------");
	//	
    }
    
}
// Quack
