
public class Array2DAufgabe {

	public static void main(String[] args) {
		/*
		 * In dieser Aufgabe geht es darum, eine Methode zu programmieren, der ein zwei
		 * dimensionales int Array �bergeben wird. Dieses zwei dimensionale int Array
		 * modelliert ein Spielfeld mit einer Gr��e von 3 x 3. Das Spielfeld besitzt
		 * also 3 Zeilen und 3 Spalten.
		 * 
		 * Jedes Feld in diesem Spielfeld kann entweder mit einer 1, mit einer 2 oder
		 * mit einer 3 belegt sein. Die Methode, der dieses Spielfeld �bergeben wird,
		 * hat die Aufgabe zu �berpr�fen, ob in einer der 3 Zeilen des Spielfeldes 3
		 * gleiche Zahlen stehen. Wenn dies der Fall ist, dann soll der R�ckgabewert
		 * true zur�ckgeben. Sollte stattdessen in keiner der drei Zeilen dreimal die
		 * gleiche Zahl vorkommen, dann soll false zur�ckgegeben werden.
		 * 
		 * Spielfeld Skizze:
		 * 
		 * _ _ _
		 * 
		 * _ _ _
		 * 
		 * _ _ _
		 * 
		 * Beispiel 1:
		 * 
		 * 1 1 1
		 * 
		 * 1 2 3
		 * 
		 * 2 2 1
		 * 
		 * => Methode gibt den R�ckgabewert true zur�ck, da sich in der ersten Zeile
		 * drei 1er befinden
		 * 
		 * Beispiel 2:
		 * 
		 * 1 2 3
		 * 
		 * 3 2 1
		 * 
		 * 1 2 1
		 * 
		 * => Methode gibt den R�ckgabewert false zur�ck, da sich in keiner der drei
		 * Zeilen drei gleiche Zahlen befinden
		 */

		int[][] field = { { 1, 2, 3 },{ 1, 2, 3 }, { 1, 1, 2 } };
		
		boolean result = isSpecialArray(field);
		
		System.out.println("Enth�lt das �bergebene Array in einer Zeile 3 gleiche Zahlen? " + result);
	}

	

	public static boolean isSpecialArray(int[][] field) {
		int temp = 0;
		for (int i = 0; i < field.length; i++) { // Zeilen durchlauf, in diesem fall 3 Zeilen
			if (field[i][0] == field[i][1] && field[i][0] == field[i][2]) {// Spalten abfrage [zeile][spalte]
				temp++;
				
			}
		}
		if (temp > 0) {
			return true;
		}else {
			return false;
		}
	}

}
