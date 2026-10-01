//
import java.util.Scanner;
//
public class A2_3 {

    public static void main(String[] args) {
	// Declarar variables
	int num;
	String multipleDeDos;
	String multipleDeCinc;
	String tipusNumero;
	Scanner teclat = new Scanner(System.in);
	// Digues hola
	System.out.println("-----------------------------------------------------------");
	System.out.println("---Benvingut al programa de numeros multiples de 2 i/o 5---");
	System.out.println("-----------------------------------------------------------");
	// Demana el numero
	System.out.println("Introdueix el numero:");
	num = teclat.nextInt();
	System.out.println("-----------------------------------------------------------");
	// Determina si el numero es multiple de 2
	if ((num % 2) == 0) {
	    multipleDeDos = "si";
	} else {
	    multipleDeDos = "no";
	}
	// Determina si el numero es multiple de 5
	if ((num % 5) == 0){
	    multipleDeCinc = "si";
	} else {
	    multipleDeCinc = "no";
	}
	//
	System.out.println("- El numero " + num + " " + multipleDeDos + " es multiple de 2" + " i " + multipleDeCinc + " es multiple de 5");
	System.out.println("-----------------------------------------------------------");
	//
    }
    //
}
// Quack