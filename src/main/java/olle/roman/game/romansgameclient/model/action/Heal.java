package olle.roman.game.romansgameclient.model.action;

public class Heal implements Action {

	private static final long serialVersionUID = -8679201743386756735L;

	@Override
	public ActionType getActionType() {
		return ActionType.HEAL;
	}

}
