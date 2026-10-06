//
import java.util.Scanner;
//
public class A2_4 {
    //
    public static void main(String[] args) {
	// Declarar variables
	int num;
	Scanner teclat = new Scanner(System.in);
	// Digues hola
	System.out.println("----------------------------------------------");
	System.out.println("---Benvingut al numero de dia de la setmana---");
	System.out.println("----------------------------------------------");
	// Demana el numero
	System.out.println("Introdueix el numero:");
	num = teclat.nextInt();
	System.out.println("----------------------------------------------");
	// Saber quin dia de la setmana es
	if (num == 1) {
	    System.out.println("- El numero " + num + " correspon al Dilluns");
	    System.out.println("----------------------------------------------");
	} else if (num == 2) {
	    System.out.println("- El numero " + num + " correspon al Dimarts");
	    System.out.println("----------------------------------------------");
	} else if (num == 3) {
	    System.out.println("- El numero " + num + " correspon al Dimecres");
	    System.out.println("----------------------------------------------");
	} else if (num == 4) {
	    System.out.println("- El numero " + num + " correspon al Dijous");
	    System.out.println("----------------------------------------------");
	} else if (num == 5) {
	    System.out.println("- El numero " + num + " correspon al Divendres");
	    System.out.println("----------------------------------------------");
	} else if (num == 6) {
	    System.out.println("- El numero " + num + " correspon al Dissabte");
	    System.out.println("----------------------------------------------");
	} else if (num == 7) {
	    System.out.println("- El numero " + num + " correspon al Diumenje");
	    System.out.println("----------------------------------------------");
	} else {
	    System.out.println("- El numero " + num + " no correspon a cap dia de la setmana");
	    System.out.println("----------------------------------------------");
	}
	//
    }
    //
}
// Quack
