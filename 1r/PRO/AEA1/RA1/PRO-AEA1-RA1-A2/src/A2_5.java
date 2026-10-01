//
import java.util.Scanner;
//
public class A2_5 {
    //
    public static void main(String[] args) {
	// Declarar variables
	int num1;
	int num2;
	int num3;
	int numeroGran = 0;
	int numeroMitja = 0;
	int numeroPetit = 0;
	Scanner teclat = new Scanner(System.in);
	// Digues hola
	System.out.println("---------------------------------------------------");
	System.out.println("---Benvingut al programa organitzador de numeros---");
	System.out.println("---------------------------------------------------");
	// Demana els 3 numeros
	System.out.println("Introdueix el primer numero:");
	num1 = teclat.nextInt();
	System.out.println("---------------------------------------------------");
	//
	System.out.println("Introdueix el segon numero:");
	num2 = teclat.nextInt();
	System.out.println("---------------------------------------------------");
	//
	System.out.println("Introdueix el tercer numero:");
	num3 = teclat.nextInt();
	System.out.println("---------------------------------------------------");
	// Determina quin es el numero mes numeroGran i quin es el mes numeroPetit, un cop fet guardal's a la variable corresponent
	if (num1 > num2) {
	    numeroGran = num1;
	    numeroPetit = num2;
	} else if (num1 < num2) {
	    numeroGran = num2;
	    numeroPetit = num1;
	} else if (num1 == num2) {
	    numeroGran = num1;
	    numeroPetit = num1;
	}
	//
	if (num3 > numeroPetit) {
	    if (num3 > numeroGran) {
		numeroMitja = numeroGran;
		numeroGran = num3;
	    } else {
		numeroGran = num3;
	    }
	} else if (num3 < numeroGran) {
	    if (num3 < numeroPetit) {
		numeroMitja = numeroPetit;
		numeroPetit = num3;
	    } else {
		num3 = numeroMitja;
	    }
	} else if (num3 == numeroGran) {
	    numeroMitja = num3;
	} else if (num3 == numeroPetit) {
	    numeroMitja = num3;
	}
	//
	System.out.println("- El numero mes numero mes gran es: " + numeroGran + "\n- El numero del mig es: " + numeroMitja + "\n- El numero mes petit es: " + numeroPetit);
	System.out.println("---------------------------------------------------");
	//
    }
    //
}
// Quack
