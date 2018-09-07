//Class that handles the logic of the game.

import java.util.ArrayList;
import java.util.*;


public class Game {

    private ArrayList<Player> players;
    private Board board;
    private Player currentPlayer;
    final private char XCHAR = 'X';
    final private char OCHAR = 'O';

    public game() {
        players = new ArrayList<Player>();
    }
    //create test for throw exception invalid number of players


    public void startGame() throws Exception {   //starts the game
        System.out.println("The game is starting!");
        Board gameBoard = new Board();
        startGame(gameBoard);

        if (players.size() == 2) {
            //game must have exactly two players
            System.out.print("The game is about to begin!");
        }
        else {
            throw new Exception("There is an invalid number of players.");
        }
    }

    public void endGame() {     //ends the current game
        System.out.println("End of Game.");
    }

    boolean addPlayer(Player newPlayer) {     //adds a new player
        if (!players.contains(newPlayer))
        {
            players.add(newPlayer);
            return true;
        }
        else {
            return false;
        }
    }

    boolean removePlayer(Player removedPlayer) {   //removes an existing player
        int index = players.indexOf(removedPlayer);
        if (index > 1)
        {
            players.remove(index);
            return true;
        }
        else {
            return false;
        }
    }

    Player getLoser() {     //gets the losing player
        Player winner = getWinner();
        Player loser = getNextPlayer(winner);
        return loser;
    }

    Player getWinner() {    //gets the winning player
        //  return winner;
        //checks vertical rows
        for (int i = 0; i < 3; i++) {
            if((board.getPlayerPosition(new int[]{0, i}) == board.getPlayerPosition(new int[]{1,i})) && (board.getPlayerPosition(new int[] {1,i}) == board.getPlayerPosition(new int[]{2,i}))){
                return board.getPlayerPosition(new int[]{0, i});
            }
            else{
                return null;
            }
        }
        //checks horizontal rows
        for (int j = 0; j<3; j++) {
            if ((board.getPlayerPosition(new int[]{j, 0}) == board.getPlayerPosition(new int[]{j, 1})) && (board.getPlayerPosition(new int[]{j, 1}) == board.getPlayerPosition(new int[]{j, 2})))
                ;
            return board.getPlayerPosition(new int[]{j, 2});

        else{
                return null;
            }
            //TODO: Figure out a way to check diagonal wins
        }

    }

    char setLetterForPlayer(Player player) {   //sets the letter being used by the player
            int index = getIndexOfPlayer(player);
            if (index == -1){
                return ' ';
            }
            else if (index == 0){
                return XCHAR;
            }
            else {
                return OCHAR;
            }
    }

    private int getIndexOfPlayer(Player player){
        int index = players.indexOf(player);
        return index;
    }

    private int getNextPlayerIndex(Player player){
        int index = getNextPlayerIndex(player);
        index ++;
        if (index >= players.size()){
            index = 0;
        }
        return index;
    }
    private Player getNextPlayer(Player player){
        int nextIndex = getNextPlayerIndex(player);
        if (nextIndex > -1){
            Player next = players.get(nextIndex);
            return next;
        }
        else {
            return null;
        }
    }

    private void switchPlayer() {
        //selects the next player
        currentPlayer = getNextPlayer(currentPlayer);
    }




    public boolean move(Player player, int[] position){
            boolean validMove = board.move(player, position);
            //first it will check if there are any winners
            Player winner = getWinner();
            Player loser = getLoser();
            if (winner != null) {
                winner.wonGame(board, this);
                loser.lostGame(board, this);
                endGame();
                return validMove;
            }
            else if(board.isFull()){
                //The game will be over if true
                System.out.println("This game was a draw.");
                endGame();
                return validMove;
            }
            if (validMove){
                // If a valid move was made it will then switch the players
                switchPlayer();
            }

        }




    public Board getBoard() {
        return board;   //returns the game board
    }

}
