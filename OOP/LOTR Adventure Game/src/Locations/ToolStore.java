package Locations;

import Game.Player;
import Items.Armor;
import Items.Weapon;

public class ToolStore extends NormalLocation {

	public ToolStore(Player player) {
		super(player, "Ma�aza");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onLocation() {
		System.out.println("");
		System.out.println("Ma�azaya ho�geldiniz.");
		
		
		while (true) {
			System.out.println("1 -  Silahlar");
			System.out.println("2 -  Z�rhlar");
			System.out.println("3 -  ��k�� Yap");
			System.out.print("Se�iminiz : ");
			int selectCase = input.nextInt();

			while (selectCase < 1 && selectCase > 3) {
				System.out.println("Secim tan�mlanamad�.Lutfen tekrar deneyiniz.");
				selectCase = input.nextInt();
			}

			switch (selectCase) {
			case 1:
				printWeapon();
				buyWeapon();
				break;
			case 2:
				printArmor();
				buyArmor();
				break;
			case 3:
				System.out.println("G�r��mek �zere gen� sava���!");
				break;
				
			}

		}
	}

	public void printWeapon() {
		System.out.println("----- Silahlar -----");
		System.out.println("");
		for (Weapon w : Weapon.weapons()) {
			System.out.println("Silah: " + w.getName() + "   Tutar: " + w.getPrice() + "   Hasar: " + w.getDamage());
		}

	}

	public void buyWeapon() {

		System.out.println("Bir silah se�iniz: ");
		int selectWeaponID = input.nextInt();
		while (selectWeaponID < 1 || selectWeaponID > Weapon.weapons().length) {
			System.out.println("Ge�ersiz de�er.Ba�ka de�er giriniz.");
			selectWeaponID = input.nextInt();
		}
		Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);
		if ((selectedWeapon) != null) {
			if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
				System.out.println("Yeterli paran�z bulunmamaktad�r.");
			} else {
				System.out.println(selectedWeapon.getName() + " silah�n� sat�n ald�n�z.");
				int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
				this.getPlayer().setMoney(balance);
				System.out.println("Kalan paran�z: " + this.getPlayer().getMoney());
				this.getPlayer().getInventory().setWeapon(selectedWeapon);

			}

		}

	}

	public void printArmor() {
		System.out.println("----- Z�rhlar -----");
		System.out.println("");
		for (Armor a : Armor.armors()) {
			System.out.println(
					"Z�rh: " + a.getName() + "   Tutar: " + a.getPrice() + "   Dayan�kl�l�k: " + a.getResistence());
		}
	}

	public void buyArmor() {
		System.out.println("Bir z�rh se�iniz: ");
		int selectArmorID = input.nextInt();
		while (selectArmorID < 1 || selectArmorID > Armor.armors().length) {
			System.out.println("Ge�ersiz de�er.Ba�ka de�er giriniz.");
			selectArmorID = input.nextInt();
		}

		Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);
		if ((selectedArmor) != null) {
			if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
				System.out.println("Yeterli paran�z bulunmamaktad�r.");
			} else {
				System.out.println(selectedArmor.getName() + " z�rh�n� sat�n ald�n�z.");
				int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
				this.getPlayer().setMoney(balance);
				System.out.println("Kalan paran�z: " + this.getPlayer().getMoney());
			}

		}
	}

}
