

public class Food extends Item { 

	private int health; 

	public Food(String name) { 
		super(name); 
		description = describe(name); 
		value = setValue(name); 
		health = setHealth(name); 
	}

	public String describe(String name) { 
		if (name.equals("pizza")) {
			description = "a delicious combination of tomato and flour and cheese!!!"; 
		} else if (name.equals("apple")) { 
			description = "a typical apple - juicy, delicious, fruity."; 
		} else if (name.equals("escargot")) {
			description = "a cooked snail from the faraway kingdom of France."; 
		} else {
			description = "a food."; 
		}
		return description; 
	}

	public int setHealth(String name) {
		if (name.equals("pizza")) {
			health = 5;
		} else if (name.equals("apple")) { 
			health = 10;
		} else if (name.equals("escargot")) {
			health = 12; 
		} else { 
			health = 0; 
		}
		return health; 
	} 

	public int setValue(String name) {
		if (name.equals("pizza")) {
			int value = 50; 
		} else if (name.equals("apple")) {
			int value = 5; 
		} else if (name.equals("escargot")) {
			int value = 100; 
		} else {
			int value = 10; 
		} 
		return value; 
	}

	public int getHealth(String name) {
		return health; 
	}
}