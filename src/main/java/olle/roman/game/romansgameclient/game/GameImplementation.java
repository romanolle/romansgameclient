package olle.roman.game.romansgameclient.game;

import olle.roman.game.romansgameclient.model.action.Action;
import olle.roman.game.romansgameclient.model.state.State;

interface GameImplementation {

	Action action(State currentState);

}