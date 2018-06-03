package shelterAmok;

public class Dog {

	private String name;
	private String description;
	private int hunger;
	private int thirst;
	private int boredom;
	private int waste;
	private int health;
	private int happiness;

	public Dog(String name, int hunger, int thirst, int boredom, int waste, int health, int happiness,
			String description) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.waste = waste;
		this.health = health;
		this.happiness = happiness;
	}

	public String getName() {
		return name;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getWaste() {
		return waste;
	}

	public int getHealth() {
		return health;
	}

	public int getHappiness() {
		return happiness;
	}

	public String getDescription() {
		return description;
	}

	public void feed() {
		hunger -= 5;
	}

	public void water() {
		thirst -= 5;
	}

	public void play() {
		hunger += 5;
		thirst += 5;
		boredom -= 5;		
	}

	public void clean() {
		waste = 0;	}

	public void walk() {
		waste -= 5;
		happiness += 5;
	}

}
