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
        System.out.println("");
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
    private boolean checkMatching(char char1, char char2, char char3) {
        boolean match = false;
        if ((char1 != '-') && (char1 == char2) && (char2 == char3)) {
            match = true;
        }
        return match;
    }

    private boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (checkMatching(board[i][0], board[i][1], board[i][2]) == true) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumns() {
        for (int i = 0; i < 3; i++)
        {
            if (checkMatching(board[0][i], board[1][i], board[2][i]) == true)
            {
                return true;
            }
        }
        return false;
    }
    private boolean checkDiagonals() {
        return ((checkMatching(board[0][0], board[1][1], board[2][2]) == true) || (checkMatching(board[0][2], board[1][1], board[2][0]) == true));
    }

    boolean isFull() {      //checks to see if the board is full
        boolean full = true;
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (board[i][j] == '-') {      //indicates an empty slot
                    full = false;
                }
            }
        }
        return full;
    }


    Player getPlayerPosition(int[] position) {      //returns players given position
        return null;
    }

    boolean move(Player player, int[] position) {   //player makes a move on the board
        return false;
    }


}
