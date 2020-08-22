/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.Arrays;
import java.util.Map;
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
        betSide(userInput);

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

        } else {
            System.out.println("Value Not Found ,Check The Roll List and Try Again ");
            setRolls(userInput, x);

        }
        return (answer);

    }

    public static int betSide(Scanner userInput) {

        System.out.printf("Choose  ODD  [%d]\n        EVEN [%d]\n        DRAW [%d]\n ", 1, 2, 3);
        System.out.print("Bet Which Side Wins : ");
        int answer = userInput.nextInt();
        int side = 0;

        switch (answer) {
            case 1:
                System.out.println("You Bet To ODD");
                side = -1;
            case 2:
                System.out.println("You Bet To EVEN");
                side = 1;
            case 3:
                System.out.println("You Bet To DRAW");
                side = 0;
        }

        return (side);
    }

    public static void showNumbers(NumbersBoard x) {

        x.showDrawNumbers();
    }

    public static void runTheKino(NumbersBoard x , int times) {
        
        for (int i = 0; i < times; i++) {
            x.runADraw();
            System.out.println("");
            System.out.println("The Winners Numbers Are");
            x.showDrawNumbers();
            System.out.println("D");
        }

    }

}
