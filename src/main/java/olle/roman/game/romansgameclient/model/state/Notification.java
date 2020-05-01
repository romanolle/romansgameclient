package olle.roman.game.romansgameclient.model.state;

import java.io.Serializable;

import olle.roman.game.romansgameclient.model.objects.Equipment;

public class Notification implements Serializable {

	private static final long serialVersionUID = -8830936112947063259L;

	private final NotificationCode code;
	private final Severity severity;
	private final String message;
	
	public Notification(NotificationCode code) {
		this(code, "");
	}
	
	public Notification(NotificationCode code, String message) {
		this(code, message, code.getSeverity());
	}
	
	public Notification(NotificationCode code, Severity severity) {
		this(code, "", severity);
	}
	
	public Notification(NotificationCode code, String message, Severity severity) {
		this.code = code;
		this.message = message;
		this.severity = severity;
	}
	
	public NotificationCode getCode() {
		return code;
	}
	public Severity getSeverity() {
		return severity;
	}
	public String getMessage() {
		return message == null || message.isEmpty() ? code.getMessage() : message;
	}

	public static Notification createInvalidClassNotification(Class<?> class1, Class<?> class2) {
		return new Notification(
				NotificationCode.CLASS_INVALID,
				"Invalid class for make. Class must be " + class1.getSimpleName() + " not " + class2.getName()
			);
	}

	public static Notification createEquipmentNotFound(Equipment equipment) {
		return new Notification(
				NotificationCode.INVENTORY_NOT_CONTAIN_EQUIPMENT, 
				"Could not find equipment " + equipment + " in inventory"
		);
	}
	
}
