/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.Arrays;
import myclasses.NumbersBoard;

/**
 *
 * @author User
 */
public class KinoGameMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        NumbersBoard x = new NumbersBoard(80, 20);
        
        x.setTheArrayOfKinoNumbers();
        x.setTheArrayOfRandomStoreNumbs();

       // Integer[] randomNumbers = x.getTheArrayOfRandomStoreNumbs();
        
       
        x.runADraw();
        x.showDrawNumbers();

      ///  Integer[] kinoNumbers = x.getTheArrayOfKinoNumbers();

    }
}
