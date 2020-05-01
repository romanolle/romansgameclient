package olle.roman.game.romansgameclient.game;

import olle.roman.game.romansgameclient.model.objects.CommonObject;
import olle.roman.game.romansgameclient.model.state.State;

public abstract class GameBase implements GameImplementation, GameActions {

	private GameActions actions;
	
	final void setGameActions(GameActions actions) {
		this.actions = actions;
	}

	@Override
	public final void changeDirection() {
		actions.changeDirection();
	}

	@Override
	public final boolean isFinished() {
		return actions.isFinished();
	}

	@Override
	public final CommonObject look() {
		return actions.look();
	}

	@Override
	public final State getCurrentState() {
		return actions.getCurrentState();
	}
}
