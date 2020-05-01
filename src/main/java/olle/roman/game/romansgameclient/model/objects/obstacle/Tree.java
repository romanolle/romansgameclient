package olle.roman.game.romansgameclient.model.objects.obstacle;

import java.io.Serializable;

import olle.roman.game.romansgameclient.model.objects.CommonObject;
import olle.roman.game.romansgameclient.model.objects.Obstacle;

public class Tree implements Obstacle, Serializable {

	private static final long serialVersionUID = -5022758229227965033L;

	private static final Tree INSTANCE = new Tree();
	
	public static CommonObject getInstance() {
		return INSTANCE;
	}

	private Tree() {
	}
}
