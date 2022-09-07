package Locations;

import Game.Player;
import Items.Armor;
import Items.Weapon;

public class ToolStore extends NormalLocation {

	public ToolStore(Player player) {
		super(player, "Maðaza");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onLocation() {
		System.out.println("");
		System.out.println("Maðazaya hoþgeldiniz.");
		
		
		while (true) {
			System.out.println("1 -  Silahlar");
			System.out.println("2 -  Zýrhlar");
			System.out.println("3 -  Çýkýþ Yap");
			System.out.print("Seçiminiz : ");
			int selectCase = input.nextInt();

			while (selectCase < 1 && selectCase > 3) {
				System.out.println("Secim tanýmlanamadý.Lutfen tekrar deneyiniz.");
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
				System.out.println("Görüþmek üzere genç savaþçý!");
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

		System.out.println("Bir silah seçiniz: ");
		int selectWeaponID = input.nextInt();
		while (selectWeaponID < 1 || selectWeaponID > Weapon.weapons().length) {
			System.out.println("Geçersiz deðer.Baþka deðer giriniz.");
			selectWeaponID = input.nextInt();
		}
		Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);
		if ((selectedWeapon) != null) {
			if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
				System.out.println("Yeterli paranýz bulunmamaktadýr.");
			} else {
				System.out.println(selectedWeapon.getName() + " silahýný satýn aldýnýz.");
				int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
				this.getPlayer().setMoney(balance);
				System.out.println("Kalan paranýz: " + this.getPlayer().getMoney());
				this.getPlayer().getInventory().setWeapon(selectedWeapon);

			}

		}

	}

	public void printArmor() {
		System.out.println("----- Zýrhlar -----");
		System.out.println("");
		for (Armor a : Armor.armors()) {
			System.out.println(
					"Zýrh: " + a.getName() + "   Tutar: " + a.getPrice() + "   Dayanýklýlýk: " + a.getResistence());
		}
	}

	public void buyArmor() {
		System.out.println("Bir zýrh seçiniz: ");
		int selectArmorID = input.nextInt();
		while (selectArmorID < 1 || selectArmorID > Armor.armors().length) {
			System.out.println("Geçersiz deðer.Baþka deðer giriniz.");
			selectArmorID = input.nextInt();
		}

		Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);
		if ((selectedArmor) != null) {
			if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
				System.out.println("Yeterli paranýz bulunmamaktadýr.");
			} else {
				System.out.println(selectedArmor.getName() + " zýrhýný satýn aldýnýz.");
				int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
				this.getPlayer().setMoney(balance);
				System.out.println("Kalan paranýz: " + this.getPlayer().getMoney());
			}

		}
	}

}
