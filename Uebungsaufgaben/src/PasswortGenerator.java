import java.util.Random;

public class PasswortGenerator {
	/*
	 * Erstelle ein Programm/Funktion welche/s ein zuf�lliges Passwort erzeugt. Als
	 * Parameter soll die L�nge sowie die Art der darin vorkommenden Zeichen
	 * �bergeben werden k�nnen. Zur Auswahl sollen stehen: Kleinbuchstaben,
	 * Gro�buchstaben, Zahlen und Sonderzeichen. Jede beliebige Kombination der
	 * Parameter soll m�glich sein.
	 */

	public static void main(String[] args) {
		
		String zeichen = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!�$%&/()=?+#";
		
		int passwortl�nge = 20;
		
		Random r = new Random();
		for (int i = 0; i < passwortl�nge; i++) {
			System.out.print(zeichen.charAt(r.nextInt(zeichen.length())));
	}

}
}