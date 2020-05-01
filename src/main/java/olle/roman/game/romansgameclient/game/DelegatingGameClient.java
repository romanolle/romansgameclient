package olle.roman.game.romansgameclient.game;

import java.io.Serializable;
import java.util.UUID;

import olle.roman.game.romansgameclient.model.objects.CommonObject;
import olle.roman.game.romansgameclient.model.report.GameResult;
import olle.roman.game.romansgameclient.model.state.State;
import olle.roman.game.romansgameclient.service.GameService;

final class DelegatingGameClient implements Game, GameActions, Serializable {

	private static final long serialVersionUID = 1L;
	private final GameBase game;
	private final GameService service;
	private final UUID id;
	
	DelegatingGameClient(String name, GameBase game, GameService service) {
		this.game = game;
		game.setGameActions(this);
		this.service = service;
		this.id = service.createNewGame(name);
	}

	@Override
	public GameResult start() {
		State state = service.getCurrentState(id);
		while(!service.isFinished(id)) {
			state = service.action(id, game.action(state));
		}
		return service.getResult(id);
	}

	@Override
	public void changeDirection() {
		service.changeDirection(id);
	}

	@Override
	public boolean isFinished() {
		return service.isFinished(id);
	}

	@Override
	public CommonObject look() {
		return service.look(id);
	}

	@Override
	public State getCurrentState() {
		return service.getCurrentState(id);
	}
	
}
