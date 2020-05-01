package olle.roman.game.romansgameclient.model.objects;

public class Portal implements CommonObject {

	private static final long serialVersionUID = -182691790524002332L;

	private static final Portal INSTANCE = new Portal();

	public static Portal getInstance() {
		return INSTANCE;
	}
	private Portal() {
	}

}
