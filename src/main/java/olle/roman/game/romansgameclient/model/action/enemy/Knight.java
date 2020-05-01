package olle.roman.game.romansgameclient.model.action.enemy;

import olle.roman.game.romansgameclient.model.objects.Enemy;

public class Knight implements Enemy {

	private static final long serialVersionUID = 6257252245302106804L;
	
	private final int health;
	
	public Knight(int health) {
		this.health = health;
	}
	
	public static Knight newInstance(int health) {
		return new Knight(health);
	}

	@Override
	public int getHealth() {
		return health;
	}
	
}
