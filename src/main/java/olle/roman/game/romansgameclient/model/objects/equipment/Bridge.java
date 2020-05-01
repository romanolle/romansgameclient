package olle.roman.game.romansgameclient.model.objects.equipment;

import java.util.Collection;

import com.google.common.collect.Lists;

import olle.roman.game.romansgameclient.model.objects.Equipment;

public class Bridge implements Equipment {

	private static final long serialVersionUID = -6134754250364472015L;

	private static final Bridge INSTANCE = new Bridge();

	public static Bridge getInstance() {
		return INSTANCE;
	}
	
	private Bridge() {
	}

	@Override
	public Collection<Equipment> madeFrom() {
		return Lists.newArrayList(Wood.getInstance());
	}

}
