package shelterAmok;

import org.junit.Before;
import org.junit.Test;

public class ShelterTest {

	Shelter underTest;
	private Shelter myShelter;
	private Dog Snoopy;
	private Cat Garfield;
	private RoboDog K9;
	private RoboCat Tigger;

	@Before
	public void setUp() {
		myShelter = new Shelter();
		Snoopy = new Dog("Snoopy", 10, 10, 10, 10, 10, 10, "napping king");
		Garfield = new Cat("Garfield", 10, 10, 10, 10, 10, 10, "the orange one");
		K9 = new RoboDog("K9", 10, 10, 10, 10, "helpful and loyal");
		Tigger = new RoboCat("Tigger", 10, 10, 10, 10, "bounces on her tail");
	}
	
	@Test
	public void ShelterShouldBeAbleToAddPets(){
//		myVirtualPetShelter.add();
//		assertEquals(Snoopy, name);
		
		myShelter.add();
		
//		myHospital.hire(rosie);
//		// myHospital.findEmployee("2");
//		Employee foundJanitor = myHospital.findEmployee(rosie.getNumber());
//		assertThat(foundJanitor, is(rosie));
	}
	
	
}
