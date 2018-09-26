# TicTacToeByCoffeeCo.
An exhilarating game of Tic Tac Toe for your entertainment.

This game is a traditional game of Tic Tac Toe. It is played in an IDE console.
The game starts via the function main(String args[]) in Main.java.

A player chooses a space by typing a corresponding number 1-9 as follows:

-------------
| 1 | 2 | 3 |
-------------
| 4 | 5 | 6 |
-------------
| 7 | 8 | 9 |
-------------

The first player will be assigned 'X' and the second player will be assigned 'O'. No further players
or symbols are allowed.
Players go back and forth choosing a space until a player has gotten 3 X's in a row, 3 O's in a row,
or the spaces fill up in a tie game.
If either player provides an out of bounds input, ( <1 or >9 ), then the player will be asked
to provide an input again.
The game ends when a player wins or the game is a draw.
The user must re-run the game to play again.


The game is codes in Java ~~ there are two classes:

Main: Handles initiation of the game and controls game flow.
The Main class prints out the instructional board to the user. A nested while loop controls determines when
a game is running and who's turn it is - either X or o. It receives input from the user and passes input to the Board class.

Board: Handles creation of the board and controls game logic.
The Board class does the logical and strategic work behind the scenes. It detects wins, losses, and ties.
Board spaces on the GUI are maintained by a 2d integer array. Data is processed and passed back to Main to output game updates
to the user.



Thanks for playing!
