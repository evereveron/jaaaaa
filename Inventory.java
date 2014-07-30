import java.util.ArrayList; 
import java.util.Scanner;


public class Inventory { 

	private static Scanner scanner; 
	public ArrayList<Item> inventory; 

	public Inventory() {
		scanner = new Scanner(System.in);
		inventory = new ArrayList<Item>(); 
	}

	public void inventoryMenu() {
		boolean exit = false; 
		printMenu(); 
		while (!exit) {
			String option = scanner.next(); 
			if (option.equals("m")) {
				System.out.println("enter the item to examine or (c) to close inventory"); 
				String thingName = scanner.next(); 
				if (thingName.equals("c")) {
					option = "c"; 
				} else {
				moreInfo(thingName); 
				}
			} else if (option.equals("c")) {
				exit = true; 
			} else { 
				System.out.println("invalid input, please try again.");
			}
		}
		return;
	}

	public void printMenu() {
		System.out.println("inventory options:"); 
		System.out.println("(m) more info on an object"); 
		System.out.println("(c) close inventory"); 
		return; 
	}

	private void moreInfo(String thingName) {

		for (Item item : inventory) {
			if (thingName.equals(item.name)) {
				System.out.println(thingName + ": " + item.description); 
			} else {
				System.out.println("this item doesn't exist or you typed it incorrectly");
				System.out.println("enter (m) to try again or (c) to close inventory");  
			}
		}
		return; 
	}

	public void add(Item thing) {
		inventory.add(thing); 
		return; 
	}

	public void remove(Item thing) {
		inventory.remove(thing); 
		return; 
	}

	public String toString() {
		// String inventoryString = ""; 
		// for (Item item : inventory) {
		// 	inventoryString += item.name; 
		// 	inventoryString += ", "; 
		// }
		// return inventoryString; 
		return "your inventory: " + inventory.toString(); 
	}

}