package olle.roman.game.romansgameclient.model.objects.weapon;

import java.util.Collection;

import olle.roman.game.romansgameclient.model.objects.Equipment;
import olle.roman.game.romansgameclient.model.objects.Weapon;

public class Sword implements Weapon {

	private static final long serialVersionUID = 875817752881370214L;
	
	private static final Sword INSTANCE = new Sword();

	public static Sword getInstance() {
		return INSTANCE;
	}
	
	private Sword() {
	}

	@Override
	public Collection<Equipment> madeFrom() {
		return null;
	}
}
