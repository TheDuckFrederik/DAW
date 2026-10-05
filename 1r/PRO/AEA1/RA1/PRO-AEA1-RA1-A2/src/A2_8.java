//
import java.util.Scanner;
//
public class A2_8 {
    //
    public static void main(String[] args) {
	// Declarar variables
	double preu;
	Scanner teclat = new Scanner(System.in);
	// Digues hola
	System.out.println("-------------------------------------------------");
	System.out.println("---Benvingut al programa de calcul de impostos---");
	System.out.println("-------------------------------------------------");
	// Demana el preu sense impostos
	System.out.println("Introdueix el import sense impostos del producte:");
	preu = teclat.nextInt();
	System.out.println("-------------------------------------------------");
	// Determina quin tipus d'impost s'ha d'aplicar i l'aplica
	if (preu > 15000) {
	    preu = preu + (preu * 0.16);
	} else {
	    preu = preu + (preu * 0.1);
	}
	//
	System.out.println("- El preu despres d'aplicar els impostos es: " + preu);
	System.out.println("-------------------------------------------------");
	//
    }
    //
}
// Quack
