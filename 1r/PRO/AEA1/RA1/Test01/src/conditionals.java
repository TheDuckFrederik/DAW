import java.util.Scanner;
//
public class conditionals {
//
    public static void main(String[] args) {
	//
	System.out.println("--------------------------------");
	//
	int age;
	Scanner keyboard = new Scanner(System.in);
	//
	System.out.println("What is your age?\n--------------------------------");
	age = keyboard.nextInt();
	//
	System.out.println("--------------------------------");
	//
	if (age >= 18 && age < 30) {
	    System.out.println("Go ahead man");
	} else if (age >= 30) {
	    System.out.println("Come right in Sir");
	} else {
	    System.out.println("Get lost kid!");
	}
	//
	System.out.println("--------------------------------");
	//
    }
    //
}
// Quack
