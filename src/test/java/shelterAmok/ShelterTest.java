package shelterAmok;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class ShelterTest {

	Shelter underTest;
	Shelter myShelter;
	Dog snoopy;
	Dog rover;
	Cat garfield;
	RoboDog k9;
	RoboCat tigger;

	@Before
	public void setUp() {
		myShelter = new Shelter();
		snoopy = new Dog("Snoopy", 10, 10, 10, 10, 10, 10, "the napping king");
		rover = new Dog("Rover", 10, 10, 10, 10, 10, 10, "red and loves company");
		garfield = new Cat("Garfield", 10, 10, 10, 10, 10, 10, "the orange one");
		k9 = new RoboDog("K9", 10, 10, 10, 10, "helpful and loyal");
		tigger = new RoboCat("Tigger", 10, 10, 10, 10, "tail made of springs");
	}

	@Test
	public void ShelterShouldBeAbleToAddPets() {
		myShelter.add(snoopy);
		Pet foundPet = myShelter.findPet(snoopy.getName());
		assertThat(foundPet, is(snoopy));

	}

	@Test
	public void ShelterShouldBeAbleToAddMultiplePets() {
		myShelter.add(snoopy);
		myShelter.add(garfield);
		myShelter.add(k9);
		myShelter.add(tigger);
		Pet foundDog = myShelter.findPet(snoopy.getName());
		Pet foundCat = myShelter.findPet(garfield.getName());
		Pet foundRoboDog = myShelter.findPet(k9.getName());
		Pet foundRoboCat = myShelter.findPet(tigger.getName());
		assertThat(foundDog, is(snoopy));
		assertThat(foundCat, is(garfield));
		assertThat(foundRoboDog, is(k9));
		assertThat(foundRoboCat, is(tigger));
	}

	@Test
	public void ShouldBeAbleToRemovePetsForAdoption() {
		myShelter.add(snoopy);
		myShelter.add(garfield);
		myShelter.remove(garfield);
		Collection<Pet> petsInShelter = myShelter.allPets();
		assertThat(petsInShelter, containsInAnyOrder(snoopy));
	}

	@Test
	public void ShouldBeAbleToRemoveMultiplePetsForAdoption() {
		myShelter.add(snoopy);
		myShelter.add(garfield);
		myShelter.add(k9);
		myShelter.add(tigger);
		myShelter.remove(snoopy);
		myShelter.remove(tigger);
		Collection<Pet> petsInShelter = myShelter.allPets();
		assertThat(petsInShelter, containsInAnyOrder(k9, garfield));
	}

	@Test
	public void ShouldBeAbleToFeedAllOrganicPets() {
		myShelter.add(snoopy);
		myShelter.add(garfield);
		myShelter.feedOrganic();
		int check = snoopy.getHunger();
		assertEquals(5, check);
		check = garfield.getHunger();
		assertEquals(5, check);

	}

	@Test
	public void ShouldBeAbleToWaterAllOrganicPets() {
		myShelter.add(snoopy);
		myShelter.add(garfield);
		myShelter.waterOrganic();
		int check = snoopy.getThirst();
		assertEquals(5, check);
		check = garfield.getThirst();
		assertEquals(5, check);
	}

	@Test
	public void ShouldBeAbleToOilRoboticPets() {
		myShelter.add(k9);
		myShelter.add(tigger);
		myShelter.oilRobotic();
		int check = k9.getOilLevel();
		assertEquals(15, check);
		check = tigger.getOilLevel();
		assertEquals(15, check);
	}

	@Test
	public void TickWillIncreaseHungerThirstBoredomAndWasteInOrganicPets() {
		myShelter.add(snoopy);
		myShelter.add(garfield);
		myShelter.tick();
		int check = snoopy.getHunger();
		assertEquals(15, check);
		check = garfield.getThirst();
		assertEquals(15, check);
		check = snoopy.getBoredom();
		assertEquals(15, check);
		check = garfield.getWaste();
		assertEquals(15, check);
	}

	@Test
	public void TickWillDecreaseOilLevelInRoboticPets() {
		myShelter.add(k9);
		myShelter.add(tigger);
		myShelter.tick();
		int check = k9.getOilLevel();
		assertEquals(5, check);
		check = tigger.getOilLevel();
		assertEquals(5, check);
	}
	
	@Test
	public void OrganicHealthResultOfHappinessX10andSubtractAllOthers() {
		myShelter.add(snoopy);
		int check = snoopy.calculateHealth();
		assertEquals(70, check);
		myShelter.add(garfield);
		check = garfield.calculateHealth();
		assertEquals(70, check);
	}
	
	@Test
	public void RoboticHealthResultOfHappinessX5PlusOilLevel() {
		myShelter.add(k9);
		myShelter.add(tigger);
		int check = k9.calculateHealth();
		assertEquals(60, check);
		check = tigger.calculateHealth();
		assertEquals(60, check);
	}
	
	@Test 
	public void ShouldBeAbleToCleanDogCage () {
		myShelter.add(snoopy);
		myShelter.add(garfield);
		snoopy.clean();
		int check = snoopy.getWaste();
		assertEquals(0, check);
		check = garfield.getWaste();
		assertEquals(10, check);
	}
	
	@Test
	public void ShelterShouldCleanCatLitterBox () {
		myShelter.add(garfield);
		myShelter.add(snoopy);
		myShelter.cleanLitterBox();
		int check = garfield.getWaste();
		assertEquals(0, check);
		check = snoopy.getWaste();
		assertEquals(10, check);
	}
	
	@Test  						//Is effecting all dogs, not just one
	public void ShouldBeAbleToCleanSpecificDogCage() {
		myShelter.add(snoopy);
		myShelter.add(rover);
		myShelter.add(garfield);
		myShelter.cleanOneDogCage();
		int check = snoopy.getWaste();
		assertEquals(0, check);
		check = rover.getWaste();
		assertEquals(10, check);
		check = garfield.getWaste();
		assertEquals(10, check);
	}
	
	@Test							//Not done
	public void ShouldBeAbleToPlayWithOnePet() {
		myShelter.add(snoopy);
		myShelter.add(rover);
		myShelter.playWithOnePet();
		
		
	}
	
}
