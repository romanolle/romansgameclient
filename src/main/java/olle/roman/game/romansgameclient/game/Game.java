package olle.roman.game.romansgameclient.game;

import olle.roman.game.romansgameclient.model.report.GameResult;
import olle.roman.game.romansgameclient.service.GameService;

public interface Game {

	public static Game createNewGame(String name, GameBase game, GameService service) {
		return new DelegatingGameClient(name, game, service);
	}
	
	GameResult start();
}
