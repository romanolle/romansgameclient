package olle.roman.game.romansgameclient.model.objects.equipment;

import java.io.Serializable;
import java.util.Collection;

import olle.roman.game.romansgameclient.model.objects.Equipment;

public class Wood implements Equipment, Serializable {

	private static final long serialVersionUID = 783710041791213154L;

	private static final Wood INSTANCE = new Wood();
	
	public static Wood getInstance() {
		return INSTANCE;
	}

	private Wood() {
	}

	@Override
	public Collection<Equipment> madeFrom() {
		return null;
	}
}
