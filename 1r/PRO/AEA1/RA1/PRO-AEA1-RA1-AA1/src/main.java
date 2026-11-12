import java.util.Scanner;
//
public class main {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in); // Declarem el scanner per llegir el input
	// La varibale i servira per contar la quantitat de jugadores introduides i per mostrar qun numero de jugadora s'es introduint, la posem a 1 per que començi be
	int i = 1;
	// Aquestes dues son per l'alçada i el pes de cada jugadora
	double h = 0;
	double p;
	// Aqui es guardaran les sumes de les alçades de cada rang de jugadores, despres farem el calcul per saber la mitjana
	double mitjanaAlcadaAltes = 0;
	double mitjanaAlcadaMitjanes = 0;
	double mitjanaAlcadaBaixes = 0;
	// Aqui es guardaran el numero de jugadores a cada rang i despres calcularem el percentage del total que representen
	double porcentageAltes = 0;
	double porcentageMitjanes = 0;
	double porcentageBaixes = 0;
	// Saludem al usuari, i especifiquem que fa aquest programa.
//	System.out.println("--------------------------------------------------------------------------------------");
//	System.out.println("---------------------Programa d'informacio de jugadores de basquet--------------------");
//	System.out.println("--------------------------------------------------------------------------------------");
	// Fem un while perque no sabem quantes repeticions necesitarem, la condicio per que s'acavi es que l'alçada sigui -1
	while (h != -1) {
	    h = 0;
	    p = 0;
	    // A dalt posem h i p a zero per borrar el que hi habia despres d'acabar una repeticio. A baix posem el syso perque el usuari afegeixi la alçada de la jugadora, el numero es dertiminat per i. Despres declarem el valor de h amb el que introdueix el usuari.
	    System.out.print("Introdueix la alçada de la jugadora #" + i + " en metres\n---> ");
	    h = in.nextDouble();
	    // Aquest if es per cumplir la condicio de que una jugadora no pot mesurar menys de 1.20m. En aquest cas continuaria el proces de introduccio de dades si es major que 1.19m. Si es menor directament començara un altre iteracio del while sense tenir en compte aquesta jugadora i retorni un missatge.
	    if (h > 1.19) {
		System.out.print("Introdueix el pes de la jugadora #" + i + " en kilograms\n---> ");
		p = in.nextDouble();
		// Aqui demanem al usuari que introdueixi el pes en kg de la jugadora, tornem a utilitzar i per indicar el numero, ho asignem a p.
		if (h < 1.60 && p > 100) {
		    System.out.println("No es permeten pesos majors de 100kg si es mesura menys d'1.60m!\n");
		    // Un altre excepcio es que si la seva alçada no arriba a 1.60 i pesa mes de 100kg, no es pot introduir. No ho fem com avans, sino a la inversa. Si esta al rang de la excepcio es printa un missatge d'error sense procesar les dades i es pasa a un altre iteraccio del while.
		} else {
		    if (h > 1.80) {
			mitjanaAlcadaAltes += h;
			porcentageAltes ++;
			// Primer afegim la alçada al total del rang i afegim un a la variable del porcentage.
			System.out.printf("%.0f cm -> Jugadora Alta\n", (h * 100));
			System.out.println();
			// Imprimim la alçada en cm sense decimals amb el printf i indiquem el rang, el segon print es per deixar espai entre les entrades.
		    } else if (h < 1.60) {
			mitjanaAlcadaBaixes += h;
			porcentageBaixes ++;
			// Primer afegim la alçada al total del rang i afegim un a la variable del porcentage.
			System.out.printf("%.0f cm -> Jugadora Baixa\n", (h * 100));
			System.out.println();
			// Imprimim la alçada en cm sense decimals amb el printf i indiquem el rang, el segon print es per deixar espai entre les entrades.
		    } else {
			mitjanaAlcadaMitjanes += h;
			porcentageMitjanes ++;
			// Primer afegim la alçada al total del rang i afegim un a la variable del porcentage.
			System.out.printf("%.0f cm -> Jugadora Mitjana\n", (h * 100));
			System.out.println();
			// Imprimim la alçada en cm sense decimals amb el printf i indiquem el rang, el segon print es per deixar espai entre les entrades.
		    }
		    //
		}
		// Sumem 1 a i aqui perque si les dades estan a alguna de les excepcions no es suma el total de jugadores
		i ++;
		// Si el usuari posa -1 i no hi ha aquesta condicio, pasara per tot el bucle i sumara un a i.
	    } else if (h == -1) {
		// Aque es printa el misatge per la condicio on la alçada es menor a 1.20.
	    } else {
		System.out.println("No es permeten alçades menors d'1.20m!\n");
		//
	    }
	    //
	}
	// Mirem si no s'han introduit cap jugadora i printem un misatge dient aixo.
	if (porcentageAltes <= 0 && porcentageMitjanes <= 0 && porcentageBaixes <= 0) {
	    System.out.println("No hi ha cap jugadora.");
	    //
	} else {
	    if (porcentageAltes <= 0) {
		System.out.println("No hi ha cap jugadora alta."); // Mirem si aquest rang esta vuit i ho indiquem.
	    } else {
		mitjanaAlcadaAltes /= porcentageAltes;
		porcentageAltes = (porcentageAltes * 100) / (i - 1);
		// Calculem la mitjana de alçada dividint el total entre el numero de jugadores en aquest rang. Despres calculem el percentage d'aquest rang sobre el total fent una regla de tres i restant 1 a i perque comença a 1.
		System.out.println("Alçada mitjana de les altes: " + mitjanaAlcadaAltes + "m");
		// Aqui printem la mitjana de alçada en aquest rang.
	    }
	    //
	    if (porcentageMitjanes <= 0) {
		System.out.println("No hi ha cap jugadora mitjana."); // Mirem si aquest rang esta vuit i ho indiquem.
	    } else {
		mitjanaAlcadaMitjanes /= porcentageMitjanes;
		porcentageMitjanes = (porcentageMitjanes * 100) / (i - 1);
		// Calculem la mitjana de alçada dividint el total entre el numero de jugadores en aquest rang. Despres calculem el percentage d'aquest rang sobre el total fent una regla de tres i restant 1 a i perque comença a 1.
		System.out.println("Alçada mitjana de les mitjanes: " + mitjanaAlcadaMitjanes + "m");
		// Aqui printem la mitjana de alçada en aquest rang.
	    }
	    //
	    if (porcentageBaixes <= 0) {
		System.out.println("No hi ha cap jugadora baixa."); // Mirem si aquest rang esta vuit i ho indiquem.
	    } else {
		mitjanaAlcadaBaixes /= porcentageBaixes;
		porcentageBaixes = (porcentageBaixes * 100) / (i - 1);
		// Calculem la mitjana de alçada dividint el total entre el numero de jugadores en aquest rang. Despres calculem el percentage d'aquest rang sobre el total fent una regla de tres i restant 1 a i perque comença a 1.
		System.out.println("Alçada mitjana de les baixes: " + mitjanaAlcadaBaixes + "m\n");
		// Aqui printem la mitjana de alçada en aquest rang.
	    }
	    // Aqui calculem la alçada mitjana entre tots els rangs.
	    System.out.println("Alçada mitjana de totes les jugadores: " + (mitjanaAlcadaAltes + mitjanaAlcadaMitjanes + mitjanaAlcadaBaixes) / 3 + "m\n");
	    // Aqui printem el porcentage que representa el rang sobre el total.
	    System.out.println("El percentatge de jugadores altes sobre el total és: " + porcentageAltes);
	    System.out.println("El percentatge de jugadores mitjanes sobre el total és: " + porcentageMitjanes);
	    System.out.println("El percentatge de jugadores baixes sobre el total és: " + porcentageBaixes);
	    //
	}
	//
    }
    //
}
// Quack
