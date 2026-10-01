//
import java.util.Scanner;
//
public class A2_1 {
    //
    public static void main(String[] args) {
	// Declarar variables
	int num1;
	int num2;
	int num3;
	int gran = 0;
	int petit = 0;
	Scanner teclat = new Scanner(System.in);
	// Digues hola
	System.out.println("---------------------------------------------------");
	System.out.println("---Benvingut al programa organitzador de numeros---");
	System.out.println("---------------------------------------------------");
	// Demana els 3 numeros
	System.out.println("Introdueix el primer numero:");
	num1 = teclat.nextInt();
	System.out.println("---------------------------------------------------");
	//
	System.out.println("Introdueix el segon numero:");
	num2 = teclat.nextInt();
	System.out.println("---------------------------------------------------");
	//
	System.out.println("Introdueix el tercer numero:");
	num3 = teclat.nextInt();
	System.out.println("---------------------------------------------------");
	// Determina quin es el numero mes gran i quin es el mes petit, un cop fet guardal's a la variable corresponent
	if (num1 > num2) {
	    gran = num1;
	    petit = num2;
	} else if (num1 < num2) {
	    gran = num2;
	    petit = num1;
	} else if (num1 == num2) {
	    gran = num1;
	    petit = num1;
	}
	//
	if (num3 > gran) {
	    gran = num3;
	} else if (num3 < petit) {
	    petit = num3;
	} // No cal posar condicio per el cas de que num3 sigui igual que gan o petit perque ja tenen el valor
	//
	System.out.println("- El numero mes gran es: " + gran + "\n- El numero mes petit es: " + petit);
	System.out.println("---------------------------------------------------");
	//
    }
    //
}
// Quack
