//	Console.WriteLine("------------------------------------------------------------------------------");
//	Console.WriteLine("---------------------Activitat AEA1-3: Practica de C#------------------------");
//	Console.WriteLine("------------------------------------------------------------------------------");
// 1 - Salutacions
Console.Write("Si us plau, introdueix el teu nom: ");
string nom = Console.ReadLine();
//
Console.WriteLine($"¡Hola, {nom}! Benvingut a l'activitat de C#.");
//
// 2 - Ara sumarem 2 numeros. El primer el demanarem a l'usuari
const int valorFix = 10;
Console.WriteLine();
Console.Write($"Introduiex un número per a sumar-li {valorFix}: ");
int numUsuari = int.Parse(Console.ReadLine());
int valorMaxim = 25;
//
int suma = numUsuari + valorFix;
Console.WriteLine("El resultat de la suma és: " + suma);
//
if (suma > valorMaxim) {
	Console.WriteLine("La suma és major que: " + valorMaxim);
}
//
// 3 -- Comparador de números --
// Demana a l'usuari 2 numeros per consola
// imprimint per pantalla els missatges.
// Guarda el valor en dos variables diferents de tipus int
// Compara els valors amb if i else if, else
// i imprimeix per pantalla un missatge amb el valor més gran o si son iguals.
// Fes servir la funcio int.Parse() per a convertir a int el valor
// introduit per l'usuari.|
//
Console.Write("Escriu el primer número: ");
int num1 = int.Parse(Console.ReadLine());
//
Console.Write("Escriu el segon número: ");
int num2 = int.Parse(Console.ReadLine());
//
if (num1 == num2) {
	Console.Write("Els dos números són iguals.");
} else if (num1 > num2) {
	Console.Write($"El primer número ({num1}) és més gran que el segon ({num2})");
} else {
	Console.Write($"El segon número ({num2}) és més gran que el primer ({num1})");
}
//
// Espai final separant el C:\..\..\..
Console.WriteLine();
//
// Quack
