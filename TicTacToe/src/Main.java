//Class that holds the main initiation and creation of the game.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {      //Controls game flow

        Scanner scan = new Scanner (System.in);
        Board b = new Board();
        Game g = new Game();
        Player p1 = new Player();
        Player p2 = new Player();

        System.out.println("Welcome to Tic Tac Toe by Coffee Co.!");
        System.out.println("-------------------------------------");
        System.out.println();

        b.setEmptyBoard();

        g.addPlayer(p1);
        g.addPlayer(p2);

        g.startGame();
        b.printBoard();


    }
}
