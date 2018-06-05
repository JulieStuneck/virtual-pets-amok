package shelterAmok;

public abstract class RoboticPet extends Pet {

	protected int oilLevel;

	public int getOilLevel() {
		return oilLevel;
	}

	public void reduceOilLevel() {
		oilLevel -= 5;
	}

	public void increaseOilLevel() {
		oilLevel += 5;
	}

	@Override
	public void play() {
		boredom -= 5;
		oilLevel -= 5;
	}

	public void tick() {
		oilLevel -= 5;
	}
	
	public int calculateHealth() {
		health = (happiness*5) - oilLevel;
		return health;
	}

}