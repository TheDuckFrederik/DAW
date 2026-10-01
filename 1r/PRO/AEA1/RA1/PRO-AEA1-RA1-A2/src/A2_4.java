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
	// Determina si el numero esta entre l'1 i el 7
	if (num >= 1 && num <= 7) {
	    // Saber quin dia de la setmana es
	    if (num == 1) {
		System.out.println("- El numero " + num + " orrespon al Dilluns");
		System.out.println("----------------------------------------------");
	    } else if (num == 2) {
		System.out.println("- El numero " + num + " orrespon al Dimarts");
		System.out.println("----------------------------------------------");
	    } else if (num == 3) {
		System.out.println("- El numero " + num + " orrespon al Dimecres");
		System.out.println("----------------------------------------------");
	    } else if (num == 4) {
		System.out.println("- El numero " + num + " orrespon al Dijous");
		System.out.println("----------------------------------------------");
	    } else if (num == 5) {
		System.out.println("- El numero " + num + " orrespon al Divendres");
		System.out.println("----------------------------------------------");
	    } else if (num == 6) {
		System.out.println("- El numero " + num + " orrespon al Dissabte");
		System.out.println("----------------------------------------------");
	    } else if (num == 7) {
		System.out.println("- El numero " + num + " orrespon al Diumenje");
		System.out.println("----------------------------------------------");
	    }
	} else {
	    System.out.println("- El numero " + num + " no correspon a cap dia de la setmana");
	    System.out.println("----------------------------------------------");
	}
	//
    }
    //
}
// Quack
