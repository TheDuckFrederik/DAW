//
import java.util.Scanner;
//
public class A2_StringChars_3 {
    //
    public static void main(String[] args) {
	// Declarar variables
	char lletra;
	String tipusDeLletra;
	Scanner teclat = new Scanner(System.in);
	// Digues hola
	System.out.println("------------------------------------------------");
	System.out.println("---Benvingut al programa de vocal o consonant---");
	System.out.println("------------------------------------------------");
	// Demana la lletra
	System.out.println("Introdueix la lletra de la operacio en minuscula:");
	lletra = teclat.next().charAt(0);
	System.out.println("-----------------------------------------------");
	// Comprova el input, si cal fa una operacio
	if (lletra == 'a') {
	    tipusDeLletra = "Vocal";
	} else if (lletra == 'e') {
	    tipusDeLletra = "Vocal";
	} else if (lletra == 'i') {
	    tipusDeLletra = "Vocal";
	} else if (lletra == 'o') {
	    tipusDeLletra = "Vocal";
	} else if (lletra == 'u') {
	    tipusDeLletra = "Vocal";
	} else {
	    tipusDeLletra = "Consonant";
	}
	//
	System.out.println("- La lletra " + lletra + " es una: " + tipusDeLletra);
	System.out.println("-----------------------------------------------");
	//
    }
    //
}
// Quack
