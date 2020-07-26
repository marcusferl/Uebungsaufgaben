import java.util.Scanner;

public class Eingabenzähler {
	/*Schreiben Sie ein Programm, das ein Wort einliest. Das Wort wird dann so oft ausgegeben, wie es Buchstaben hat:

Konsolenausgabe:

Geben Sie ein Wort ein:
Hello

Hello
Hello
Hello
Hello
Hello*/

	public static void main(String[] args) {
		
		
		String wort;
		
		
		Scanner scan = new Scanner(System.in);
		wort = scan.next();
		
		for ( int i = 0 ;i <= wort.length(); i++ ) {
			System.out.println(wort);
		}

	}

}
