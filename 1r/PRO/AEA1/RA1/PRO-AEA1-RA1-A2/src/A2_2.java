//
import java.util.Scanner;
//
public class A2_2 {
    //
    public static void main(String[] args) {
	// Declarar variables
	int num;
	String tipusNumero;
	Scanner teclat = new Scanner(System.in);
	// Digues hola
	System.out.println("-------------------------------------------------------");
	System.out.println("---Benvingut al programa de numeros parells o senars---");
	System.out.println("-------------------------------------------------------");
	// Demana el numero
	System.out.println("Introdueix el numero:");
	num = teclat.nextInt();
	System.out.println("-------------------------------------------------------");
	// Determina si el numero es parell o senar
	if ((num % 2) == 0) {
	    tipusNumero = "parell";
	} else {
	    tipusNumero = "senar";
	}
	//
	System.out.println("- El numero " + num + " es " + tipusNumero);
	System.out.println("-------------------------------------------------------");
	//
    }
    //
}
// Quack
