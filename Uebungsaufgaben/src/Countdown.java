import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import javax.security.auth.login.AppConfigurationEntry;

public class Countdown {
	
	//Nano in Sekunden 2*60*1000
	
	/*
	 * Erstellen Sie ein Countdown Programm. Für das Programm ist es nötig, die Zeit
	 * die herunterlaufen soll einzugeben. Je nach Schwierigkeitsgrad kann man dies
	 * in der Konsole tun, oder in einem GUI. Nach Ablauf der Zeit sollte ein Ton
	 * ertönen.
	 * 
	 * Das Programm kann je nach Schwierigkeitsgrad angepasst werden: Eingabe in der
	 * Konsole oder GUI Einfacher BeepTon nach Ablauf der Zeit oder das man eine mp3
	 * Datei angeben kann, die abgespielt werden kann Ein Popup Fenster welches im
	 * Desktopvordergrund blink
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Timer timer = new Timer();	
		timer.schedule(new Apptimer(),0, 1000);
	}
}
			
		
		class Apptimer extends TimerTask{
			int countdown;
			 
			
			
		
		
		
		@Override
			public void run() {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Bitte startzeit eingeben");
			countdown =  scan.nextInt();
				
				countdown = countdown -1;
				System.out.println(countdown);
			
				
			}
		
		
	}

