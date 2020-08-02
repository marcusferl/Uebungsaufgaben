import java.nio.channels.NonReadableChannelException;
import java.util.Arrays;
import java.util.Scanner;

public class LottoSimulation {

	/*
	 * Schreiben Sie ein Programm, welches 6 Zahlen zwischen 1 und 49 abfrägt.
	 * Danach soll das Programm solange 6 Zufallszahlen berechnen bis alle 6
	 * eingegebenen Zahlen übereinstimmen. Natürlich darf eine Zahl nicht zweimal
	 * vorkommen. Dann soll ausgegeben werden nach wie vielen "Spielen" ein 6er
	 * erzielt wurde und wie hoch die Chance auf einen 3er, einen 4er und einen 5er
	 * war.
	 */

	public static void main(String[] args) {
	
		int lottozahlen [] = new int[50];
		int[] zahlenEingabe = new int[6];
		int[] sechser = new int [6];

 		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Bitte 6 Zahlen eingeben zwischen 1 und 49 eingeben ");
		for (int i = 0; i < 6; i++) {
			zahlenEingabe[i] = scanner.nextInt();
		}
		for (int i=0;i < lottozahlen.length; i++) {
			lottozahlen[i] = i;
		}
		for (int i = 0 ; i < sechser.length; i++) {
			if(zahlenEingabe[i] == lottozahlen[i]) {
				sechser[i] = zahlenEingabe[i];
			}
			
		}
		
		System.out.println(Arrays.toString(sechser));
		}
		}
	


