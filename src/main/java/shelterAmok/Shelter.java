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
	
	public Collection<Pet> getAllPets() {
		return pets.values();
	}

}