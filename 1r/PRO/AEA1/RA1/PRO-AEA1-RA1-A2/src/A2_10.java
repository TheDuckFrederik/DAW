//
import java.util.Scanner;
//
public class A2_10 {
    //
    public static void main(String[] args) {
	// Declarar variables
	double nota;
	String rangNota = "";
	Scanner teclat = new Scanner(System.in);
	// Digues hola
	System.out.println("-----------------------------------------------------");
	System.out.println("---Benvingut al programa de calcul de rang de nota---");
	System.out.println("-----------------------------------------------------");
	// Demana el numero d'anys que han treballat
	System.out.println("Introdueix la teva nota:");
	nota = teclat.nextInt();
	System.out.println("-----------------------------------------------------");
	// Determina quin es el rang de la nota
	if (nota == 10) {
	    rangNota = "Matricula d'honor";
	} else if (nota == 9) {
	    rangNota = "Excel·lent";
	} else if (nota > 7 && nota < 9) {
	    rangNota = "Notable";
	} else if (nota == 6) {
	    rangNota = "Be";
	} else if (nota == 5) {
	    rangNota = "Suficient";
	} else if (nota < 5) {
	    rangNota = "Insuficient";
	}
	//
	System.out.println("- El rang de la teva nota es: " + rangNota);
	System.out.println("-----------------------------------------------------");
	//
    }
    //
}
// Quack
