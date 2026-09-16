//

// Here we get this library so we can use the Scanner type.
import java.util.Scanner;

//This class will host variables
public class Variables {
    
	//Main program
	public static void main (String[] args) {
		System.out.println("---Variables---");
		
		// Most used data types:
		int intNum = 7; // This is an integer, a number either positive or negative that is not a decimal (-2,147,483,648 to 2,147,483,647).
		float floatNum = 3.7f; // This is either a positive or negative decimal number.
		boolean bool = true; // This is a variable with either "true" or "false".
		String string = "Duck"; // This holds a chain of characters, includes spaces numbers (thought they will be treated as characters), etc.
		
		// Print common variable types
		System.out.println("-----------------\nCommon data types:\n -This is an integer: " + intNum + "\n -This is a float: " + floatNum + "\n -This is a bool: " + bool + "\n -This is a string: " + string + "\n-----------------");
		
		// Other data types:
		byte byteNum = 3; // This can only hold a number from -128 to 127, this can hold a smaller number than the following:
		short shortNum = -3; // This is bigger than byte, but shorter than int (-32,768 to 32,767).
		long longNumber = -37; // This is the data type that can hold the biggest number, more than int (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807).
		double longNum = 37.73; // This is not very used, it's purpose is to hold bigger decimal numbers.
		char letter = 'Z'; // It holds a single letter or ascii characters, it is the same as String but it can only hold a sigle character at a time. Single quotes must be used.
		
		// Print other variable types
		System.out.println("-----------------\\Other data types:\n -This is a byte: " + byteNum + "\n -This is a short: " + shortNum + "\n -This is a long: " + longNum + "\n -This is a char: " + letter + "\n-----------------");
		
		// Making a Scanner so the user can input data
		Scanner keyboard = new Scanner(System.in);
		
		int age; // The age of the user.
		
		System.out.println("Insert your age:");
		age = keyboard.nextInt();
		System.out.println("Your age is: " + age);
	}
}
// Quack
