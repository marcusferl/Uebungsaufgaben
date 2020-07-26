import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Gr��teZahlDerReihe {

	/*
	 * Schreibe ein Programm, das den Benutzer zun�chst dazu auffordert, die Anzahl
	 * der Zahlen einzugeben, die er im n�chsten Schritt einlesen m�chte.
	 * 
	 * Im n�chsten Schritt soll dann ein Array deklariert werden und dieses soll
	 * dann so viele int Zahlen fassen k�nnen, wie der Benutzer des Programms zuvor
	 * angegeben hat. Anschlie�end soll dieser dann dazu aufgefordert werden, alle
	 * Zahlen der Reihe nach in das neu deklarierte Array einzulesen.
	 * 
	 * Im n�chsten Schritt sollen alle Zahlen, die der Nutzer in das Array
	 * eingelesen hat, auf der Konsole ausgegeben werden (z.B. Sie haben folgende
	 * Zahlen eingegeben: 2, 3, 6, 4, 9, ).
	 * 
	 * Nun sollst Du das Programm so erweitern, dass die gr��te eingelesene Zahl
	 * automatisch ermittelt wird. Diese soll dann noch zus�tzlich auf der Konsole
	 * ausgegeben werden.
	 */

	public static void main(String[] args) {
		
		System.out.println("Wieviele Zahlen sollen erfasst werden?");
		int anzahlZahlen = new Scanner(System.in).nextInt();
		
		List<Integer> zahlen = new ArrayList<Integer>();
		System.out.println("Bitte deine " + anzahlZahlen + " Zahlen eingeben und mit Enter best�tigen");
		for(int i = 0 ; i<anzahlZahlen; i++) {
			int tmp = new Scanner(System.in).nextInt();
			zahlen.add(tmp);
		}
		System.out.println("Folgende Zahlen wurden eingegeben: ");
		for (int i = 0; i < zahlen.size(); i++) {
			System.out.print("(" +zahlen.get(i) + ")");
			
		}
		System.out.println("\nDie gr��te eingegebene Zahl, ist die: ");
		for (int i = 0; i < zahlen.size(); i++) {
			
		}
		int max = zahlen.get(0);
		for (int i = 0; i < zahlen.size(); i++) {
			if(max < zahlen.get(i) ) {
				max = zahlen.get(i);
			}
		}
		System.out.println("(" + max + ")");
	}

}
