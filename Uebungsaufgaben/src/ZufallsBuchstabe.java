import java.util.Random;

public class ZufallsBuchstabe {

	public static void main(String[] args) {
		/*
		 * Es soll ein beliebiger Buchstabe des Alphabets (ohne Umlaute) ausgegeben
		 * werden und dann auf Anforderung des Nutzers immer wieder ein weiterer
		 * Buchstabe, wobei jeder Buchstabe des Alphabets nur ein Mal ausgegeben werden
		 * darf.
		 */
		
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		int random = (int) (Math.random() * alphabet.length); 
		
		
		System.out.println(alphabet[random]);
		
	}

}
