
public class FizzBuzz {
	/*
	 * Dies ist eine Anfängeraufgabe, die gerne für ein erstes Aussieben bei
	 * Bewerbungsgesprächen gestellt wird, da tatsächlich erstaunlich viele Bewerber
	 * die Aufgabe falsch lösen oder zu viel Zeit dafür benötigen. Für jemanden der
	 * als Programmierer sein Geld verdienen will, sollte die Aufgabe in zwei
	 * Minuten lösbar sein.
	 * 
	 * Aufgabe: Schreibe ein Programm das alle Zahlen von 1 bis 100 ausgibt. Wenn
	 * die Zahl allerdings ein Vielfaches von 3 ist, soll statt der Zahl das Wort
	 * "Fizz" ausgegeben werden. Wenn die Zahl ein Vielfaches von 5 ist, soll statt
	 * der Zahl das Wort "Buzz" ausgegeben werden. Ist die Zahl sowohl ein
	 * Vielfaches von 3 als auch von 5, soll statt der Zahl das Wort "FizzBuzz"
	 * ausgegeben werden.
	 */
	public static void main(String[] args) {
		
		for ( int i = 1 ; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if(i % 5 == 0) {
				System.out.println("Buzz");
			}
			else if ( i % 3 == 0) {
				System.out.println("Fizz");
			}
			else {
				System.out.println(i);
			}
		}

	}

}
