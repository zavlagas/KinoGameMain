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

    int moneyBet = 0;
    int numberOfDraws = 0;
    int totalEarnings = 0;
   
    
    void betMoney_Values();
    
    int rollPlays_Values();

    void runADraw();

    void showDrawNumbers();

    void calculateEarnings();
}
