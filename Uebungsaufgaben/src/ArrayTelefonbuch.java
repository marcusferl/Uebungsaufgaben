import java.util.Scanner;

public class ArrayTelefonbuch {
	/*
	 * Erstelle ein mehrdimensionales Array, in der 5 Datensätze gespeichert werden.
	 * Es soll eine Festnetznummer, eine Handynummer und eine Geschäftliche
	 * Telefonnummer in der Konsole eingegeben werden. Nach der Eingabe soll die
	 * Konsole geleert und die Nummern ausgegeben werden. Bei der Ein- sowie Ausgabe
	 * soll eine laufende Eintragsnummer angezeigt werden.
	 */
	public static void main(String[] args) {
		
		int[][] nummernArray = new int[1][3];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Festnetznummer: ");
		nummernArray[0][0] = scan.nextInt();
		System.out.println("Handynummer: ");
		nummernArray[0][1] = scan.nextInt();
		System.out.println("Geschäftsnummer: ");
		nummernArray[0][2] = scan.nextInt();
		
//		
//		System.out.println("Festnetznummer: ");
//		nummernArray[1][0] = scan.nextInt();
//		System.out.println("Handynummer: ");
//		nummernArray[1][1] = scan.nextInt();
//		System.out.println("Geschäftsnummer: ");
//		nummernArray[1][2] = scan.nextInt();

		for (int i = 0; i < nummernArray.length; i++) {
			for (int j = 0; j < nummernArray[i].length; j++) {
				System.out.print(nummernArray[i][j] + " - ");
			}
			
		}
	}

}
