import java.util.Scanner;

public class Bestellüberprüfung {

	/*
	 * Bobs Schrauben Discount verlangt folgende Preise:
	 * 
	 * 5 Cent pro Schraube 3 Cent pro Mutter 1 Cent pro Unterlegscheibe
	 * 
	 * Schreiben Sie ein Programm, das den Anwender nach der Anzahl der Schrauben,
	 * Muttern und Beilegscheiben fragt und dann den Gesamtbetrag berechnet und
	 * ausgibt. Zusätzlich überprüft das Programm die Bestellung. Es ist
	 * normalerweise ein Fehler, wenn mehr Schrauben als Muttern bestellt werden. In
	 * die Meldung aus:sem Fall gibt das Programm die
	 * "Kontrollieren Sie Ihre Bestellung!" Andernfalls gibt das Programm aus:
	 * "Die Bestellung ist okay." In jedem Fall wird der Gesamtbetrag ausgegeben.
	 * 
	 * Konsolenausgabe:
	 * 
	 * Anzahl der Schrauben: 12 Anzahl der Muttern: 8 Anzahl der Unterlegscheiben:
	 * 24
	 * 
	 * Kontrollieren Sie Ihre Bestellung!
	 * 
	 * Gesamtbetrag: 108
	 */

	public static void main(String[] args) {
		
		int preisSchraube = 5;
		int preisMutter = 3;
		int preisUnterlegscheibe = 1;
		
		int anzahlSchrauben;
		int anzahlMuttern;
		int anzahlUnterlegscheiben;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Wieviel Schrauben wollen sie kaufen?");
		anzahlSchrauben = scanner.nextInt();
		System.out.println("Wieviel Muttern sollen gekauft werden?");
		anzahlMuttern = scanner.nextInt();
		System.out.println("Wieviel Unterlegscheiben brauchen sie?");
		anzahlUnterlegscheiben = scanner.nextInt();
		
		int gesammtBetrag = (anzahlSchrauben * preisSchraube) + (anzahlMuttern * preisMutter) + (anzahlUnterlegscheiben * preisUnterlegscheibe);
		
		if(anzahlSchrauben != anzahlMuttern) {
			System.out.println("Die Anzahl an Muttern, passt nicht zur Anzahl der Schrauben");
		}
		System.out.println("Gesammtpreis: " + gesammtBetrag + " Cent");
	}

}
