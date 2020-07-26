import java.util.Scanner;


public class Konsolenspiel {

	/*
	 * In dieser Aufgabe m�chten wir ein kleines Konsolenspiel programmieren. Und
	 * zwar funktioniert dieses Spiel folgenderma�en. Der Anwender (Spieler) soll
	 * sich zun�chst eine beliebige Ganzzahl zwischen 1 und 1000 ausdenken. Das
	 * Programm wird den Spieler dann im ersten Schritt fragen, ob seine Zahl die
	 * 500 ist (H�lfte der beiden Grenzen), ob sie gr��er als 500 ist, oder ob sie
	 * kleiner als 500 ist.
	 * 
	 * Wenn die Zahl die vom Programm vorgeschlagene Zahl (im ersten Durchlauf die
	 * 500) ist, dann soll er dies mit der Taste 1 best�tigen und das Spiel ist
	 * vorbei.
	 * 
	 * Wenn die Zahl des Spielers kleiner als 500 ist, soll dieser die 2 dr�cken.
	 * 
	 * Und wenn die Zahl des Spielers gr��er als 500 ist, soll dieser die 3 dr�cken.
	 * 
	 * Falls der Spieler die 2 gedr�ckt hat, ist 500 die neue Obergrenze und 1 nach
	 * wie vor die Untergrenze. Der Computer sucht dann wieder die H�lfte zwischen
	 * den Grenzen, in diesem Fall die 250 und fragt wieder das Gleiche.
	 * 
	 * Falls der Spieler die 3 gedr�ckt hat, ist 500 die neue Untergrenze und 1000
	 * nach wie vor die Obergrenze. Der Computer sucht dann wieder die H�lfte
	 * zwischen den Grenzen, in diesem Fall die 750 und fragt das Gleiche wieder.
	 * 
	 * Diese Schritte sollen sich so lange wiederholen, bis der Spieler mit 1
	 * best�tigt hat, dass die Zahl erraten wurde.
	 * 
	 * Du wirst erstaunt sein, wie wenig Durchl�ufe der Computer ben�tigt, um eine
	 * Zahl zwischen 1 und 1000 zu finden.
	 */

	public static void main(String[] args) {

		int min = 1;
		int max = 1000;
		int eingabe;
		int versuche = 1;

		Scanner scan = new Scanner(System.in);

		int temp = (max + min) / 2; // ergibt immer die Mitte der beiden zahlen

		do {
			System.out.println("Ist die gesuchte Zahl die " + temp + " ?");

			System.out.println("Ja => dr�cke (1)");
			System.out.println("Nein, die Zahl ist kleiner => dr�cke (2)");
			System.out.println("Nein, die Zahl ist gr��er => dr�cke (3)");
			System.out.println("Ihre Eingabe: ");
			eingabe = scan.nextInt();
			
			if (eingabe == 1) {
				System.out.println("Ich habe es geschafft, in " + versuche + " Versuchen!");
			} else if (eingabe == 2) {
				max = temp;
				temp = nextTemp(max, min, temp);
				versuche++;
			} else if (eingabe == 3) {
				min = temp;
				temp = nextTemp(max, min, temp);
				versuche++;
			} else {
				System.out.println("Falsche Eingabe!");
			}

		} while (eingabe != 1);

	}
    // Methode zur berrechnung der neuen Mitte
	public static int nextTemp(int max, int min, int temp) {
		temp = (max + min) / 2;
		return temp;
	}
}
