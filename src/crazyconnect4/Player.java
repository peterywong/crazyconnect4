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
public class Player {
    
    String name;
    String playerType;
    long wins = 0;
    long losses = 0;
    long ties = 0;
    String marker;
    
    

    public Player() {
    }

    
    public void displayName() {
        System.out.println("\t\tGreetings, my name is "  + this.name); 
    }
    
    public String getPlayerStastics() {
        String playerStatistics = 
                this.name + " has won "
                + this.getWinningPercentage(this.wins, this.losses, this.ties) + "% of the games."
                + "\n\t" + this.wins + " wins, "
                + this.losses + " losses and "
                + this.ties + " ties.";
        return playerStatistics;

}
    public double getWinningPercentage(long wins, long losses, long ties) {
     
        if (wins < 0 ) {
            System.out.println("\n\tThe number of wins must be "
                    + "greater than or equal to zero.");
            return -999;
        }
        
        if (losses < 0 ) {
            System.out.println("\n\tThe number of losses must be "
                    + "greater than or equal to zero.");
            return -999;
        }
        
        if (ties < 0 ) {
            System.out.println("\n\tThe number of ties must be "
                    + "greater than or equal to zero.");
            return -999;
        }
        
        double totalScore = wins + losses + ties;
        
        if (totalScore ==  0) {
            return 0;
        }
        
        double winLossRatio = wins / totalScore;
        return winLossRatio * 100;
    }
    
}