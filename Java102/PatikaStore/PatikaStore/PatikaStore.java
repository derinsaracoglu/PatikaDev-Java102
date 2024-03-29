package PatikaStore;

import java.util.Scanner;

public class PatikaStore {
	Scanner scan = new Scanner(System.in);

	public void run() {
		 while(true) {
			 
			 System.out.println("PatikaStore Product Management Panel");
			 
			 System.out.println("1 - Notebook");
			 System.out.println("2 - Mobile Phone");
			 System.out.println("3 - List Brands");
			 System.out.println("0 - Exit");
			 
			 System.out.println("Your selection: ");
			 int select = scan.nextInt();
			 
			 String[] brands = {"Samsung","Lenovo","Apple","Huawei","Casper","Asus","HP","Xiaomi","Monster"};
			 int index = 0;
			 for(String brand : brands) {
				 Brands.addBrand(brand, index++);
			 }
			 
			 boolean isExit = false;
			 switch(select) {
			 case 1:
				 System.out.println("1 selected");
				 Product.menu(1);
				 break;
				 
			 case 2:
				 System.out.println("2 selected");
				 Product.menu(2);
				 break;
				 
			 case 3:
				 System.out.println("3 selected");
				 Product.menu(3);
				 break;
			
			 case 0:
                 isExit = true;
             default:
                 System.out.println();
                 System.out.println("There is no such an option. Please enter your choice again.");
                 System.out.println();
			 }
			 
			 if(isExit) {
				 System.out.println();
				 System.out.println("You've left the store.See you later.");
				 return;
			 }
		 }
	 }
}
