//
import java.util.*;
//
public class Solution {
	//
	static Scanner in;

	public static int casoDePrueba(String numeroCasoDePruba) {
		//
		int timeInMinutes = ((((int) numeroCasoDePruba.charAt(0)) - 48) * 10) * 60;
        timeInMinutes += (((int) numeroCasoDePruba.charAt(1)) - 48) * 60;
        timeInMinutes += (((int) numeroCasoDePruba.charAt(3)) - 48) * 10;
        timeInMinutes += ((int) numeroCasoDePruba.charAt(4)) - 48;
		//
		return 1440 - timeInMinutes;
		//
	}
	//
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String numeroCasoDePruba;
		boolean ended = false;
		//
		numeroCasoDePruba = "";
		//
		while (!ended) {
			numeroCasoDePruba = in.next();
			if (numeroCasoDePruba.equals("00:00")) {
				ended = true;
			} else {
				System.out.println(casoDePrueba(numeroCasoDePruba));
			}
			//
		}
		//
	}
	//
}
//
