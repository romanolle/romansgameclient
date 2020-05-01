package olle.roman.game.romansgameclient.model.action;

import olle.roman.game.romansgameclient.model.objects.Equipment;

public class Make implements Action {

	private static final long serialVersionUID = -5845329043473308963L;

	private final Equipment equipment;
	
	public Make(Equipment equipment) {
		//TODO add assert or not? It will break running of game
		//maybe leave without assert and check on server and return some object with error severity
//		Assert.notNull(initialMaterial, "Initial material cannot be null");
//		Assert.notNull(equipmentToMake, "Equipment to make cannot be null");
		this.equipment = equipment;
	}

	@Override
	public ActionType getActionType() {
		return ActionType.MAKE;
	}

	public Equipment getEquipment() {
		return equipment;
	}

}
