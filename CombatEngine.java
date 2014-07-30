import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;

public class CombatEngine {
    Map<Integer, Creature> monsters; //tbh why is the monsters map being initialized here? idk :(

    public CombatEngine() {
        monsters = new HashMap<Integer, Creature>();
    }

    public boolean CombatRound(Integer key, Player player) {
        //determine who goes first
        /*
        int monsterRoll = (int)Math.random()*100;
        int playerRoll = ((int)Math.random()*100) + player.getLuck();
        if(monsterRoll > playerRoll) {

        }
        else()
        */

        //jk player always goes first
        Creature monster = monsters.get(key);
        while(monster.health > 0 && player.health > 0) {
            //NOTE:    (int)(Math.random() * (max - min) + min)
            System.out.println("");
            System.out.println("------------------------");
            System.out.println("You attack!\n");
            int playerAttack = (int)(Math.random()* player.strength); //+ weapons + etc
            monster.health = monster.health - playerAttack;

            System.out.println(monster.name + "'s health is now " + monster.health);

            if(isEnd(monster, player)) {
                break;
            }

            System.out.println("");
            System.out.println(monster.name + " attacks!\n");
            int monsterAttack = (int)(Math.random() * (monster.attack));
            player.health = player.health - monsterAttack;

            System.out.println("Your health is now " + player.health);

            if(isEnd(monster, player)) {
                break;
            }
        }
        if(monster.health <= 0) {
            //player wins

            //TODO: loot and stuff like that
            System.out.println("VICTORYYYY!!!!!");
            return true;
        }
        else if(player.health <= 0) {
            //monster wins

            System.out.println("lol u ded");
            return false;
        }
        else {
            //?????
            return true;
        }
    }

    public void addMonster(Integer key, Creature monster) {
        monsters.put(key, monster);
    }

    //idk this is really redundant lmao oh well
    private boolean isEnd(Creature monster, Player player) {
        if(monster.health <= 0 && player.health <= 0) {
            return true;
        }
        else {
            return false;
        }
    }



}