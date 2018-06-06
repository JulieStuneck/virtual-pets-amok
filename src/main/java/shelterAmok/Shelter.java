package shelterAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Shelter {

	Map<String, Pet> pets = new HashMap<>();

	public void add(Pet anyPet) {
		pets.put(anyPet.getName(), anyPet);

	}

	public Pet findPet(String name) {

		return pets.get(name);
	}

	public Collection<Pet> allPets() {
		return pets.values();
	}

	public void remove(Pet anyPet) {
		pets.remove(anyPet.getName());
	}

	public void feedOrganic() {
		for (Pet pet : pets.values()) {		//all pets
			if (pet instanceof OrganicPet) {//check for organic pets
				((OrganicPet) pet).feed();
			}
		}

	}

	public void waterOrganic() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).water();
			}
		}

	}

	public void oilRobotic() {
		for (Pet pet : pets.values()) {
			if (pet instanceof RoboticPet) {
				((RoboticPet) pet).increaseOilLevel();
			}
		}

	}

	public void tick() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).tick();
			} else {
				((RoboticPet) pet).tick();
			}
		}

	}

	public void displayOrganicPetsStates() {
		System.out.println("Here are the organic pets currently in the shelter:");
		for (Pet pet : pets.values()) {
				if (pet instanceof OrganicPet) {	
				System.out.println("Name: " + pet.getName() + " - " + pet.getDescription() + "; Hunger = "
						+ ((OrganicPet) pet).getHunger() + "; Thirst = " + ((OrganicPet) pet).getThirst()
						+ "; Boredom = " + ((OrganicPet) pet).getBoredom() + "; Waste in Cage = "
						+ ((OrganicPet) pet).getWaste() + "; Health: " + ((OrganicPet) pet).calculateHealth()
						+ "; Happiness: " + ((OrganicPet) pet).getHappiness());
			}

		}

	}

	public void displayRoboticPetStates() {
		System.out.println("Here are the robotic pets currently in the shelter:");
		for (Pet pet : pets.values()) {
			if (pet instanceof RoboticPet) {
				System.out.println("Name: " + pet.getName() + " - " + pet.getDescription() + "; Boredom = "
						+ ((RoboticPet) pet).getBoredom() + "; Oil Level = " + ((RoboticPet) pet).getOilLevel()
						+ "; Health: " + ((RoboticPet) pet).calculateHealth() + "; Happiness: "
						+ ((RoboticPet) pet).getHappiness());
			}

		}

	}

	public void cleanLitterBox() {
		for (Pet pet : pets.values()) {
			if (pet instanceof Cat) {
				((Cat) pet).clean();
			}

		}
	}

	public void cleanDogCages() {
		for (Pet pet : pets.values()) {
			if (pet instanceof Dog) {
				((Dog) pet).clean();
			}

		}
	}

	public void playWithOnePet() {
		for (Pet pet : pets.values()) {
			pet.play();
		}
	}
	
	public void walkAllDogs() {
		for (Pet pet : pets.values()) {
			if (pet instanceof WalkDogs) {
				((WalkDogs) pet).walk();
			}
	}
}}