/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnect4;

/**
 *
 * @author peterw
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

}