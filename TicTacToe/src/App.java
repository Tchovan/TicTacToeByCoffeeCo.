//Class that holds the main initiation and creation of the game.

import java.util.Scanner;

public class App {

    public void main(String args[]) {      //Controls game flow

        Scanner scan = new Scanner (System.in);
        Board b = new Board();
        Game g = new Game();

        System.out.println("Welcome to Tic Tac Toe by Coffee Co.!");
        System.out.println("-------------------------------------");
        System.out.println();

        b.setEmptyBoard();
        g.startGame();
        b.printBoard();

    }


}
