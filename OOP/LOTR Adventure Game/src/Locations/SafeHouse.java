package Locations;

import Game.Player;

public class SafeHouse extends NormalLocation {

	public SafeHouse(Player player) {  //name kullanmamamýzýn sebebi adýný kullanýcýdan almaya gerek olmamasý
		super(player, "Güvenli ev");
		
	}

	@Override
	public boolean onLocation() {
		System.out.println("");
		System.out.println("Güvenli evdesiniz.");
		System.out.println("Canýnýz yenilendi.");
		this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
		System.out.println("");
		return true;
	}

}
