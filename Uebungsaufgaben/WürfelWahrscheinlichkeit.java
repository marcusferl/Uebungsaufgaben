import java.util.Random;

public class WürfelWahrscheinlichkeit {
	
	public static void main(String[] args) {
	
	 // Ziel ist es zu erfahren, wie oft die 6 in x Würfen gewürfelt werden
	
	
		int [] würfel = {1,2,3,4,5,6};
		
		int würfe = 1000;
		
		int anzahl = 0;
		
		
		
		Random random = new Random();
		
		for (int i = 0; i < würfe; i++) {
			if(würfel[random.nextInt(würfel.length)] == 6) {
				anzahl++;
				}
			
		}
	
		System.out.println(" Die 6 wurde: " +anzahl + " mal gewürfelt");
	
}
}