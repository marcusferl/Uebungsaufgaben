import java.util.Scanner;

public class BmiRechner {

	public static void main(String[] args) {

		double größe;
		double gewicht;
		double bmi;

		Scanner scan = new Scanner(System.in);

		System.out.println("Größe in Metern eingeben: ");
		größe = scan.nextDouble();

		System.out.println("Bitte gewicht eingeben: ");
		gewicht = scan.nextDouble();

		bmi = gewicht / (größe * größe);
		bmi = Math.round(bmi); // Rundet auf oder ab
		System.out.println("Dein BMI: " + bmi);

		String klassifizierung = klassifizierungBerechnen(bmi);

		System.out.println(klassifizierung);
	}

	public static String klassifizierungBerechnen(double bmi) {

		if (bmi >= 18.5 && bmi <= 24) {
			return "Normalgewicht";
		} else if (bmi >= 25 && bmi <= 29) {
			return "Übergewicht";
		} else if (bmi >= 30 && bmi <= 34) {
			return "Adipositas Grad 1";
		} else if (bmi >= 35 && bmi <= 39) {
			return " Adipositas Grad 2";
		} else if (bmi >= 40) {
			return "Apositas Grad 3";
		} else {
			return "Fehlerhafte Klassifizierung";
		}
	}

}
