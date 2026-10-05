//
import java.util.Scanner;
//
public class A2_6 {
    //
    public static void main(String[] args) {
	// Declarar variables
	int num1;
	int num2;
	int num3;
	Scanner teclat = new Scanner(System.in);
	// Digues hola
	System.out.println("------------------------------------------------------");
	System.out.println("---Benvingut al programa de comprovacio de sumatori---");
	System.out.println("------------------------------------------------------");
	// Demana els 3 numeros
	System.out.println("Introdueix el primer numero:");
	num1 = teclat.nextInt();
	System.out.println("------------------------------------------------------");
	//
	System.out.println("Introdueix el segon numero:");
	num2 = teclat.nextInt();
	System.out.println("------------------------------------------------------");
	//
	System.out.println("Introdueix el tercer numero:");
	num3 = teclat.nextInt();
	System.out.println("------------------------------------------------------");
	// Determina si el tercer numero es la suma del primer i el segon
	if ((num1 + num2) == num3) {
	    System.out.println("- Correcte, "+ num1 + " + " + num2 + " = " + num3);
	    System.out.println("------------------------------------------------------");
	} else {
	    System.out.println("- Incorrecte, "+ num1 + " + " + num2 + " != " + num3);
	    System.out.println("------------------------------------------------------");
	}
	//
    }
    //
}
// Quack
