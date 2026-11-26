//
import java.util.*;
//
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//
		int numeroDeEtapas;
		int[] longitudDeEtapa;
		int distanciaHastaLaMeta;
		//
		while (in.hasNext()) {
			distanciaHastaLaMeta = 0;
			//
			numeroDeEtapas = in.nextInt();
			//
			if (numeroDeEtapas == 0) {
				break;
				//
			}
			//
			longitudDeEtapa = new int[numeroDeEtapas];
			for (int i = 0; i < longitudDeEtapa.length; i ++) {
				longitudDeEtapa[i] = in.nextInt();
				distanciaHastaLaMeta += longitudDeEtapa[i];
				//
			}
			//
			if (numeroDeEtapas == 1) {
				System.out.print(distanciaHastaLaMeta);
				//
			} else {
				System.out.print(distanciaHastaLaMeta + " ");
				//
			}
			//
			for (int i = 0; i < (longitudDeEtapa.length - 1); i ++) {
				distanciaHastaLaMeta -= longitudDeEtapa[i];
				//
				System.out.print(distanciaHastaLaMeta);
				//
				if (i < (longitudDeEtapa.length - 2)) {
					System.out.print(" ");
				}
				//
			}
			//
			System.out.println();
			//
		}
		//
		in.close();
		//
	}
	//
}
// Quack
