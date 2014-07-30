import java.io.*;
import java.io.DataInputStream;
import java.util.Scanner;


public class Jaaaaa {

    private static Scanner scanner = new Scanner(System.in);
    private static CombatEngine combatEngine = new CombatEngine();
    private static SetupManager setupManager = new SetupManager();

    private static final String NORTH = "n";
    private static final String SOUTH = "s";
    private static final String EAST = "e";
    private static final String WEST = "w";
    private static final String INVENTORY = "i";
    private static final String PET = "p";
    private static final String LOOK = "l";
    private static final String LAZE = "0";
    private static final String MENU = "m"; //should this be map
    private static final String HELP = "?";
    private static final String QUIT = "q";
    private static final String STATS = "t"; //why is this t, idk.
    private static final String MONEY = "$";


    public static void main(String[] args) {
        Player player = startGame();

        boolean alive = true;
        while(alive) {
            alive = runRound(player);
            if(!alive) {
                System.out.println("\nonce more into the abyss?");
                boolean again = scanner.nextBoolean();
                if(again) {
                    player = startGame();
                }
                else {
                    System.out.println("\nhave a nice day :)");
                }
            }
        }

    }

    //cases will be implemented as methods are made.
    private static boolean runRound(Player player){
        System.out.print("Action: ");
        String action = scanner.nextLine();

        switch(action) {
            case NORTH:
                break;
            case SOUTH:
                break;
            case WEST:
                break;
            case EAST:
                break;
            case INVENTORY:
                break;
            case PET:
                break;
            case LOOK:
                break;
            case LAZE:
                break;
            case MENU:
                displayMainMenu();
                break;
            case HELP:
                break;
            case QUIT:
                quitGame();
                break;
            case STATS:
                player.displayStats();
                break;
            case MONEY:
                System.out.println(player.getWallet());
            default:
                System.out.println("not a valid command");
                return true;
        }

        //roll for random event

        //roll for combat?
        //should be random. right now it is forced:
        boolean alive = combatEngine.CombatRound(1, player);
        if(!alive) {
            return false;
        }
        return true;
    }

    /*
    this method displays the menu. only called when asked for.
    otherwise it's annoying to see the menu pop up every time you just want to travel.
     */
    private static void displayMainMenu(){
        System.out.println("~~~~ ACTION MENU ~~~~ \n");
        System.out.println("(n) move north");
        System.out.println("(s) move south");
        System.out.println("(e) move east");
        System.out.println("(w) move west");
        System.out.println("(i) open inventory");
        System.out.println("(p) open pet menu");
        System.out.println("(l) look around");
        System.out.println("(0) laze about");
        System.out.println("($) check wallet"); 

    }

    private static void clearScreen() {
        for(int i=0; i<20; i++) {
            System.out.println("");
        }
    }

    private static void quitGame() {
        System.out.println("Are you sure you want to quit? Progress is not saved. (true/false)");
        boolean quit = true;
        try {
            quit = scanner.nextBoolean();
        }catch (Exception e){
            System.out.println("Error: wrong input");
            return;
        }
        if(quit) {
            System.out.println("have a nice day :)");
            System.exit(0);
        }
        else {
            return;
        }
    }

    private static Player startGame() {
        clearScreen();
        System.out.println("Welcome to Jasmine and Anji's Awesome Adventure App");
        System.out.println("--------------------------------------------------- \n");
        System.out.println("Wut ur name bro: ");

        String name = scanner.nextLine();
        Player player = new Player(name);
        System.out.println("\nHi " + name + "!\n");
        System.out.println("here is a free silver coin to start you on your journey.");
        player.addCoins(0,1,0);

            setupManager.initPlayer(player);
        setupManager.initMonsters(combatEngine);

        return player;
    }
}