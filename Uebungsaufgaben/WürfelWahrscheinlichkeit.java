import java.util.Random;

public class W�rfelWahrscheinlichkeit {
	
	public static void main(String[] args) {
	
	 // Ziel ist es zu erfahren, wie oft die 6 in x W�rfen gew�rfelt werden
	
	
		int [] w�rfel = {1,2,3,4,5,6};
		
		int w�rfe = 1000;
		
		int anzahl = 0;
		
		
		
		Random random = new Random();
		
		for (int i = 0; i < w�rfe; i++) {
			if(w�rfel[random.nextInt(w�rfel.length)] == 6) {
				anzahl++;
				}
			
		}
	
		System.out.println(" Die 6 wurde: " +anzahl + " mal gew�rfelt");
	
}
}