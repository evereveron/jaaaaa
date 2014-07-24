// holds player's money 
// use gold dragons, silver stags, and copper pennies a la westeros  
// can update to more complex ?? 
// (according to http://awoiaf.westeros.org/index.php/Currency 
// they have more specific types of coppers and silvers LOL) 

public class MoneyPouch { 

	int gold; 
	int silver; 
	int copper; 
	int iron; // v rare!!! u can only get one if u run into Jaqen H'gar.

	public MoneyPouch() { 
		gold = 0; 
		silver = 0; 
		copper = 0; 
		iron = 0; 
	}

	public void add(int gold, int silver, int copper) { 
		// lol this is so shitty!!! 
		// can you use keyword arguments in java????? 
		// ugh should have just used python 
		// ha i found one way python is better than java s
		this.gold += gold; 
		this.silver += silver; 
		this.copper += copper; 
	}

	public void remove(int gold, int silver, int copper) {
		this.gold -= gold; 
		this.silver -= silver; 
		this.copper -= copper; 
	}

	// so annoying lol would it be better to just use dollar amounts?? 
	// or like only one type of coin 

}