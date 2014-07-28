import java.io.*;
import java.io.DataInputStream;
import java.util.Scanner;


public class Jaaaaa {

    private static Scanner scanner = new Scanner(System.in);

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


    public static void main(String[] args) {
        clearScreen();
        System.out.println("Welcome to Jasmine and Anji's Awesome Adventure App");
        System.out.println("--------------------------------------------------- \n");
        System.out.println("Wut ur name bro: ");

        String name = scanner.nextLine();
        Player player = new Player(name);
        System.out.println("Hi " + name + "!");

        boolean play = true;
        while(play) {
            runRound(player);
        }

    }

    //cases will be implemented as methods are made.
    private static void runRound(Player player){
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
        }

        //roll for random event


        //roll for combat?


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

    }

    private static void clearScreen() {
        for(int i=0; i<20; i++) {
            System.out.println("");
        }
    }

    private static void quitGame() {
        System.out.println("Are you sure you want to quit? Progress is not saved.");
        boolean quit = scanner.nextBoolean();
        if(quit) {
            System.out.println("have a nice day :)");
            System.exit(0);
        }
        else {
            return;
        }
    }
}