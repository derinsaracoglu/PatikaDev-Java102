package Locations;

import java.util.Random;

import Enemies.Obstacle;
import Game.Player;

public class BattleLoc extends Location {
	private Obstacle obstacle;
	private String award;
	private int maxObstacle;
	private String selectCombat;
	private boolean selectCombatValue;

	public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
		super(player, name);
		this.obstacle = obstacle;
		this.award = award;
		this.maxObstacle = maxObstacle;
	}

	@Override
	public boolean onLocation() {
		int obsNumber = this.randomObstacleNumber();

		System.out.println("�u an buradas�n�z: " + this.getName());
		System.out.println("Mevcut d��man: " + this.getObstacle().getName() + " , " + obsNumber + " adet var!");
		System.out.print("<S> Sava� veya <K> Ka�.");
		System.out.println();
		String selectCase = input.nextLine();
		selectCase = selectCase.toUpperCase();
		if (selectCase.equals("S")) {
			if (combat(obsNumber)) {
				System.out.println(this.getName() + " t�m d��manlar� yendiniz.");
				return true;
			}
		}

		if (this.getPlayer().getHealth() < 0) {
			System.out.println("�ld�n�z...");
			return false;
		}

		return true;
	}

	public boolean combat(int obsNumber) {
		for (int i = 1; i <= obsNumber; i++) {
			this.getObstacle().setHealth(this.getObstacle().getHealth());
			playerStats();
			obstacleStats(i);

			while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {

				System.out.println("<V> Vur veya <K> Ka�.");
				String selectCombat = input.nextLine().toUpperCase();
				afterHit();
				if (selectCombat.equals("V")) {
					System.out.println("Siz vurdunuz!");
					this.getObstacle().setHealth(this.obstacle.getHealth() - this.getPlayer().getTotalDamage());
					afterHit();

					if (this.getObstacle().getHealth() > 0) {
						System.out.println();
						System.out.println(this.getObstacle().getName() + " size vurdu!");
						int obstacleDamage = this.getObstacle().getDamage()
								- this.getPlayer().getInventory().getArmor().getResistence();
						this.getPlayer().setHealth(this.getPlayer().getHealth() - this.getObstacle().getDamage());
						if (obstacleDamage < 0) {
							obstacleDamage = 0;
						}

						this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
						afterHit();

					}
				} else {
					return false;
				}

			}

			if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {

				System.out.println("D��man� yendiniz!");
				System.out.println(this.getObstacle().getAward() + " para kazand�n�z!");
				this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
				System.out.println("G�ncel paran�z: " + this.getPlayer().getMoney());
			}
		}
		return false;
	}

	public void afterHit() {
		System.out.println("Can�n�z: " + this.getPlayer().getHealth());
		System.out.println(this.getObstacle().getName() + " Can�: " + this.getObstacle().getHealth());
		System.out.println();
	}

	public void playerStats() {
		System.out.println("Oyuncu De�erleri");
		System.out.println("---------");
		System.out.println("Sa�l�k: " + this.getPlayer().getHealth());
		System.out.println("Hasar: " + this.getPlayer().getTotalDamage());
		System.out.println("Para: " + this.getPlayer().getMoney());
		System.out.println("Silah: " + this.getPlayer().getInventory().getWeapon().getName());
		System.out.println("Z�rh: " + this.getPlayer().getInventory().getArmor().getName());
		System.out.println("Bloklama: " + this.getPlayer().getInventory().getArmor().getResistence());
		System.out.println();
	}

	public void obstacleStats(int i) {
		System.out.println(i + ". " + this.getObstacle().getName() + " De�erleri");
		System.out.println("---------");
		System.out.println("Sa�l�k: " + this.getObstacle().getHealth());
		System.out.println("Hasar: " + this.getObstacle().getDamage());
		System.out.println("Para: " + this.getObstacle().getAward());
		System.out.println();
	}

	public int randomObstacleNumber() {
		Random r = new Random();
		return r.nextInt(this.getMaxObstacle()) + 1;
	}

	public Obstacle getObstacle() {
		return obstacle;
	}

	public String getAward() {
		return award;
	}

	public void setAward(String award) {
		this.award = award;
	}

	public int getMaxObstacle() {
		return maxObstacle;
	}

	public void setMaxObstacle(int maxObstacle) {
		this.maxObstacle = maxObstacle;
	}

	public String getSelectCombat() {
		return selectCombat;
	}

	public void setSelectCombat(String selectCombat) {
		this.selectCombat = selectCombat;
	}

	public boolean isSelectCombatValue() {
		return selectCombatValue;
	}

	public void setSelectCombatValue(boolean selectCombatValue) {
		this.selectCombatValue = selectCombatValue;
	}

}
