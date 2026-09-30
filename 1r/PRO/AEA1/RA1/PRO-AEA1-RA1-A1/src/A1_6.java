// Import the scanner class
import java.util.Scanner;
//
public class A1_6 {
    //
    public static void main(String[] args) {
	// Declare all variables
	double pricePerItemBeforeTax;
	int productAmmount;
	double totalPrice;
	final int IVA = 21;
	Scanner keyboard = new Scanner(System.in);
	// 
	System.out.println("------------------------------------------------");
	System.out.println("---Welcome to the item tax calculator program---");
	System.out.println("------------------------------------------------");
	// We will now ask the numbers, and assign them.
	System.out.println("Insert the price per item without tax:");
	pricePerItemBeforeTax = keyboard.nextDouble();
	System.out.println("------------------------------------------------");
	System.out.println("Insert the number of items:");
	productAmmount = keyboard.nextInt();
	System.out.println("------------------------------------------------");
	// Calculate the total
	totalPrice = (pricePerItemBeforeTax + (pricePerItemBeforeTax / 100) * IVA) * productAmmount;
	// Now we return the answer
	System.out.println("--------------Here is your total:---------------");
	System.out.println("------------------------------------------------");
	System.out.println("· " + productAmmount + " items at " + pricePerItemBeforeTax + " per item plus 21% tax comes out to: " + totalPrice);
	System.out.println("------------------------------------------------");
	//
    }
    //
}
// Quack
