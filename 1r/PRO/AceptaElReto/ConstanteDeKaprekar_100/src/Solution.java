// Esquema de la entrada: número de casos
import java.util.*;

public class Solution {

	static Scanner in;

	public static void casoDePrueba() {
		//
		int numCompleto;
		int conversionNum;
		int numInvertido = 0;
		int mult = 1000;
		int iteraciones = 1;
		int[] arrayNumeros = new int[4];
		boolean numKaprekarEncontrado = false;
		//e
		System.out.println("Introduce el numero:");
		numCompleto = in.nextInt();
		//
		while (numKaprekarEncontrado != true) {
			//
			conversionNum = numCompleto;
			// Mete numeros en el array
			for (int i = 0; i < 4 ; ++i) {
				arrayNumeros[i] = conversionNum % 10;
				conversionNum = conversionNum / 10;
			}
			// Igualamos a 0 para que al volver a meter el numero en la variable no sume de mas
			numCompleto = 0;
			// Ordenar de mayor a menor
			Arrays.sort(arrayNumeros);
			//
			for (int i = 0; i < 4 ; ++i) {
				numCompleto = (arrayNumeros[i] * mult) + numCompleto;
			}
			// Invierte el numero
			conversionNum = numCompleto;
			numInvertido = 0;
			//
			while (conversionNum > 0) {
				numInvertido = ((conversionNum % 10) * mult) + numInvertido;
				conversionNum = conversionNum / 10;
				mult = mult / 10;
			}
			// Comprueba si es el numero
			if (numCompleto - numInvertido == 6174) {
				numKaprekarEncontrado = true;
			} else {
				numCompleto = numCompleto - numInvertido;
				//
				++ iteraciones;
			}
			// De no serlo vuelve a empezar
		}
		//
		System.out.println(iteraciones);
		//
	}
	//
	public static void main(String[] args) {
		//
		in = new java.util.Scanner(System.in);
		//
		int numCasos = in.nextInt();
		for (int i = 0; i < numCasos+1; i++)
			casoDePrueba();
		//
	}
	//
}
// Quack
