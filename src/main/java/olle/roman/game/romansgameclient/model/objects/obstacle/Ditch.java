package olle.roman.game.romansgameclient.model.objects.obstacle;

import java.io.Serializable;

import olle.roman.game.romansgameclient.model.objects.Obstacle;

public class Ditch implements Obstacle, Serializable {

	private static final long serialVersionUID = -8275794202636351934L;

	private static final Ditch INSTANCE = new Ditch();
	
	public static Ditch getInstance() {
		return INSTANCE;
	}

	private Ditch() {
	}
}
