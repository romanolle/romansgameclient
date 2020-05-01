package olle.roman.game.romansgameclient.model.objects.equipment;

import java.util.Collection;

import com.google.common.collect.Lists;

import olle.roman.game.romansgameclient.model.objects.Equipment;

public class Axe implements Equipment {

	private static final long serialVersionUID = 1777118032806723334L;
	
	private static final Axe INSTANCE = new Axe();

	public static Axe getInstance() {
		return INSTANCE;
	}
	
	private Axe() {
	}

	@Override
	public Collection<Equipment> madeFrom() {
		return Lists.newArrayList(Wood.getInstance());
	}

}
