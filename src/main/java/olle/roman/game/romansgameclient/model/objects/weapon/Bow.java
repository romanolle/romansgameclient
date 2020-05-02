package olle.roman.game.romansgameclient.model.objects.weapon;

import java.util.Collection;

import com.google.common.collect.Lists;

import olle.roman.game.romansgameclient.model.objects.Equipment;
import olle.roman.game.romansgameclient.model.objects.Weapon;
import olle.roman.game.romansgameclient.model.objects.equipment.Wood;

public class Bow implements Weapon {

	private static final long serialVersionUID = 875817752881370214L;
	
	private static final Bow INSTANCE = new Bow();

	public static Bow getInstance() {
		return INSTANCE;
	}
	
	private Bow() {
	}

	@Override
	public Collection<Equipment> madeFrom() {
		return Lists.newArrayList(Wood.getInstance());
	}
}
