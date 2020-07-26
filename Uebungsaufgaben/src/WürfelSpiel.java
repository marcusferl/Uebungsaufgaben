import java.util.Random;
import java.util.Scanner;

public class WürfelSpiel {

	/*
	 * Das Programm soll ein einfaches Glücksspiel simulieren. Lassen Sie 2
	 * Zufallszahlen zwischen 1-6 ausgeben, die höhere Zahl gewinnt. Wiederholen sie
	 * das Würfeln solange, bis der Anwender gewinnt.	 */
	

	public static void main(String[] args) {
		int cube1[]= {1,2,3,4,5,6};
		int cube2[]= {1,2,3,4,5,6};
		Random r = new Random();
		int gewürfelt1 = cube1[r.nextInt(6)];
		int gewürfelt2 = cube2[r.nextInt(6)];
		Scanner scan = new Scanner(System.in);
	  
		System.out.println("Computer Würfelt --->\n");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		e.getMessage();
		}
		System.out.println("Würfel des Computers: " +gewürfelt1 + "\n");
		System.out.println("Du bist dran, bestätige mit Enter!");
		scan.nextLine();
		
		System.out.println(gewürfelt2);
		
		if(gewürfelt2 > gewürfelt1) {
			System.out.println("Du gewinnst!");
		}else {
			System.out.println(" Leider Verloren :(");
		}
		
		scan.close();

	}

}
