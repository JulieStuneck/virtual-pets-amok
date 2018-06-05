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
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
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

		// public Dog(String name, int hunger, int thirst, int boredom, int waste, int
		// health, int happiness, String description) {

		// public void displayOrganicPets() {
		// for (Pet pet : pets.values()) {
		// if (pet instanceof OrganicPet) {
		// System.out.println("Name: " + pet.getName() + ", " + pet.getDescription() +
		// "; Hunger = " + pet.getHunger);
		// }
		// for (Employee employee : employees.values()) {
		// System.out.println("Emp Number: " + employee.getNumber() + " Name: " +
		// employee.getName() + " Salary: "
		// + employee.calculatePay());
	}

}