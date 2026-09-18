// Import the scanner class
import java.util.Scanner;
//
public class A1_11 {
    //
    public static void main(String[] args) {
	// Declare all variables
	double pricePerItemBeforeTax1;
	double pricePerItemBeforeTax2;
	double pricePerItemBeforeTax3;
	int productAmmount1;
	int productAmmount2;
	int productAmmount3;
	double totalPriceItem1;
	double totalPriceItem2;
	double totalPriceItem3;
	double totalPriceBeforeTax;
	double totalPrice;
	final int IVA = 21;
	Scanner keyboard = new Scanner(System.in);
	// 
	System.out.println("----------------------------------------------------");
	System.out.println("---Welcome to the tri-item tax calculator program---");
	System.out.println("----------------------------------------------------");
	// We will now ask the numbers, and assign them.
	System.out.println("Insert the price per item1 without tax:");
	pricePerItemBeforeTax1 = keyboard.nextDouble();
	System.out.println("----------------------------------------------------");
	System.out.println("Insert the amount of item1s:");
	productAmmount1 = keyboard.nextInt();
	System.out.println("----------------------------------------------------");
	System.out.println("Insert the price per item2 without tax:");
	pricePerItemBeforeTax2 = keyboard.nextDouble();
	System.out.println("----------------------------------------------------");
	System.out.println("Insert the amount of item2s:");
	productAmmount2 = keyboard.nextInt();
	System.out.println("----------------------------------------------------");
	System.out.println("Insert the price per item3 without tax:");
	pricePerItemBeforeTax3 = keyboard.nextDouble();
	System.out.println("----------------------------------------------------");
	System.out.println("Insert the amount of item3s:");
	productAmmount3 = keyboard.nextInt();
	System.out.println("----------------------------------------------------");
	// Calculate the totals
	totalPriceItem1 = (pricePerItemBeforeTax1 + (pricePerItemBeforeTax1 / 100) * IVA) * productAmmount1;
	totalPriceItem2 = (pricePerItemBeforeTax2 + (pricePerItemBeforeTax2 / 100) * IVA) * productAmmount2;
	totalPriceItem3 = (pricePerItemBeforeTax3 + (pricePerItemBeforeTax3 / 100) * IVA) * productAmmount3;
	totalPriceBeforeTax = totalPriceItem1 + totalPriceItem2 + totalPriceItem3;
	totalPrice = ((totalPriceBeforeTax / 100) * IVA) + totalPriceBeforeTax;
	// Now we return the answer
	System.out.println("----------------Here is your total:-----------------");
	System.out.println("----------------------------------------------------");
	System.out.println("· " + productAmmount1 + " of item1 at " + pricePerItemBeforeTax1 + " per item plus 21% tax comes out to: " + totalPriceItem1);
	System.out.println("· " + productAmmount2 + " of item1 at " + pricePerItemBeforeTax2 + " per item plus 21% tax comes out to: " + totalPriceItem2);
	System.out.println("· " + productAmmount3 + " of item1 at " + pricePerItemBeforeTax3 + " per item plus 21% tax comes out to: " + totalPriceItem3);
	System.out.println("\n· The total of all products before tax comes out to " + totalPriceBeforeTax);
	System.out.println("\n· The total of all products after tax comes out to " + totalPrice);
	System.out.println("----------------------------------------------------");
	//
    }
    //
}
// Quack
