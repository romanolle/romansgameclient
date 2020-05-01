package olle.roman.game.romansgameclient.model.action;

import olle.roman.game.romansgameclient.model.objects.Equipment;

public class Use implements Action {

	private static final long serialVersionUID = -6850487323187559747L;

	private final Equipment equipmentToUse;
	
	public Use(Equipment equipmentToUse) {
		this.equipmentToUse = equipmentToUse;
	}

	@Override
	public ActionType getActionType() {
		return ActionType.USE;
	}

	public Equipment getEquipmentToUse() {
		return equipmentToUse;
	}

}
