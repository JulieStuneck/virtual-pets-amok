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

		System.out.println("Wecome to the HurryOnInn - a Shelter for All Pets.");
		System.out.println("");
		myShelter.displayOrganicPetsStates();
		System.out.println("");
		myShelter.displayRoboticPetStates();
		System.out.println("");
		System.out.println("How would you like to get involved?");

		System.out.println("Enter 1 to Volunteer");
		System.out.println("Enter 2 to Adopt a Pet");
		System.out.println("Enter 3 to Leave a Pet with Us");
		System.out.println("Enter 4 to Exit");
		String UserMenuChoice = input.nextLine();

		while (!UserMenuChoice.equals("4")) {
			
			do {

			if (UserMenuChoice.equals("1")) {
				System.out.println("");
				System.out.println("We are so thankful for your help! There are many ways you can help our pets.");
				System.out.println("Choose 1 to Oil the Robotic Pets");
				System.out.println("Choose 2 to Feed the Organic Pets");
				System.out.println("Choose 3 to Water the Organic Pets");
				System.out.println("Choose 4 to Clean the Cats' Litter Box");
				System.out.println("Choose 5 to Clean One of the Dog's Cages");
				System.out.println("Choose 6 to Walk All the Dogs");
				System.out.println("Choose 7 to Play with a Specific Pet");
				System.out.println("Choose 8 to Return to the Main Menu");
				String UserVolunteerChoice = input.nextLine();

				if (UserVolunteerChoice.equals("1")) {
					myShelter.oilRobotic();
					System.out.println("The robotic pets thank you. Look how their health went up!");
					myShelter.displayRoboticPetStates();

				} else if (UserVolunteerChoice.equals("2")) {
					myShelter.feedOrganic();
					System.out.println("The organic cats and dogs love to eat!");
					myShelter.displayOrganicPetsStates();

				} else if (UserVolunteerChoice.equals("3")) {
					myShelter.waterOrganic();
					System.out.println("A nice cool drink keeps organic pets healthy. Thanks!");
					myShelter.displayOrganicPetsStates();

				} else if (UserVolunteerChoice.equals("4")) {
					myShelter.cleanLitterBox();
					System.out.println(
							"Isn't it nice to be able to help all the organic cats by cleaning one litter box.");
					myShelter.displayOrganicPetsStates();

				} else if (UserVolunteerChoice.equals("5")) {
					myShelter.cleanDogCages();
					System.out.println("Thank You. We have some happy dogs!");
					myShelter.displayOrganicPetsStates();

				} else if (UserVolunteerChoice.equals("6")) {
					myShelter.walkAllDogs();
					myShelter.displayOrganicPetsStates();
					myShelter.displayRoboticPetStates();

				} else if (UserVolunteerChoice.equals("7")) {
					System.out.println("Which pet would you like to play with?");
					String petPlayChoice = input.nextLine();
					myShelter.findPet(petPlayChoice).play();

				} while (!UserVolunteerChoice.equals("8"))

					if (UserMenuChoice.equals("2")) {
						System.out.println("Which pet would you like to take home with you?");
						String userAdoptChoice = input.nextLine();
						myShelter.remove(myShelter.findPet(userAdoptChoice));
						System.out.println(userAdoptChoice + " is so happy to have a new home.");

					} else if (UserMenuChoice.equals("3")) {
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
						myShelter.tick();
						System.out.println("");
						myShelter.displayOrganicPetsStates();
						myShelter.displayRoboticPetStates();
						System.out.println("");
						System.out.println("What would you like to do now?");
						System.out.println("Enter 1 to Volunteer");
						System.out.println("Enter 2 to Adopt a Pet");
						System.out.println("Enter 3 to Leave a Pet with Us");
						System.out.println("Enter 4 to Exit");
						UserMenuChoice = input.nextLine();

					}

			}

		} 
		System.out.println("Thanks for coming by. See you soon.");

		input.close();

	}
}
