//
import java.util.Scanner;
//
public class A3_1 {
    //
    public static void main(String[] args) {
	//
	int num1;
	int num2;
	Scanner teclat = new Scanner(System.in);
	// Digues hola
	System.out.println("------------------------------------------------");
	System.out.println("---Benvingut al programa de parell o imparell---");
	System.out.println("------------------------------------------------");
	// Demana els numeros
	System.out.println("Introdueix el primer numero:");
	num1 = teclat.nextInt();
	System.out.println("------------------------------------------------");
	System.out.println("Introdueix el segon numero:");
	num2 = teclat.nextInt();
	System.out.println("------------------------------------------------");
	//
	if (num1 % 2 == 0) {
	    System.out.println("- El numero " + num1 + " es parell");
	} else {
	    System.out.println("- El numero " + num1 + " es imparell");
	}
	//
	if (num2 % 2 == 0) {
	    System.out.println("- El numero " + num2 + " es parell");
	} else {
	    System.out.println("- El numero " + num2 + " es imparell");
	}
	//
	System.out.println("-------------------------------------------------");
	//
    }
    //
}
// Quack
