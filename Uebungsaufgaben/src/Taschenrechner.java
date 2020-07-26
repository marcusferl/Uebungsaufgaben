import java.util.Scanner;

import javax.xml.stream.events.StartDocument;

public class Taschenrechner {
	/*
	 * In dieser Aufgabe geht es darum, ein kleines Taschenrechner Programm zu
	 * schreiben. Zunächst soll der Nutzer dazu aufgefordert werden, zwei Ganzzahlen
	 * über die Konsole in das Programm einzulesen.
	 * 
	 * Danach soll der Nutzer entscheiden, was mit diesen zwei Zahlen passieren
	 * soll. Die Zahlen können entweder addiert (1), subtrahiert (2), multipliziert
	 * (3) oder dividiert (4) werden. Wenn der Nutzer die Zahl 1 einliest, dann
	 * werden die beiden zuvor eingelesenen Zahlen addiert. Wenn der Nutzer die Zahl
	 * 2 einliest, dann werden die beiden zuvor eingelesenen Zahlen subtrahiert.
	 * Wenn der Nutzer die Zahl 3 einliest, dann werden die beiden zuvor
	 * eingelesenen Zahlen multipliziert. Wenn der Nutzer die Zahl 4 einliest, dann
	 * werden die beiden zuvor eingelesenen Zahlen dividiert.
	 */

	/*
	 * Zusatzaufgabe:
	 * 
	 * Wenn Du den Taschenrechner nach der obigen Aufgabenstellung erfolgreich
	 * programmiert hast, dann ist es nun an der Zeit das Programm noch mal etwas zu
	 * erweitern. Und zwar soll der Nutzer nach jeder Berechnung gefragt werden, ob
	 * er das Programm nochmals ausführen möchte. Der Nutzer kann dann eine 0 oder
	 * eine 1 eingeben. Falls er die 0 eingibt, wird das Programm beendet. Falls er
	 * die 1 eingibt, wird das Programm erneut durchlaufen und er kann somit eine
	 * weitere Rechnung durchführen.
	 */

	public static void main(String[] args) {

		int zahl1;
		int zahl2;
		int auswahl;
		int start = 0;

		Scanner scan = new Scanner(System.in);
		while (start == 0) {
			System.out.println("Bitte erste zahl eingeben");
			zahl1 = scan.nextInt();
			System.out.println("Bitte zweite Zahl eingeben");
			zahl2 = scan.nextInt();
			System.out.println("Drücke 1 für + , 2 für Minus , 3 für * oder 4 für /");
			auswahl = scan.nextInt();

			switch (auswahl) {
			case 1:
				System.out.println("Ergebniss = " + (zahl1 + zahl2));
				break;
			case 2:
				System.out.println("Ergebniss = " + (zahl1 - zahl2));
				break;
			case 3:
				System.out.println("Ergebniss = " + (zahl1 * zahl2));
				break;
			case 4:
				System.out.println("Ergebniss = " + (zahl1 / zahl2));
				break;
			default:
				System.out.println("Programm abgebrochen!");
				break;
			}
			System.out.println("Nochmal rechnen? 0 für ja - 1 für nein.");
			start = scan.nextInt();
		}
		System.out.println("Rechner beendet!");
	}

}
