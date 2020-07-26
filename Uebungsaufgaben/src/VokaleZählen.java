
public class VokaleZählen {

	/*
	 * Programmieren Sie ein Programm, welches die Anzahl aller Vokale in einem
	 * zuvor eingegebenen Satz ausgibt. Optional wäre die Ausgabe wie oft welcher
	 * Vokal in dem Satz vorhanden ist.
	 * 
	 * Konsolenausgabe:
	 * 
	 * 
	 * Geben Sie einen Satz ein : Dies ist ein toller Satz. Anzahl der Vokale : 8 A:
	 * 1 E: 3 I: 3 O: 1 U: 0
	 */

	public static void main(String[] args) {
		String satz = "Hallo du da";
		String vokale = "aeiou";
		
		char [] satzArr = satz.toCharArray();
		char [] vokaleArr = vokale.toCharArray();
		
		for (int i = 0 ; i < satzArr.length ; i++) {
			for (int j = 0; j < vokaleArr.length ; j++) {
				if (satzArr[i] == vokaleArr[j]) {
					System.out.println(satzArr[i]);
				}
			}
		}

	}

}
