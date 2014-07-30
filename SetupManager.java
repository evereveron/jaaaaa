
/*
this class will run all setup stuff for you.
it should initialize the monsters, the npcs, the map, basically the descriptions of stuff.
 */
public class SetupManager {

    public SetupManager() {
        return;
    }

    public void initMonsters(CombatEngine combatEngine) {
        Creature creature = new Creature("Giant Moth", "Disrupts your sleep through terror tactics.", false, false, 10, 3);
        combatEngine.addMonster(1, creature);
        return;
    }

    public void initPlayer(Player player) {
        //roll for stats:
        player.setHealth((int)(Math.random()*100));
        player.setStrength(5);
        player.setLuck((int)(Math.random()*10));
        player.setIntelligence((int)(Math.random()*10));

        player.displayStats();


        //choose affiliation, etc
    }

}
