package olle.roman.game.romansgameclient.model.action.enemy;

import olle.roman.game.romansgameclient.model.objects.Enemy;

public class Archer implements Enemy {

	private static final long serialVersionUID = -6910964240770263439L;

	private final int health;
	
	public Archer(int health) {
		this.health = health;
	}
	
	public static Archer newInstance(int health) {
		return new Archer(health);
	}

	@Override
	public int getHealth() {
		return health;
	}
	
}
