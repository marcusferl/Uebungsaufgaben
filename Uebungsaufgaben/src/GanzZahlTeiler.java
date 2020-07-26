import java.util.Scanner;

public class GanzZahlTeiler {

	/*
	 * Schreiben Sie ein Programm, das dem Benutzer auffordert eine ganze Zahl
	 * einzugeben. Danach sollen alle möglichen Teiler dieser Zahl ausgegeben
	 * werden. Wenn keine ganze Zahl (Integer) eingegeben wurde soll eine
	 * Fehlermeldung erscheinen und der Benutzer wird noch einmal aufgefordert eine
	 * Zahl einzugeben.
	 */
	public static void main(String[] args) {
		
		int userZahl;
		
		System.out.println("Bitte eine Ganzzahl eingeben!");
		
		userZahl = new Scanner(System.in).nextInt();
		System.out.println("Alle möglichen Teiler von " + userZahl + " sind: ");
		for (int i = 1; i < userZahl; i++) {
			if(userZahl % i == 0) {
				System.out.print("(" + i + ")");
			}
			
		}

	}
	
}
