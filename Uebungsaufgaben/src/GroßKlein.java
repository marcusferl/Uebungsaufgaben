import java.util.Scanner;

public class GroﬂKlein {
	/*
	 * Erstelle ein Programm, welches in einem String die Kleinbuchstaben in
	 * Groﬂbuchstaben umwandelt und andersherum. Zahlen und Zusatzzeichen sollen
	 * nicht beachtet werden
	 */
	public static void main(String[] args) {

		String umwandlung;
		
		Scanner scan = new Scanner(System.in);
		umwandlung = scan.next();
		
		char [] stringToArray = umwandlung.toCharArray();
		
		for (int i = 0; i < umwandlung.length(); i++) {
		     char temp = stringToArray[i];
		     
		     if (Character.isUpperCase(temp)) {
		    	 temp = Character.toLowerCase(temp);
		     }else {
				temp = Character.toUpperCase(temp);
				
			}
		    
			System.out.print(temp);
		
			}
		}
		
	}


