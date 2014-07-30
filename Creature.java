import java.lang.String;

public class Creature implements NPC {

    public static String name;
    private static String description;
    private static boolean aggressive;
    private static boolean conversation;
    public static int health;
    public static int attack;

    public Creature(String name, String description, boolean aggressive, boolean conversation, int health, int attack) {
        this.name = name;
        this.description = description;
        this.aggressive = aggressive;
        this.conversation = conversation;
        this.health = health;
        this.attack = attack;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAggressive() {
        return aggressive;
    }

    public boolean hasConversation() {
        return conversation;
    }


}