package Game;

import Items.Armor;
import Items.Weapon;

public class Inventory {
   private Weapon weapon;
   private Armor armor;

public Inventory(Weapon weapon) {
	
	this.weapon = new Weapon("Yumruk",0,0,0);
	this.armor = new Armor("Pa�avra",0,10,0);
}

public Weapon getWeapon() {
	return weapon;
}

public void setWeapon(Weapon weapon) {
	this.weapon = weapon;
}

public Armor getArmor() {
	return armor;
}

public void setArmor(Armor armor) {
	this.armor = armor;
}


   
}
