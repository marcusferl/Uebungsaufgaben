
public class Bergsteiger {

	/*
	 * Ein Bergsteiger möchte den MountNerdmore (Höhe: 9.876 m) besteigen. Dabei
	 * steigt er jeden Tag 1.234 m auf. Nachts schlafwandelt er und steigt wieder
	 * 567 m ab. An der Spitze angekommen wird er direkt von einem Helikopter
	 * abgeholt. Am wievielten Tag wird der Bergsteiger vom Helikopter abgeholt?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mountNermore = 9876;
		int amTag = 1234;
		int inDerNacht = 567;
		int tage = 0;
		int höhe = 0;
		
	while( mountNermore >= höhe){
		höhe += amTag;
		tage++;
		höhe -= inDerNacht;
		
		
		
	}
	System.out.println(tage);
	
	
	       
	         
	    }
	 
	
		
		}
			
		
	


