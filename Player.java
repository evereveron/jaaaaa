// player class 

import java.util.ArrayList; 

public class Player { 

	String name; 
	ArrayList<String> inventory; 
	String affiliation; 
	MoneyPouch wallet; 

	public Player(String name) { 
		this.name = name;
		inventory = new ArrayList<String>(); 
		wallet = new MoneyPouch(); 
	} 


}