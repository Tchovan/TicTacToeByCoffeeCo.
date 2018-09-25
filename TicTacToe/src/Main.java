//Class that holds the main initiation and creation of the game.

import java.util.Scanner;

public class Main {

    private static char symbol;
    private static int n = 0;


    public static void main(String[] args) throws Exception {      //Controls game flow

        Scanner scan = new Scanner(System.in);
        Board b = new Board();
        Game g = new Game();
        Player p1 = new Player();
        Player p2 = new Player();

        System.out.println("Welcome to Tic Tac Toe by Coffee Co.!");
        System.out.println("-------------------------------------");
        System.out.println("A player selects a square by choosing the corresponding numbers 1-9 on the game board as follows:");


        //prints out the instructional board*************************
        System.out.println("-------------");
        int n = 1;
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(n + " | ");
                n++;
            }
            System.out.println();
            System.out.println("-------------");
        }//prints out the instructional board*************************


        g.addPlayer(p1);
        g.setLetterForPlayer(p1);
        g.addPlayer(p2);
        g.setLetterForPlayer(p2);
        g.startGame();

        b.setEmptyBoard();
        b.printBoard();

        boolean playing = true;
        boolean xTurn = true;
        boolean oTurn = true;

        char symbol = 'X';

        while (playing) {

            while (xTurn) {
                b.setNewBoard(getMove(), symbol);
                b.printBoard();
                if (b.checkWin()) {
                    System.out.println();
                    System.out.println("You just won the game!");
                    playing = false;
                    xTurn = false;

                }
                else {
                    System.out.println();
                    System.out.println("Next player's turn.");
                    symbol = 'O';
                    oTurn = true;
                    xTurn = false;
                }
            }

                while (oTurn) {
                    b.setNewBoard(getMove(), symbol);
                    b.printBoard();
                    if (b.checkWin()) {
                        System.out.println();
                        System.out.println("You just won the game!");
                        playing = false;
                        oTurn = false;
                    }
                    else {
                        System.out.println();
                        System.out.println("Next player's turn.");
                        symbol = 'X';
                        xTurn = true;
                        oTurn = false;
                    }
                }
            }

        g.endGame();

    }

    //determines which space the player chooses
    static int getMove(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose where you would like to move:");
        int playerMove = scan.nextInt();
        while (playerMove <=0 || playerMove >9) {
            System.out.println("Input invalid. Please try again.");
            System.out.println("Choose where you would like to move:");
            playerMove = scan.nextInt();
        }
        if (playerMove > 0 && playerMove < 10) {
            symbol = 'O';
            return playerMove;
        }
        return 0;
    }
}