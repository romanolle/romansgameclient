package olle.roman.game.romansgameclient.model.objects;

public class Wall implements CommonObject {

	private static final long serialVersionUID = -7650672550731982364L;
	
	private static final Wall INSTANCE = new Wall();

	public static Wall getInstance() {
		return INSTANCE;
	}
	
	private Wall() {
	}

}
