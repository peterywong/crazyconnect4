/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnect4;

import java.util.Scanner;

/**
 *
 * @author peterw, crystalc
 */
public class CrazyConnect4 {
        String name;
        String instructions = 
        "This game will play like the classic Connect. Each player will\n" + 
        "take a turn dropping a token into one of the 10 columns. Once\n" + 
        "someone get a connect 4, it will clear the rows that are in\n" + 
        "connection with the rows have the connect 4 in them. So once\n" + 
        "the rows are cleared the game would continue until there are 3\n" + 
        "wins and whoever has the most win wins the game.\n\n" +
        "The cleared rows would either be 4 rows or just one row depending\n" + 
        "if they have the 4 connects in a vertical or diagonal or horizontally.\n\n" +
        "These changes will make the game last longer and make it more fun\n" + 
        "for the people that have played the original game.";
        
        
    public CrazyConnect4() {
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CrazyConnect4 myGame = new CrazyConnect4();
        myGame.getName();
        myGame.displayHelp();
        
        Board board = new Board();
        board.displaySize();

        Game game = new Game();
        game.displayPlayers();
        
    }
    public void getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
       
    }
    
    public void displayHelp() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }  
}
