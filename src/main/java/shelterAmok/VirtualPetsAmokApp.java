package shelterAmok;

import java.util.Scanner;

public class VirtualPetsAmokApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Shelter myShelter = new Shelter();

		Dog snoopy = new Dog("Snoopy", 10, 10, 10, 10, 10, 10, "The Napping King");
		Dog rover = new Dog("Rover", 10, 10, 10, 10, 10, 10, "red and loves company");
		Cat garfield = new Cat("Garfield", 10, 10, 10, 10, 10, 10, "The Orange One");
		RoboDog k9 = new RoboDog("K9", 10, 10, 10, 10, "helpful and loyal");
		RoboCat tigger = new RoboCat("Tigger", 10, 10, 10, 10, "tail made of springs");

		myShelter.add(snoopy);
		myShelter.add(rover);
		myShelter.add(garfield);
		myShelter.add(k9);
		myShelter.add(tigger);

		String userChoice = "";

		System.out.println("Wecome to the HurryOnInn - a Shelter for All Pets.");

		do {

			System.out.println("");
			myShelter.displayOrganicPetsStates();
			System.out.println("");
			myShelter.displayRoboticPetStates();
			System.out.println("");
			System.out.println("How would you like to get involved?");

			System.out.println("Enter 1 to Adopt a Pet");
			System.out.println("Enter 2 to Leave a Pet with Us");
			System.out.println("Choose 3 to Oil the Robotic Pets");
			System.out.println("Choose 4 to Feed the Organic Pets");
			System.out.println("Choose 5 to Water the Organic Pets");
			System.out.println("Choose 6 to Clean the Cats' Litter Box");
			System.out.println("Choose 7 to Clean the Dogs' Cages");
			System.out.println("Choose 8 to Walk All the Dogs");
			System.out.println("Choose 9 to Play with a Specific Pet");
			System.out.println("Enter 10 to Exit");
			userChoice = input.nextLine();

			if (userChoice.equals("1")) {
				System.out.println("Which pet would you like to take home with you?");
				String userAdoptChoice = input.nextLine();
				myShelter.remove(myShelter.findPet(userAdoptChoice));
				System.out.println(userAdoptChoice + " is so happy to have a new home.");

			} else if (userChoice.equals("2")) {
				System.out.println("What is the name of the pet that is joining our shelter?");
				String newPetName = input.next();
				System.out.println("How would you discribe " + newPetName + "?");
				String newPetDescription = input.next();
				// choose organic or robotic
				System.out.println("Is " + newPetName + " organic or robotic?");
				String newPetBiology = input.next();
				// organic - choose dog or cat
				if (newPetBiology.equalsIgnoreCase("organic")) {
					System.out.println("Is " + newPetName + " a cat or a dog?");
					String catOrDog = input.next();
					// add organic cat or dog
					if (catOrDog.equalsIgnoreCase("cat")) {
						Cat newCat = new Cat(newPetName, 10, 10, 10, 10, 10, 10, newPetDescription);
						myShelter.add(newCat);
					} else {
						Dog newDog = new Dog(newPetName, 10, 10, 10, 10, 10, 10, newPetDescription);
						myShelter.add(newDog);
					}
					// add robotic cat or dog
				} else if (newPetBiology.equalsIgnoreCase("robotic")) {
					System.out.println("Is " + newPetName + " a cat or a dog?");
					String catOrDog = input.next();
					if (catOrDog.equalsIgnoreCase("cat")) {
						RoboCat newRoboCat = new RoboCat(newPetName, 10, 10, 10, 10, newPetDescription);
						myShelter.add(newRoboCat);

					} else {
						RoboDog newRoboDog = new RoboDog(newPetName, 10, 10, 10, 10, newPetDescription);
						myShelter.add(newRoboDog);
					}
				}
			}

			else if (userChoice.equals("3")) {
				myShelter.oilRobotic();
				System.out.println("The robotic pets thank you. Look how their health went up!");

			} else if (userChoice.equals("4")) {
				myShelter.feedOrganic();
				System.out.println("The organic cats and dogs love to eat!");

			} else if (userChoice.equals("5")) {
				myShelter.waterOrganic();
				System.out.println("A nice cool drink keeps organic pets healthy. Thanks!");

			} else if (userChoice.equals("6")) {
				myShelter.cleanLitterBox();
				System.out.println("Isn't it nice to be able to help all the organic cats by cleaning one litter box.");

			} else if (userChoice.equals("7")) {
				myShelter.cleanDogCages();
				System.out.println("Thank You. We have some happy dogs!");

			} else if (userChoice.equals("8")) {
				myShelter.walkAllDogs();
				System.out.println("All dogs love a good walk.");

			} else if (userChoice.equals("9")) {
				System.out.println("Which pet would you like to play with?");
				String petPlayChoice = input.nextLine();
				myShelter.findPet(petPlayChoice).play();
				System.out.println(petPlayChoice + " thanks you.");

			} else

				myShelter.tick();
			// System.out.println("");
			// myShelter.displayOrganicPetsStates();
			// myShelter.displayRoboticPetStates();

		} while (!(userChoice.equals("10")));

		System.out.println("Thanks for coming by. See you soon.");
		input.close();

	}
}
