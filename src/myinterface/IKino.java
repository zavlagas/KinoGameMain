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

   public void setMoneyBet(int moneyBet);

    public void setNumberOfDraws(int numberOfDraws);

    public void setTotalEarnings(int moneyBet , int numberOfDraws);

    Integer[] betMoney_Values();

    Integer[] rollPlays_Values();

    void runADraw();

    void showDrawNumbers();

    void calculateEarnings();

    void printBetMoneyValues();

    void printRollPlaysValues();
    
    void printKinoNumbers();

}
