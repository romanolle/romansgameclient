package olle.roman.game.romansgameclient.model.action;

import java.io.Serializable;

import olle.roman.game.romansgameclient.model.objects.Equipment;

public interface Action extends Serializable {

	public static Action step() {return new Step();}
	public static Action heal() {return new Heal();}
	public static Action jump() {return new Jump();}
	public static Action take() {return new Take();}
	public static Action make(Equipment initialMaterial, Equipment equipmentToMake) {return new Make(equipmentToMake);}
	public static Action use(Equipment equipmentToUse) {return new Use(equipmentToUse);}
	public static Action attack(Equipment equipmentToUse) {return new Attack(equipmentToUse);}
	public static Action attack() {return new Attack(null);}
	
	public ActionType getActionType();
	
}
