

/*Aufgabenstellung:
Schreibe zunächst ein Programm, dass Zahlen von 1 bis 100 auf der Konsole ausgibt. 
Jede Zahl soll dabei in einer separaten Zeile stehen.

 
Wenn Du dies erledigt hast, sollst Du das Programm noch etwas erweitern. Und zwar sollst Du jede Zahl, 
die durch 3 teilbar ist, durch den Satz „teilbar durch 3“ ersetzen. Jede Zahl, die durch 4 teilbar ist, 
soll durch den Satz „teilbar durch 4“ ersetzt werden. Jetzt wird es einige Zahlen geben, 
die sowohl durch 3 als auch durch 4 teilbar sind, z.B. die 12. Bei diesen Zahlen soll ausgegeben werden „teilbar durch 3 und 4“.
*/

public class TeilbareZahlen {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			if (((i) % 3) == 0 && ((i) % 4) == 0) {
				System.out.println("teilbar durch 3 und 4");

			} else if (((i) % 3) == 0) { // Wenn der divisionsrest = 0 ist
				System.out.println("teilbar durch 3");

			} else if (((i) % 4) == 0) {
				System.out.println("teilbar durch 4");

			} else {
				System.out.println(i);
			}

		}

	}
}
