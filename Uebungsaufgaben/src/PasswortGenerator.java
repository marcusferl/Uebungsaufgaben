import java.util.Random;

public class PasswortGenerator {
	/*
	 * Erstelle ein Programm/Funktion welche/s ein zufälliges Passwort erzeugt. Als
	 * Parameter soll die Länge sowie die Art der darin vorkommenden Zeichen
	 * übergeben werden können. Zur Auswahl sollen stehen: Kleinbuchstaben,
	 * Großbuchstaben, Zahlen und Sonderzeichen. Jede beliebige Kombination der
	 * Parameter soll möglich sein.
	 */

	public static void main(String[] args) {
		
		String zeichen = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!§$%&/()=?+#";
		
		int passwortlänge = 20;
		
		Random r = new Random();
		for (int i = 0; i < passwortlänge; i++) {
			System.out.print(zeichen.charAt(r.nextInt(zeichen.length())));
	}

}
}