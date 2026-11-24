//
import java.util.*;
//
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//
		int numeroDeAlturas;
		int[] alturas;
		int picos;
		//
		while (in.hasNext()) {
			picos = 0;
			//
			numeroDeAlturas = in.nextInt();
			//
			if (numeroDeAlturas == 0) {
				break;
				//
			}
			//
			alturas = new int[numeroDeAlturas];
			for (int i = 0; i < alturas.length; i ++) {
				alturas[i] = in.nextInt();
			}
			//
			for (int i = 0; i < alturas.length; i ++) {
				if (i == 0) {
					if (alturas[i] > alturas[alturas.length - 1] && alturas[i] > alturas[i + 1]) {
						picos ++;
						//
					}
					//
				} else if (i == (alturas.length - 1)) {
					if (alturas[i] > alturas[0] && alturas[i] > alturas[i - 1]) {
						picos ++;
						//
					}
					//
				} else {
					if (alturas[i] > alturas[i - 1] && alturas[i] > alturas[i + 1]) {
						picos ++;
						//
					}
					//
					//
				}
				//
			}
			//
			System.out.println(picos);
			//
		}
		//
		in.close();
		//
	}
	//
}
// Quack
