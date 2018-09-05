//Class that handles data regarding the board.

import java.io.*;


public class Board {

    private char[][] board;

    public Board() {
        board = new char[3][3];
    }

    public void setEmptyBoard(){        //initializes a new board; sets all slots to " - "
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {         //prints board in standard format
        System.out.println("-------------");
        for (int i=0; i <3; i++) {
            System.out.print("| ");
            for (int j=0; j<3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    boolean isFull() {      //checks to see if the board is full
        boolean full = true;
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (board[i][j] == '-') {
                    full = false;
                }
            }
        }
        return full;
    }


    Player getPlayerPosition(int[] position) {      //returns players given position
    }

    boolean move(Player player, int[] position) {   //player makes a move on the board
    }


}
