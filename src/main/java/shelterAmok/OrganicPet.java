package shelterAmok;

public abstract class OrganicPet extends Pet {

	protected int hunger;
	protected int thirst;
	protected int waste;

	// public OrganicPet() { this is added by Eclipse during abstraction and is not
	// needed (are abstract)
	// super();
	// }

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getWaste() {
		return waste;
	}

	public void feed() {
		hunger -= 5;
		happiness += 5;
	}

	public void water() {
		thirst -= 5;
		happiness += 5;
	}

	public void clean() {
		waste = 0;
		happiness += 5;
	}

	@Override
	public void play() {
		hunger += 5;
		thirst += 5;
		boredom -= 5;
		happiness += 5;
	}

	public void tick() {
		hunger += 5;
		thirst += 5;
		boredom += 5;
		waste += 5;

	}

	public int calculateHealth() {
		health = (happiness * 10) - waste - hunger - thirst;
		return health;
	}

}