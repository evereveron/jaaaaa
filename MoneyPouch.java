// holds player's money 
// use gold dragons, silver stags, and copper pennies a la westeros  
// can update to more complex ?? 
// (according to http://awoiaf.westeros.org/index.php/Currency 
// they have more specific types of coppers and silvers LOL) 

public class MoneyPouch { 

	private int gold; 
	private int silver; 
	private int copper; 
	private int iron; // v rare!!! u can only get one if u run into Jaqen H'gar.
	private int total; // total value of your coins in coppers 
	private int goldRate = 500; 
	private int silverRate = 50; // exchange rates can change

	// magical money pouch!! 
	// automatically converts to highest coins after every transaction 

	public MoneyPouch() { 
		gold = 0; 
		silver = 0; 
		copper = 0; 
		iron = 0; 
		total = 0; 
	}

	public void add(int gold, int silver, int copper) { 
		int subtotal = gold * goldRate + silver * silverRate + copper; 
		this.total += subtotal; 
		fix_coins();
		return; 
	}

	public void remove(int gold, int silver, int copper) {
		int subtotal = gold * goldRate + silver * silverRate + copper; 
		this.total -= subtotal;
		fix_coins();
		return; 
	}

	private void fix_coins(){
		int remaining = this.total; 
		this.gold = remaining%goldRate; 
		remaining -= this.gold*goldRate; 
		this.silver = remaining%silverRate; 
		remaining -= this.silver*silverRate; 
		this.copper = remaining; 
		return; 
	}

	public String toString() { 
		return gold + "golds," + silver + "silvers," + copper + "coppers."; 
	}

}