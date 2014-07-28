// player class 

import java.util.ArrayList; 

public class Player { 

	String name; 
	ArrayList<Item> inventory; 
	String affiliation; 
	MoneyPouch wallet; 

	public Player(String name) { 
		this.name = name;
		inventory = new ArrayList<Item>(); 
		wallet = new MoneyPouch(); 
	} 

	private void addInventory(Item thing){
		inventory.add(thing); 
	}

} 