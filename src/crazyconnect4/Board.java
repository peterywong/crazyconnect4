/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnect4;

import java.awt.Point;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author peterw crystalc
 */
public class Board  {
    
    int rowCount = 10;
    int columnCount = 10;
    
    Location[][] boardLocations;
    

    public Board() {
    }

    
    public void displaySize() {
        System.out.println("\n\tThe board is " + this.rowCount + " by " 
                           + this.columnCount + " in size.");
    }

  

    

}
