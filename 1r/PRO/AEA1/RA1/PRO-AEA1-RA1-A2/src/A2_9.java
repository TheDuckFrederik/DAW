//
import java.util.Scanner;
//
public class A2_9 {
    //
    public static void main(String[] args) {
	// Declarar variables
	double anysTreballats;
	double salari = 40000;
	Scanner teclat = new Scanner(System.in);
	// Digues hola
	System.out.println("--------------------------------------------");
	System.out.println("---Benvingut al programa de calcul de sou---");
	System.out.println("--------------------------------------------");
	// Demana el numero d'anys que han treballat
	System.out.println("Introdueix els anys que tens treaballats:");
	anysTreballats = teclat.nextInt();
	System.out.println("--------------------------------------------");
	// Determina quin es el porcentage de pujada s'ha d'aplicar i l'aplica
	if (anysTreballats >= 10) {
	    salari = salari + (salari * 0.1);
	} else if (anysTreballats >= 5) {
	    salari = salari + (salari * 0.07);
	} else if (anysTreballats >= 3) {
	    salari = salari + (salari * 0.05);
	} else {
	    salari = salari + (salari * 0.03);
	}
	//
	System.out.println("- El teu salari despres de la pujada es: " + salari);
	System.out.println("--------------------------------------------");
	//
    }
    //
}
// Quack
