import java.util.Random;
import java.util.Scanner;

public class W�rfelSpiel {

	/*
	 * Das Programm soll ein einfaches Gl�cksspiel simulieren. Lassen Sie 2
	 * Zufallszahlen zwischen 1-6 ausgeben, die h�here Zahl gewinnt. Wiederholen sie
	 * das W�rfeln solange, bis der Anwender gewinnt.	 */
	

	public static void main(String[] args) {
		int cube1[]= {1,2,3,4,5,6};
		int cube2[]= {1,2,3,4,5,6};
		Random r = new Random();
		int gew�rfelt1 = cube1[r.nextInt(6)];
		int gew�rfelt2 = cube2[r.nextInt(6)];
		Scanner scan = new Scanner(System.in);
	  
		System.out.println("Computer W�rfelt --->\n");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		e.getMessage();
		}
		System.out.println("W�rfel des Computers: " +gew�rfelt1 + "\n");
		System.out.println("Du bist dran, best�tige mit Enter!");
		scan.nextLine();
		
		System.out.println(gew�rfelt2);
		
		if(gew�rfelt2 > gew�rfelt1) {
			System.out.println("Du gewinnst!");
		}else {
			System.out.println(" Leider Verloren :(");
		}
		
		scan.close();

	}

}
