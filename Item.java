

public class Item {

	public String name;
	public String description;
	private int value; 

	public Item(String name) { 
		this.name = name;
		description = describe(name);
		value = setValue(name); 
	}

	public String describe(String name) {
		return "this is an item."; 
	}

	public int setValue(String name) {
		return 1; 
	}

	public int getValue(String name) {
		return value; 
	} 

	public String toString() {
		return name; 
	}

}