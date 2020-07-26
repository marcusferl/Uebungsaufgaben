
public class QuerSummeBerechnen {

	/*
	 * Schreiben sie ein Konsolenprogramm, das eine int-zahl > 0 und < 10000
	 * einliest, ihre Quersumme berechnet und das Ergebnis wie folgt ausgibt:
	 * 
	 * Konsolenausgabe:
	 * 
	 * Zahl eingeben (0-10000): 3698 Quersumme: 3 + 6 + 9 + 8 = 26
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eingabe = 123;
	    
		char[] inputToArray = String.valueOf(eingabe).toCharArray();
		
		for (int i = 0; i < inputToArray.length; i++) {
			int temp = inputToArray[i];
			System.out.println(temp);
		}
		

	}

}
