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

    void setMoneyBet(int moneyBet);

    void setNumberOfDraws(int numberOfDraws);

    void setTotalEarnings(int earning);

    Integer[] betMoney_Values();

    Integer[] rollPlays_Values();
    
    int declareWinnerSide();

    void runADraw();

    void showDrawNumbers();

    int calculateEarnings(int number);
    
    boolean checkIfWins(int winnerSide , int userChoice);

    void printBetMoneyValues();

    void printRollPlaysValues();
    
    void printKinoNumbers();
    
    void setSide(int side);
    
    int getSide();
    

}
