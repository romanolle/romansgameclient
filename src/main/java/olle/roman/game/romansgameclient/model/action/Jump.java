package olle.roman.game.romansgameclient.model.action;

public class Jump implements Action {

	private static final long serialVersionUID = 2779552758110462886L;

	@Override
	public ActionType getActionType() {
		return ActionType.JUMP;
	}

}
