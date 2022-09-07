package Game;

import java.util.Scanner;

import Characters.Dwarfs;
import Characters.Elves;
import Characters.GameChar;
import Characters.Men;

public class Player {

	private int damage;
	private int health;
	private int money;
	private int originalHealth;
	private String name;
	private String charName;
	private Scanner input = new Scanner(System.in);
	protected Inventory inventory;
	private int totalDamage;
	
	
	

	public Player(String name) {

		this.name = name;
		this.inventory = new Inventory(null);
	}

	public void selectChar() {

		GameChar[] charList = { new Elves(), new Men(), new Dwarfs() };

		System.out.println("Karakterler:");
		System.out.println("--------------------");

		for (GameChar gameChar : charList) {
			System.out.println("ID: " + gameChar.getId() + 
					"\tKarakter: " + gameChar.getName() + 
					"\t  Hasar: " + gameChar.getDamage() + 
					"\tSaðlýk: "+ gameChar.getHealth() + 
					"\tPara: " + gameChar.getMoney());
		}

		System.out.println("--------------------");
		System.out.print("Lütfen karakter seçiniz: ");

		int selectChar = input.nextInt();
		switch (selectChar) {
		case 1:
			initPlayer(new Elves());
			break;

		case 2:
			initPlayer(new Men());
			break;

		case 3:
			initPlayer(new Dwarfs());
			break;

		default:
			initPlayer(new Men());
			break;
			
			
		}
		
		System.out.println("Karakter: " + this.getCharName() + 
				" Hasar: " + this.getDamage() + 
				" Saðlýk: " + this.getHealth() + 
				" Para: " + this.getMoney());
	}
	
	public void printInfo() {
System.out.println(
		"Silahýnýz: " + this.getInventory().getWeapon().getName() +
		", Bloklama: " + this.getInventory().getArmor().getResistence() + 
		", Zýrhýnýz: " +this.getInventory().getArmor().getName() + 
 		", Hasarýnýz: " + this.getTotalDamage() + 
		", Saðlýk: " + this.getHealth() + 
		", Para: " + this.getMoney());
	}

	
	

	public void initPlayer(GameChar gameChar) {
		this.setDamage(gameChar.getDamage());
		this.setHealth(gameChar.getHealth());
		this.setMoney(gameChar.getMoney());
		this.setCharName(gameChar.getName());
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	


	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public int getTotalDamage() {
		return damage + this.getInventory().getWeapon().getDamage();
	}

	public void setTotalDamage(int totalDamage) {
		this.totalDamage = totalDamage;
	}

	public int getOriginalHealth() {
		return originalHealth;
	}

	public void setOriginalHealth(int originalHealth) {
		this.originalHealth = originalHealth;
	}


	
	

}