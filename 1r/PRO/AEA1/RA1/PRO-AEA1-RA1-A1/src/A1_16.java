// Import the scanner class
import java.util.Scanner;
//
public class A1_16 {
    //
    public static void main(String[] args) {
	// Declare all veriables
	int dividend;
	int divisor;
	int quotient;
	int remainder;
	Scanner keyboard = new Scanner(System.in);
	// 
	System.out.println("--------------------------------------------------------------");
	System.out.println("---Welcome to the quotient and remainder calculator program---");
	System.out.println("--------------------------------------------------------------");
	// Now we ask for the dividend and the divisor
	System.out.println("Enter the dividend:");
	dividend = keyboard.nextInt();
	System.out.println("--------------------------------------------------------------");
	System.out.println("Enter the divisor:");
	divisor = keyboard.nextInt();
	System.out.println("--------------------------------------------------------------");
	// Now we calculate and store the values
	quotient = dividend / divisor;
	remainder = dividend % divisor;
	//
    }
    //
}
// Quack
