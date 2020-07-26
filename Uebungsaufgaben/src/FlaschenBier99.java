
public class FlaschenBier99 {

	/*
	 * Programmiere eine eigenständige Lösung zur gängigen Programmier-Übung bzw.
	 * Lied 99 Bottles of Beer
	 * 
	 * Ausgabe:
	 * 
	 * Konsolenausgabe:
	 * 
	 * 
	 * 99 bottles of beer on the wall, 99 bottles of beer. Take one down and pass it
	 * around, 99 bottles of beer on the wall.
	 * 
	 * 98 bottles of beer on the wall, 98 bottles of beer.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int flaschen = 99;
		
		for (int i = 0; i < 99; i++) {
			System.out.println(flaschen + " Flaschen voll bier, eine davon weg");
			flaschen -= 1;
			System.out.println("da waren es nur noch " + flaschen + " voll Bier!");
		}
		
	}

}
