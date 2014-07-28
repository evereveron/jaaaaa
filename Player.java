// player class 

import java.util.ArrayList; 

public class Player { 

	public String name; 
	private ArrayList<Item> inventory; 
	private String affiliation; 
	private MoneyPouch wallet; 

	public Player(String name) { 
		this.name = name;
		inventory = new ArrayList<Item>(); 
		wallet = new MoneyPouch(); 
	} 

	private void addInventory(Item thing){
		inventory.add(thing); 
	}

} 