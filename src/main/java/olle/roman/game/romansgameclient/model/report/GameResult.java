package olle.roman.game.romansgameclient.model.report;

import java.io.Serializable;
import java.util.List;

public class GameResult implements Serializable {

	private static final long serialVersionUID = 1L;
	private String message;
	private final List<String> history;
	
	public GameResult(String message, List<String> history) {
		this.message = message;
		this.history = history;
	}
	
	public String getMessage() {
		return message;
	}
	
	public List<String> getHistory() {
		return history;
	}

}
