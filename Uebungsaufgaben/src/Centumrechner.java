import java.util.Scanner;

public class Centumrechner {

	/*
	 * Schreiben Sie ein Programm, das eine Zahl in Cent einliest. Das Programm soll
	 * die Anzahl von Dollar und Cent wie folgt ausgeben:
	 * 
	 * 
	 * Konsolenausgabe:
	 * 
	 * Geben Sie die Cent ein: 324 
	 * Das ergibt 3 Dollar und 24 Cent.
	 */

	public static void main(String[] args) {
		
		int cent;
		
		System.out.println("Wieviel cent sollen umgerechnet werden");
		
		cent = new Scanner(System.in).nextInt();
		
		System.out.println(cent / 100 + " Dollar und " + cent % 100 + " Cent");

	}

}
