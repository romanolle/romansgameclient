package olle.roman.game.romansgameclient.model.objects.equipment;

import java.util.Collection;

import olle.roman.game.romansgameclient.model.objects.Equipment;

public class Matches implements Equipment {

	private static final long serialVersionUID = -8104074571461962678L;
	
	private static final Matches INSTANCE = new Matches();

	public static Matches getInstance() {
		return INSTANCE;
	}
	
	private Matches() {
	}

	@Override
	public Collection<Equipment> madeFrom() {
		return null;
	}
}
