// Import the math class
import java.lang.Math;
//
public class A1_17 {
    //
    public static void main(String[] args) {
	// Declare test variables
	int x = 7;
	int y = 3;
	double a = -3.7;
	// First we try the Math methods
	Math.abs(a); // Calculates the absolute of the value inserted
	Math.round(a); // It rounds the number inserted, up or down. Whatever's nearest
	Math.pow(x, y); // Insert two values, and you get the result of x to the power of y
	// Now the cast
	int toInt = (int) a;
	double toDouble = (double) x;
	//
    }
    //
}
// Quack
