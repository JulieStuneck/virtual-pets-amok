package shelterAmok;

import java.util.Scanner;

public class VirtualPetsAmokApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Shelter myShelter = new Shelter();

		Dog snoopy = new Dog("Snoopy", 10, 10, 10, 10, 10, 10, "The Napping King");
		Cat garfield = new Cat("Garfield", 10, 10, 10, 10, 10, 10, "The Orange One");
		RoboDog k9 = new RoboDog("K9", 10, 10, 10, 10, "helpful and loyal");
		RoboCat tigger = new RoboCat("Tigger", 10, 10, 10, 10, "tail made of springs");

		myShelter.add(snoopy);
		myShelter.add(garfield);
		myShelter.add(k9);
		myShelter.add(tigger);

		myShelter.displayOrganicPets();

	}

}
