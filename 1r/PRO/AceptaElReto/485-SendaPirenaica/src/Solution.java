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
			}
			//
			for (int j = 0; j < (longitudDeEtapa.length - 1); j ++) {
				if (j == 0) {
					if (numeroDeEtapas == 1) {
						System.out.println(distanciaHastaLaMeta);
						//
					} else {
						System.out.print(distanciaHastaLaMeta + " ");
						//
					}
					//
				} else if (j != longitudDeEtapa.length - 2) {
					System.out.print((distanciaHastaLaMeta -= longitudDeEtapa[j]) + " ");
					//
				} else {
					System.out.println((distanciaHastaLaMeta -= longitudDeEtapa[j]));
					//
				}
				//
			}
			//
		}
		//
		in.close();
		//
	}
	//
}
// Quack
