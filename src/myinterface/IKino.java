/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author User
 */
public interface IKino {
    
    int moneyBet(int moneyBet);
          
    int numberOfDraws(int numberOfDraws);
            
    int totalEarnings(int moneyBet , int numberOfDraws);
   
    
    Integer[] betMoney_Values();
    
    Integer[] rollPlays_Values();

    void runADraw();

    void showDrawNumbers();

    void calculateEarnings();
    
    void printBetMoneyValues();
    
    void printRollPlaysValues();
}
