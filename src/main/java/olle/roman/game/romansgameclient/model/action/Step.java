package olle.roman.game.romansgameclient.model.action;

public class Step implements Action {

	private static final long serialVersionUID = -6679442505464122694L;

	@Override
	public ActionType getActionType() {
		return ActionType.STEP;
	}

}
