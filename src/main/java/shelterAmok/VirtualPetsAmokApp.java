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
		System.out.println("Here are the organic pets living with us today:");
		myShelter.displayOrganicPetsStates();
		System.out.println("");
		System.out.println("Here are the robotic pets living with us today:");
		myShelter.displayRoboticPetStates();
		System.out.println("");
		System.out.println("How would you like to get involved?");

		System.out.println("Enter 1 to Volunteer");
		System.out.println("Enter 2 to Adopt a Pet");
		System.out.println("Enter 3 to Leave a Pet with Us");
		System.out.println("Enter 4 to Exit");
		String UserMenuChoice = input.nextLine();

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
				System.out.println("Isn't it nice to be able to help all the organic cats by cleaning one litter box.");
				myShelter.displayOrganicPetsStates();

			} else if (UserVolunteerChoice.equals("5")) { // NEED TO COME BACK
				System.out.println("Please enter the name of the dog whose cage you would like to clean:");
				String cleanCageChoice = input.nextLine();
				myShelter.cleanOneDogCage();
				System.out.println("Thank You. " + cleanCageChoice + " is now one happy dog!");
				myShelter.displayOrganicPetsStates();

				
			} else if (UserVolunteerChoice.equals("6")) {
				//myShelter.walkDogs();
				myShelter.displayOrganicPetsStates();
				myShelter.displayRoboticPetStates();
				
			} else if (UserVolunteerChoice.equals("7")) {
				System.out.println("Which pet would you like to play with?");
				String petPlayChoice = input.nextLine();
				
				
			}
			
			
		} else  {
// adopt = myHospital.fire(myHospital.findEmployee(empNumber));
		}

		input.close();
	}

}
