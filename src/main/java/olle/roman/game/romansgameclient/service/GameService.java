package olle.roman.game.romansgameclient.service;

import java.util.UUID;

import olle.roman.game.romansgameclient.model.action.Action;
import olle.roman.game.romansgameclient.model.objects.CommonObject;
import olle.roman.game.romansgameclient.model.report.GameResult;
import olle.roman.game.romansgameclient.model.state.State;

public interface GameService {

	UUID createNewGame(String name);
	
	void changeDirection(UUID id);
	boolean isFinished(UUID id);
	State action(UUID id, Action action);
	CommonObject look(UUID id);
	GameResult getResult(UUID id);
	State getCurrentState(UUID id);
	
}
