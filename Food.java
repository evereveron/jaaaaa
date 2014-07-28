

public class Food extends Item { 

	private int health; 

	public Food(String name) { 
		super(name); 
		description = describe(name); 
		value = setValue(name); 
		health = setHealth(name); 
	}

	public String describe(String name) { 
		if (name == "pizza") {
			String description = 
				"a delicious combination of tomato and flour and cheese!!!"; 
		} else if (name == "apple") { 
			String description = "a typical apple."; 
		} else if (name == "escargot") {
			String description = "a cooked snail."; 
		} else {
			String description = "a food."; 
		}
		return description; 
	}

	private int setHealth(String name) {
		if (name == "pizza") {
			int health = 5;
		} else if (name == "apple") { 
			int health = 10;
		} else if (name == "escargot") {
			int health = 12; 
		} else { 
			int health = 0; 
		}
		return health; 
	} 

	private int setValue(String name) {
		if (name == "pizza") {
			int value = 50; 
		} else if (name == "apple") {
			int value = 5; 
		} else if (name == "escargot") {
			int value = 100; 
		} else {
			int value = 10; 
		} 
		return value; 
	}

	public int getHealth(String name) {
		return self.health; 
	}
}