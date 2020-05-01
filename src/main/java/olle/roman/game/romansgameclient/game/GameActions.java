package olle.roman.game.romansgameclient.game;

import olle.roman.game.romansgameclient.model.objects.CommonObject;
import olle.roman.game.romansgameclient.model.state.State;

interface GameActions {

	void changeDirection();
	boolean isFinished();
	CommonObject look();
	State getCurrentState();
}
