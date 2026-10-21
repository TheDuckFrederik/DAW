// Esquema de la entrada: número de casos
import java.util.*;
//
public class Solution {
	//
	static Scanner in;
	//
	public static int casoDePrueba() {
		// Declarar variables
		int numeroInsertado;
		int numMayorMenor;
		int numMenorMayor;
		int numDivision;
		int mult;
		int iteraciones = 1;
		int[] numIndividuales = new int[4];
		boolean numKaprekarEncontrado = false;
		// Recoger numero
		numeroInsertado = in.nextInt();
		// Primero comprovamos que el numero introducido no sea el numero Kaprekar
		if (numeroInsertado == 6174) {
			iteraciones = 0;
			numKaprekarEncontrado = true;
		}
		// Empiezo un bucle que hace las iteracioneses hasta que se llegue al numero de Kaprekar
		while (numKaprekarEncontrado == false) {
			// Estas variables deben tener un valor especifico al principio de este bucle para que funcionen
			numMayorMenor = 0;
			numMenorMayor = 0;
			numDivision = 0;
			Arrays.fill(numIndividuales, 0);
			mult = 1000;
			// Uso esta variable para reducir el numero y poder sacar los numero individualemte para el array
			numDivision = numeroInsertado;
			// Ahora pongo los numeros individualmente dentro del array
			for (int i = 0; i < 4; ++ i) {
				//
				numIndividuales[i] = numDivision % 10;
				numDivision /= 10;
				//
			}
			// Hacemos un sort del array para poder sacar el numero de menor a mayor
			Arrays.sort(numIndividuales);
			//Compruebo si el numero no tiene al menos dos digitos diferentes, si es asi las iteraciones se igualan a 8 y se sale del bucle
			if (numIndividuales[0] == numIndividuales[1] && numIndividuales[1] == numIndividuales[2] && numIndividuales[2] == numIndividuales[3]) {
				iteraciones = 7;
				numKaprekarEncontrado = true;
			}
			// Pongo el numero ordenado en una variable
			for (int i = 0; i < 4; ++ i) {
				numMenorMayor += numIndividuales[i] * mult;
				mult /= 10;
			}
			// Uso esta variable para reducir el numero y poder sacar el numero inverso. Y vuelvo a poner el valor de mult a 1000 para las 4 divisiones
			mult = 1000;
			// Saco los numeros del array de forma inversa para sacar el numero mayor a menor
			for (int i = 3; i > -1; -- i) {
				numMayorMenor += numIndividuales[i] * mult;
				mult /= 10;
			}
			// Comprueba si se ha encontrado el numero de Kaprekar. Sino, la resta se asigna al numeroInsertado y sume uno a la iteraciones
			if (numMayorMenor - numMenorMayor == 6174) {
				numKaprekarEncontrado = true;
			} else {
				numeroInsertado = numMayorMenor - numMenorMayor;
				++ iteraciones;
			}
			//
		}
		//
		return iteraciones;
		//
	}
	//
	public static void main(String[] args) {
		//
		in = new java.util.Scanner(System.in);
		//
		int numCasos = in.nextInt();
		int[] respuestas = new int[numCasos];
		//
		for (int i = 0; i < numCasos; i++)
			respuestas[i] = casoDePrueba();
		//
		for (int i = 0; i < numCasos; i++)
			System.out.println(respuestas[i]);
		//
	}
	//
}
// Quack
