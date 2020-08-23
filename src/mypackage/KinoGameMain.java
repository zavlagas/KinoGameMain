/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.Arrays;

import java.util.Scanner;

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
        Scanner userInput = new Scanner(System.in);
        NumbersBoard x = new NumbersBoard(80, 20);

        printTables(x);
        betMoney(userInput, x);
        setRolls(userInput, x);
        betSide(userInput, x);
        runTheKino(x);

    }

    public static void printTables(NumbersBoard x) {

        System.out.println("-----------------    KINO    -------------------");
        System.out.println("");
        x.printKinoNumbers();
        System.out.println("\n");
        System.out.println("-----------------    MONEY    -------------------");
        System.out.println("");
        x.printBetMoneyValues();
        System.out.println("\n");
        System.out.println("----------------     ROLLS    ------------------");
        System.out.println("");
        x.printRollPlaysValues();
        System.out.println("\n");

    }

    public static int betMoney(Scanner userInput, NumbersBoard x) {

        System.out.print("Enter The Amount Of Money Here: ");
        int answer = userInput.nextInt();
        Integer[] moneyValues = x.betMoney_Values();

        if (Arrays.asList(moneyValues).contains(answer)) {

            System.out.println("You Entered " + answer + " \u20ac");
            x.setMoneyBet(answer);

        } else {
            System.out.println("Value Not Found ,Check The Money List and Try Again ");
            betMoney(userInput, x);

        }
        return (answer);
    }

    public static int setRolls(Scanner userInput, NumbersBoard x) {

        System.out.print("Enter The Amount Of Rolls Here: ");
        int answer = userInput.nextInt();
        Integer[] rollValues = x.rollPlays_Values();

        if (Arrays.asList(rollValues).contains(answer)) {

            System.out.println("You Entered " + answer + " Roles");
            x.setNumberOfDraws(answer);

        } else {
            System.out.println("Value Not Found ,Check The Roll List and Try Again ");
            setRolls(userInput, x);

        }
        return (answer);

    }

    public static void betSide(Scanner userInput, NumbersBoard x) {

        System.out.printf("Choose  ODD  [%d]\n        EVEN [%d]\n        DRAW [%d]\n", 1, 2, 3);
        System.out.println("");
        System.out.print("Bet Which Side Wins : ");
        int answer = userInput.nextInt();
        int side = 0;

        switch (answer) {
            case 1:
                System.out.println("You Bet To ODD");
                side = -1;
                break;
            case 2:
                System.out.println("You Bet To EVEN");
                side = 1;
                break;
            case 3:
                System.out.println("You Bet To DRAW");
                side = 0;
                break;
            default:
                System.out.println("Invalid Input , Choose Your Side With The Declared Numbers ");
                betSide(userInput, x);
        }

        x.setSide(side);

    }

    public static void showNumbers(NumbersBoard x) {

        x.showDrawNumbers();
    }

    public static void runTheKino(NumbersBoard x) {
        int earnings = 0;
        int times = x.getNumberOfDraws();
        int side = x.getSide();
        for (int i = 0; i < times; i++) {
            x.runADraw();
            System.out.print("Roll " + (i + 1) + " : ");
            x.showDrawNumbers();
            int win = x.declareWinnerSide();
            String answer = switchForPrintSide(win);
            System.out.println(answer);
            boolean winOrLose = x.checkIfWins(win, side);
            earnings = winOrLoseIfElse(winOrLose, x);
            x.setTotalEarnings(earnings);

        }

        int total_Earnings = x.getTotalEarnings();
        System.out.println("Your Total Earnings Are " + total_Earnings);

    }

    public static int winOrLoseIfElse(boolean answer, NumbersBoard x) {
        int earnings = 0;
        if (answer == true) {

            x.setEarnings();
            earnings = x.getEarnings();
            System.out.println("You Win " + earnings);
        } else {

            System.out.println("You Loose");

        }
        return (earnings);
    }

    public static String switchForPrintSide(int number) {
        String answer = null;
        switch (number) {

            case (1):
                answer = ("Even Wins");
                break;
            case (-1):
                answer = ("Odd Wins");
                break;
            case (0):
                answer = ("Draw Wins");
                break;

        }
        return (answer);
    }

}
