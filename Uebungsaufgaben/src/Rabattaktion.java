import java.util.Scanner;

public class Rabattaktion {

	/*
	 * W�hrend einer Sonderaktion wird ein Rabatt von 10% auf alle Eink�ufe mit
	 * einem Gesamtbetrag von mehr als $10.00 gew�hrt. Schreiben Sie ein Programm,
	 * das nach dem Gesamtbetrag fragt und den Rabatt berechnet. Der Gesamtbetrag
	 * wird in Cent (als Ganzzahl) eingegeben.
	 * 
	 * Konsolenausgabe:
	 * 
	 * Geben Sie den Gesamtbetrag ein: 2000 Discountpreis: 1800
	 */

	public static void main(String[] args) {
		
		System.out.println("Bitte Gesammtbetrag in Cent eingeben: ");
		
		int price = new Scanner(System.in).nextInt();
		
		int priceNew = price - (price * 10 / 100);
		
		System.out.println("Neuer Preis: " + priceNew + " Cent");

	}

}
