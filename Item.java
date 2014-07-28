

public class Item {

	public String name;
	public String description;

	public Item(String name) { 
		this.name = name;
		description = describe(name);
	}

	public String describe(String name) {
		return "this is an item."; 
	}

}