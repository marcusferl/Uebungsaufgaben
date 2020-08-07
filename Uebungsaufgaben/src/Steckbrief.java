import java.util.ArrayList;
import java.util.Scanner;

public class Steckbrief {

	public static void main(String[] args) {
		/*
		 * Baue ein passendes Array, welches du mit Steckbriefinfos füllst (z.B. Name,
		 * Alter, Hobbies usw). Danach lass den User ein Hobby eingeben und gib dann den
		 * Namen der Personen ein, die dieses Hobby haben.
		 * 
		 */

		ArrayList<Person> personenListe = new ArrayList<Person>();

		Person marcus = new Person("Marcus", "Coding", 34);
		Person holger = new Person("Holger", "Wandern", 20);
		Person susi = new Person("Susi", "Kochen", 30);
		Person rene = new Person("Rene", "Coding", 26);

		personenListe.add(marcus);
		personenListe.add(holger);
		personenListe.add(susi);
		personenListe.add(rene);

		System.out.println("Bitte ein Hobby eingeben: ");

		String temp = new Scanner(System.in).nextLine().toLowerCase();
		System.out.println("Folgende Personen haben das Hobby: " + temp);
		for (Person person : personenListe) {
			if (temp.equals(person.getHobby().toLowerCase())) {
				System.out.println(person.getName());
			}
		}

	}

}

class Person {

	private String name;
	private String hobby;
	private int alter;

	public Person(String name, String hobby, int alter) {
		this.name = name;
		this.hobby = hobby;
		this.alter = alter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

}
