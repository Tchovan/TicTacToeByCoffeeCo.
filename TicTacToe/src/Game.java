//Class that handles the logic of the game.

public class Game {


    public void startGame() {   //starts the game
        System.out.println("The game is starting!");
    }

    public void endGame() {     //ends the current game
        System.out.println("End of Game.");

    }

    boolean addPlayer(Player newPlayer) {     //adds a new player
        return true;
    }

    boolean removePlayer(Player removedPlayer) {   //removes an existing player
        return true;
    }

    Player getLoser() {     //gets the losing player
       // return loser;
    }

    Player getWinner() {    //gets the winning player
        //  return winner;
    }

    char setLetterForPlayer(Player player) {   //sets the letter being used by the player
    }

    Board getBoard() {      //returns the game board
    }

}
