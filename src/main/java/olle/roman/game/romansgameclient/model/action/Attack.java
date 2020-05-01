package olle.roman.game.romansgameclient.model.action;

import olle.roman.game.romansgameclient.model.objects.Equipment;

public class Attack implements Action {

	private static final long serialVersionUID = -5032762183563279607L;
	
	private final Equipment equipmentToUse;
	
	public Attack() {
		this(null);
	}
	
	public Attack(Equipment equipmentToUse) {
		this.equipmentToUse = equipmentToUse;
	}

	@Override
	public ActionType getActionType() {
		return ActionType.ATTACK;
	}

	public Equipment getEquipmentToUse() {
		return equipmentToUse;
	}

}
