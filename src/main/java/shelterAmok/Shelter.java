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
			if(pet instanceof OrganicPet) {
				((OrganicPet) pet).feed();
			}
	}
	//for(Employee employee : employees.values()) {
     //   if (employee instanceof MedicalDuties) {

}}