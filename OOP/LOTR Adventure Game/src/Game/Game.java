package Game;

import java.util.Scanner;

import Locations.*;

public class Game {

	private Scanner input = new Scanner(System.in);

	public void start() {
		System.out.print("==|--------  ");
		System.out.print("Yüzüklerin Efendisi : Güç Yüzükleri");
		System.out.println("  --------|==");
		System.out.print("\nLütfen bir isim giriniz: ");

		String playerName = input.nextLine();
		Player player = new Player(playerName);
		System.out.println("Hoþgeldin " + player.getName() + " !\n");
		player.selectChar();

		Location location = null;

		while (true) {
			player.printInfo();
			System.out.println("");
			System.out.println("Bölgeler");
			System.out.println("1 - Safe House  ==> Güvenli alan.Burada düþman yoktur. Canýnýzý yenileyebilirsiniz.");
			System.out.println("2 - Tool Store  ==> Gereken eþyalarý buradan temin edebilirsiniz.");
			System.out.println("3 - Dol Guldur ==> Goblinler bulunur.");
			System.out.println("4 - Isengard ==> Uruk Hai bulunur.");
			System.out.println("5 - Mordor ==> Orklar bulunur.");
			System.out.println("0 - Çýkýþ Yap");
			System.out.println("Lütfen gitmek istediðiniz mekaný seçin: ");

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
				System.out.println("Oyun sona erdi.Görüþmek üzere..");
				break;
			}

			System.out.println(location.getName());
			if (!location.onLocation()) {
				System.out.println("Öldünüz.. GAME OVER");
				break;
			}

		}

	}
}
