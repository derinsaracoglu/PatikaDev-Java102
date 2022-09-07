package Locations;

import Game.Player;

public abstract class NormalLocation extends Location {

	public NormalLocation(Player player, String name) {
		super(player, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onLocation() {
		// TODO Auto-generated method stub
		return true;
	}

}
