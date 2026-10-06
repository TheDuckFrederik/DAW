//
import java.util.Scanner;
//
public class A2_12 {
    //
    public static void main(String[] args) {
	// Declarar variables
	int hores;
	int minuts;
	int segons;
	Scanner teclat = new Scanner(System.in);
	// Digues hola
	System.out.println("----------------------------------------------------");
	System.out.println("---Benvingut al programa de calcul de temps futur---");
	System.out.println("----------------------------------------------------");
	// Demana les hores, minuts, segons
	System.out.println("Introdueix les hores:");
	hores = teclat.nextInt();
	System.out.println("----------------------------------------------------");
	//
	System.out.println("Introdueix els minuts:");
	minuts = teclat.nextInt();
	System.out.println("----------------------------------------------------");
	//
	System.out.println("Introdueix els segons:");
	segons = teclat.nextInt();
	System.out.println("----------------------------------------------------");
	// Afegim un segon
	++ segons;
	// Calcula el temps total amb el segon afegit
	if (minuts >= 60) {
	    segons = segons + (minuts * 60) + (hores * 3600);
	    //
	    hores = segons / 3600;
	    minuts = (segons / 3600) % 60;
	    segons = segons % 60;
	} else if (segons >= 60) {
	    segons = segons + (minuts * 60) + (hores * 3600);
	    //
	    hores = segons / 3600;
	    minuts = (segons / 3600) % 60;
	    segons = segons % 60;
	}
	//
	System.out.println("- Despres d'un segon el temps ha pasat a ser:\n- " + hores + " hores\n- " + minuts + " minuts\n- " + segons + " segons");
	System.out.println("---------------------------------------------------");
	//
    }
    //
}
// Quack
