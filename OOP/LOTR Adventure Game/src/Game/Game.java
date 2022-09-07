package Game;

import java.util.Scanner;

import Locations.*;

public class Game {

	private Scanner input = new Scanner(System.in);

	public void start() {
		System.out.print("==|--------  ");
		System.out.print("Y�z�klerin Efendisi : G�� Y�z�kleri");
		System.out.println("  --------|==");
		System.out.print("\nL�tfen bir isim giriniz: ");

		String playerName = input.nextLine();
		Player player = new Player(playerName);
		System.out.println("Ho�geldin " + player.getName() + " !\n");
		player.selectChar();

		Location location = null;

		while (true) {
			player.printInfo();
			System.out.println("");
			System.out.println("B�lgeler");
			System.out.println("1 - Safe House  ==> G�venli alan.Burada d��man yoktur. Can�n�z� yenileyebilirsiniz.");
			System.out.println("2 - Tool Store  ==> Gereken e�yalar� buradan temin edebilirsiniz.");
			System.out.println("3 - Dol Guldur ==> Goblinler bulunur.");
			System.out.println("4 - Isengard ==> Uruk Hai bulunur.");
			System.out.println("5 - Mordor ==> Orklar bulunur.");
			System.out.println("0 - ��k�� Yap");
			System.out.println("L�tfen gitmek istedi�iniz mekan� se�in: ");

			int selectLoc = input.nextInt();
			switch (selectLoc) {
			case 0:

				location = null;
				break;
			case 1:
				location = new SafeHouse(player);
				break;
			case 2:
				location = new ToolStore(player);
				break;
			case 3:
				location = new DolGuldur(player);
				break;
			case 4:
				location = new Isengard(player);
				break;
			case 5:
				location = new Mordor(player);
				break;
			default:
				location = new SafeHouse(player);

			}

			if (location == null) {
				System.out.println("Oyun sona erdi.G�r��mek �zere..");
				break;
			}

			System.out.println(location.getName());
			if (!location.onLocation()) {
				System.out.println("�ld�n�z.. GAME OVER");
				break;
			}

		}

	}
}
