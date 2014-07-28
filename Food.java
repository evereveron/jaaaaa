

public class Food extends Item { 

	private int health; 

	public Food(String name) { 
		super(name); 
		description = describe(name); 
		health = 0; 
	}

	public String describe(String name) { 
		if (name == "pizza") {
			String description = 
				"a delicious combination of tomato and flour and cheese!!!"; 
		} else if (name == "apple") { 
			String description = "a typical apple."; 
		} else if (name == "escargot") {
			String description = "a cooked snail."; 
		}

		return description; 
	}

}