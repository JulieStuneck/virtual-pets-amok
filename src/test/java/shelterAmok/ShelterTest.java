package shelterAmok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ShelterTest {

	Shelter underTest;
	Shelter myShelter;
	Dog Snoopy;
	Cat Garfield;
	RoboDog K9;
	RoboCat Tigger;

	@Before
	public void setUp() {
		myShelter = new Shelter();
		Snoopy = new Dog("Snoopy", 10, 10, 10, 10, 10, 10, "the napping king");
		Garfield = new Cat("Garfield", 10, 10, 10, 10, 10, 10, "the orange one");
		K9 = new RoboDog("K9", 10, 10, 10, 10, "helpful and loyal");
		Tigger = new RoboCat("Tigger", 10, 10, 10, 10, "tail made of springs");
	}

	@Test
	public void ShelterShouldBeAbleToAddPets() {
		myShelter.add(Snoopy);
		Pet foundPet = myShelter.findPet(Snoopy.getName());
		assertThat(foundPet, is(Snoopy));

	}

	@Test 
	public void ShelterShouldBeAbleToAddMultiplePets() {
		
		myShelter.add(Snoopy);
		myShelter.add(Garfield);
		myShelter.add(K9);
		myShelter.add(Tigger);
		Pet foundDog = myShelter.findPet(Snoopy.getName());
		Pet foundCat = myShelter.findPet(Garfield.getName());
		Pet foundRoboDog = myShelter.findPet(K9.getName());
		Pet foundRoboCat = myShelter.findPet(Tigger.getName());
		assertThat(foundDog, is(Snoopy));
		assertThat(foundCat, is(Garfield));
		assertThat(foundRoboDog, is(K9));
		assertThat(foundRoboCat, is(Tigger));
	}
	

}
