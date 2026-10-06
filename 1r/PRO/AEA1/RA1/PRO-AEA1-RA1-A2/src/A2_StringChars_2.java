//
import java.util.Scanner;
//
public class A2_StringChars_2 {
    //
    public static void main(String[] args) {
	// Declarar variables
	int num1;
	int num2;
	char operacio;
	Scanner teclat = new Scanner(System.in);
	// Digues hola
	System.out.println("-----------------------------------------------");
	System.out.println("---Benvingut al programa sumatori per lletra---");
	System.out.println("-----------------------------------------------");
	// Demana els 2 numeros i la lletra
	System.out.println("Introdueix el primer numero:");
	num1 = teclat.nextInt();
	System.out.println("-----------------------------------------------");
	//
	System.out.println("Introdueix els segon numero:");
	num2 = teclat.nextInt();
	System.out.println("-----------------------------------------------");
	//
	System.out.println("Introdueix la lletra de la operacio en minuscula:");
	operacio = teclat.next().charAt(0);
	System.out.println("-----------------------------------------------");
	// Comprova el input, si cal fa una operacio
	if (operacio == 's') {
	    System.out.println("- La oeracio es suma:\n· " + num1 + " + " + num2 + " = " + (num1 + num2));
	    System.out.println("----------------------------------------------");
	} else if (operacio == 'r') {
	    System.out.println("- La oeracio es resta:\n· " + num1 + " - " + num2 + " = " + (num1 - num2));
	    System.out.println("----------------------------------------------");
	} else if (operacio == 'm') {
	    System.out.println("- La oeracio es suma:\n· " + num1 + " * " + num2 + " = " + (num1 * num2));
	    System.out.println("----------------------------------------------");
	} else if (operacio == 'd') {
	    System.out.println("- La oeracio es suma:\n· " + num1 + " / " + num2 + " = " + (num1 / num2));
	    System.out.println("----------------------------------------------");
	} else {
	    System.out.println("-----------------------Syntax Err------------------------");
	    System.out.println("---------------------------------------------------------");
	}
	//
    }
    //
}
// Quack
