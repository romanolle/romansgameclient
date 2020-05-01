package olle.roman.game.romansgameclient.model.action;

public class Take implements Action {

	private static final long serialVersionUID = 5055669833325099637L;

	@Override
	public ActionType getActionType() {
		return ActionType.TAKE;
	}

}
