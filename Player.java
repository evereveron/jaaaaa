// player class 

import java.lang.String;
import java.util.ArrayList;
import java.util.Map;

public class Player { 

	public String name; 
	private ArrayList<Item> inventory; //this would ideally be a hashmap
    private Map<String, Item> equipment;
	private String affiliation; 
	private MoneyPouch wallet;
    public int health;
    private int luck;
    private int intelligence;
    public int strength;


	public Player(String name) { 
		this.name = name;
		inventory = new ArrayList<Item>(); 
		wallet = new MoneyPouch(); 
	} 

	public void addInventory(Item thing){
		inventory.add(thing); 
	}

    public void displayStats() {
        System.out.println("health:\t" + this.health);
        System.out.println("luck\t" + this.luck);
        System.out.println("intelligence\t" + this.intelligence);
        System.out.println("strength\t" + this.strength);
        System.out.println("");
        return;
    }


    // getters and setters

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public MoneyPouch getWallet() {
        return wallet;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public Map<String, Item> getEquipment() {
        return equipment;
    }

    /*
    @param String key should ideally be the type i.e. helmet
    @param Item item is the item itself
     */
    public void setEquipment(String key, Item item) {
        Item removed = equipment.remove(key);
        inventory.add(removed);
        //this wont' work i think;
        inventory.remove(item);
        equipment.put(key, item);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public void addCoins(int gold, int silver, int copper) {
		wallet.add(gold, silver, copper); 
	}

	public void removeCoins(int gold, int silver, int copper) {
		wallet.remove(gold, silver, copper); 
	}


}
