package olle.roman.game.romansgameclient.model.objects;

import java.util.Collection;

import olle.roman.game.romansgameclient.model.objects.equipment.Axe;

public interface Equipment extends CommonObject {
	
	public static final Equipment AXE = Axe.getInstance();
	
	public Collection<Equipment> madeFrom();
}
