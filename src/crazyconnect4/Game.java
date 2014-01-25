/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnect4;

/**
 *
 * @author peterw, crystalc
 */
public class Game {

     String gameType;
     Player playerA;
     Player playerB;
     Player currentPlayer;
     Player otherPlayer;
     Player winner;
     Player loser;
     String status;
     int currentWins;
     Board board;
   

    public Game() {
   
       this.playerA = new Player();
       this.playerA.name = "Iron Man";
       this.playerB = new Player();
       this.playerB.name = "Hawkeye";
       this.gameType = "Two Players";
       this.status = "Starting game";
       this.currentWins = 0;
       
       
    }


    public void displayWinningMessage () {
        System.out.println(
             "\n\t*******************************************************************************"
             + "\n\t Congratulations " + this.winner.name + "! You won the game."
             + "\n\t Sorry " + this.loser.name + ", You are the loser." 
             + "\n\t*******************************************************************************");
    }

    public void displayTiedMessage () {
       System.out.println( 
               "\n\t*******************************************************************************"
             + "\n\t The game is a tie. Better luck next time!" 
             + "\n\t*******************************************************************************");
    }
    
    public void displayPlayers() {
        System.out.println("\n\tHere are the two default players in the game of Crazy Connect 4.");
        this.playerA.displayName();
        this.playerB.displayName();
                              
    }
    
    public void displayGameStatus() {
        System.out.println(
             "\n\t Game Status: " + this.status + ".");                              
    }    

    public void displayGameType() {
        System.out.println(
             "\n\t Game Type: " + this.gameType + ".");                              
    } 

    public int getCurrentWins() {
        return this.currentWins;                            
    }    
    
}
