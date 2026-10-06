//
import java.util.Scanner;
//
public class A2_11 {
    //
    public static void main(String[] args) {
	// Declarar variables
	int any;
	int mes;
	int dia;
	final int ANY_ACTUAL = 2026;
	String anyCorrecte = "incorrecte";
	String mesCorrecte = "incorrecte";
	String diaCorrecte = "incorrecte";
	Scanner teclat = new Scanner(System.in);
	// Digues hola
	System.out.println("---------------------------------------------------");
	System.out.println("---Benvingut al programa de comprovacio de dates---");
	System.out.println("---------------------------------------------------");
	// Demana el any, el mes i el dia
	System.out.println("Introdueix el any:");
	any = teclat.nextInt();
	System.out.println("---------------------------------------------------");
	//
	System.out.println("Introdueix el mes:");
	mes = teclat.nextInt();
	System.out.println("---------------------------------------------------");
	//
	System.out.println("Introdueix el dia:");
	dia = teclat.nextInt();
	System.out.println("---------------------------------------------------");
	// Determina si la data es correcta
	if (any <= ANY_ACTUAL) {
	    //
	    anyCorrecte = "correcte";
	    //
	    if (mes >= 1 && mes <= 12) { // Primer mira si el mes esta dintre del rang de mesos correctes
		if (mes <= 12) {
		    //
		    mesCorrecte = "correcte";
		    //
		    if (mes == 2) { // Comprovem que el mes sigui febrer
			if (any % 4 == 0) { // Mirem si es un any de traspàs, si ho es
			    if (dia >= 1) { // Si el dia esta dintre del rang de dies correctes marquem el dia com correcte
				if (dia <= 29) {
				    diaCorrecte = "correcte";
				}
			    }
			} else { // No es un any de traspàs
			    if (dia >= 1) { // Si el dia esta dintre del rang de dies correctes marquem el dia com correcte
				if (dia <= 28) {
				    diaCorrecte = "correcte";
				}
			    }
			}
		    }
		    // Ara comprovem els mesos de 31 dies
		    if (mes == 1) {
			if (dia >= 1) { // Si el dia esta dintre del rang de dies correctes marquem el dia com correcte
			    if (dia <= 31) {
				diaCorrecte = "correcte";
			    }
			}
		    } else if (mes == 3) {
			if (dia >= 1) { // Si el dia esta dintre del rang de dies correctes marquem el dia com correcte
			    if (dia <= 31) {
				diaCorrecte = "correcte";
			    }
			}
		    } else if (mes == 5) {
			if (dia >= 1) { // Si el dia esta dintre del rang de dies correctes marquem el dia com correcte
			    if (dia <= 31) {
				diaCorrecte = "correcte";
			    }
			}
		    } else if (mes == 7) {
			if (dia >= 1) { // Si el dia esta dintre del rang de dies correctes marquem el dia com correcte
			    if (dia <= 31) {
				diaCorrecte = "correcte";
			    }
			}
		    } else if (mes == 8) {
			if (dia >= 1) { // Si el dia esta dintre del rang de dies correctes marquem el dia com correcte
			    if (dia <= 31) {
				diaCorrecte = "correcte";
			    }
			}
		    } else if (mes == 10) {
			if (dia >= 1) { // Si el dia esta dintre del rang de dies correctes marquem el dia com correcte
			    if (dia <= 31) {
				diaCorrecte = "correcte";
			    }
			}
		    } else if (mes == 12) {
			if (dia >= 1) { // Si el dia esta dintre del rang de dies correctes marquem el dia com correcte
			    if (dia <= 31) {
				diaCorrecte = "correcte";
			    }
			}
		    }
		    //  Ara comprovem els mesos de 30 dies
		    if (mes == 4) {
			if (dia >= 1) { // Si el dia esta dintre del rang de dies correctes marquem el dia com correcte
			    if (dia <= 30) {
				diaCorrecte = "correcte";
			    }
			}
		    } else if (mes == 6) {
			if (dia >= 1) { // Si el dia esta dintre del rang de dies correctes marquem el dia com correcte
			    if (dia <= 30) {
				diaCorrecte = "correcte";
			    }
			}
		    } else if (mes == 9) {
			if (dia >= 1) { // Si el dia esta dintre del rang de dies correctes marquem el dia com correcte
			    if (dia <= 30) {
				diaCorrecte = "correcte";
			    }
			}
		    } else if (mes == 11) {
			if (dia >= 1) { // Si el dia esta dintre del rang de dies correctes marquem el dia com correcte
			    if (dia <= 30) {
				diaCorrecte = "correcte";
			    }
			}
		    }
		    //
		}
	    }
	}
	//
	System.out.println("- El dia " + dia + " es: " + diaCorrecte + "\n- El mes " + mes + " es: " + mesCorrecte + "\n- El any " + any + " es: " + anyCorrecte);
	System.out.println("---------------------------------------------------");
	//
    }
    //
}
// Quack
