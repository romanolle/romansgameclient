package olle.roman.game.romansgameclient.model.objects;

public class Nothing implements CommonObject {

	private static final long serialVersionUID = -914635261831486524L;
	private static final Nothing INSTANCE = new Nothing();

	public static Nothing getInstance() {
		return INSTANCE;
	}
	
	private Nothing() {
	}

}
