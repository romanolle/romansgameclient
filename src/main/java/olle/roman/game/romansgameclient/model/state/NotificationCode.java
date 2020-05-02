package olle.roman.game.romansgameclient.model.state;

public enum NotificationCode {
	INITIAL_MATERIAL_NULL(Severity.ERROR, "Initial material cannot be null"),
	EQUIPMENT_NULL(Severity.ERROR, "Final equipment cannot be null"),
	INVENTORY_NOT_CONTAIN_INITIAL_MATERIAL(Severity.ERROR, "Your invetory does not contain initial material"), 
	GAME_SUCCESS(Severity.INFO, "Game successfilly finished"), 
	INVENTORY_NOT_CONTAIN_EQUIPMENT(Severity.ERROR, "Your invetory does not contain final equipment"), 
	CLASS_INVALID(Severity.ERROR, "Class invalid"),
	EQUIPMENT_CANNOT_CREATE(Severity.ERROR, "Equipment can not be created"), 
	DIED(Severity.INFO, "You died");

	;
	
	private final Severity severity;
	private final String message;
	
	private NotificationCode(Severity severity, String message) {
		this.severity = severity;
		this.message = message;
	}

	public Severity getSeverity() {
		return severity;
	}

	public String getMessage() {
		return message;
	}
	
}
