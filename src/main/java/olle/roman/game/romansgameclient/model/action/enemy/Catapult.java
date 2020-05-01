package olle.roman.game.romansgameclient.model.action.enemy;

import olle.roman.game.romansgameclient.model.objects.Enemy;

public class Catapult implements Enemy {

	private static final long serialVersionUID = 562737196050691867L;

	private final int health;
	
	public Catapult(int health) {
		this.health = health;
	}
	
	public static Catapult newInstance(int health) {
		return new Catapult(health);
	}

	@Override
	public int getHealth() {
		return health;
	}
	
}
