//
import java.util.Scanner;
//
public class A2_StringChars_1 {
    //
    public static void main(String[] args) {
	// Declarar variables
	String diaDeLaSetmana;
	Scanner teclat = new Scanner(System.in);
	// Digues hola
	System.out.println("---------------------------------------------------------");
	System.out.println("---Benvingut al diaDeLaSetmanaero de dia de la setmana---");
	System.out.println("---------------------------------------------------------");
	// Demana el dia de la setmana
	System.out.println("Introdueix el dia de la setmana:");
	diaDeLaSetmana = teclat.next();
	System.out.println("---------------------------------------------------------");
	// Saber quin dia de la setmana es
	if (diaDeLaSetmana.equals("Dilluns")) {
	    System.out.println("- El dia de la setmana " + diaDeLaSetmana + " correspon al numero 1");
	    System.out.println("---------------------------------------------------------");
	} else if (diaDeLaSetmana.equals("Dimarts")) {
	    System.out.println("- El dia de la setmana " + diaDeLaSetmana + " correspon al numero 2");
	    System.out.println("---------------------------------------------------------");
	} else if (diaDeLaSetmana.equals("Dimecres")) {
	    System.out.println("- El dia de la setmana " + diaDeLaSetmana + " correspon al numero 3");
	    System.out.println("---------------------------------------------------------");
	} else if (diaDeLaSetmana.equals("Dijous")) {
	    System.out.println("- El dia de la setmana " + diaDeLaSetmana + " correspon al numero 4");
	    System.out.println("---------------------------------------------------------");
	} else if (diaDeLaSetmana.equals("Divendres")) {
	    System.out.println("- El dia de la setmana " + diaDeLaSetmana + " correspon al numero 5");
	    System.out.println("---------------------------------------------------------");
	} else if (diaDeLaSetmana.equals("Dissabte")) {
	    System.out.println("- El dia de la setmana " + diaDeLaSetmana + " correspon al numero 6");
	    System.out.println("---------------------------------------------------------");
	} else if (diaDeLaSetmana.equals("Diumenje")) {
	    System.out.println("- El dia de la setmana " + diaDeLaSetmana + " correspon al numero 7");
	    System.out.println("---------------------------------------------------------");
	} else {
	    System.out.println("-----------------------Syntax Err------------------------");
	    System.out.println("---------------------------------------------------------");
	}
	//
    }
    //
}
// Quack
