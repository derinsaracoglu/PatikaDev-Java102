package Locations;

import Game.Player;

public class SafeHouse extends NormalLocation {

	public SafeHouse(Player player) {  //name kullanmamam�z�n sebebi ad�n� kullan�c�dan almaya gerek olmamas�
		super(player, "G�venli ev");
		
	}

	@Override
	public boolean onLocation() {
		System.out.println("");
		System.out.println("G�venli evdesiniz.");
		System.out.println("Can�n�z yenilendi.");
		this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
		System.out.println("");
		return true;
	}

}
