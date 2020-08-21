/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import myinterface.IKino;

/**
 *
 * @author User
 */
public class NumbersBoard implements IKino {

    private int amountOfNumbers;
    private Integer[] kinoNumbers;
    private int amouRandNumb;
    private Integer[] randomStoreNumbs;

    public NumbersBoard() {
    }

    public NumbersBoard(int amountOfNumbers, int amouRandNumb) {
        this.amountOfNumbers = amountOfNumbers;
        this.amouRandNumb = amouRandNumb;
//        setTheArrayOfKinoNumbers();
//        setTheArrayOfRandomStoreNumbs();
    }

    ///////////////////////////Getters/////////////////////////
    public int getAmountOfNumbers() {

        return (this.amountOfNumbers);
    }

    public int getAmouRandNumb() {
        return (this.amouRandNumb);
    }

    public Integer[] getTheArrayOfKinoNumbers() {

        return (this.kinoNumbers);
    }

    public Integer[] getTheArrayOfRandomStoreNumbs() {

        return (randomStoreNumbs);
    }

    /////////////////////////////////Setters////////////////////////////////////
    public void setAmountOfNumbers(int amountOfNumbers) {
        this.amountOfNumbers = amountOfNumbers;
    }

    public void setAmouRandNumb(int amouRandNumb) {
        this.amouRandNumb = amouRandNumb;
    }

    public void setTheArrayOfKinoNumbers() {

        int amountOfLocalNumbers = getAmountOfNumbers();
        Integer[] kinoNumbers = new Integer[amountOfLocalNumbers];
        loopToAddNumbersToArray(kinoNumbers, amountOfNumbers);
        this.kinoNumbers = kinoNumbers;

    }

    public void setTheArrayOfRandomStoreNumbs() {

        int amountOfRandomNumbs = getAmouRandNumb();
        Integer[] randomStoreNumbs = new Integer[amountOfRandomNumbs];
        this.randomStoreNumbs = randomStoreNumbs;

    }

    public void setTheBetMoney(Integer amount) {
        Integer[] betMoney_Values = betMoney_Values();
        List tempList = Arrays.asList(betMoney_Values);
        Iterator tempIterator = tempList.listIterator();
        while (tempIterator.hasNext()) {
            Integer tempNumber = (Integer) tempIterator.next();

            if (tempNumber == amount) {

                amount = tempNumber;

            } else {

                amount = null;

            }

        }

        moneyBet(amount);
    }

    public void setTheRollPlays(Integer amount) {
        Integer[] rollPlays = rollPlays_Values();
        List tempList = Arrays.asList(rollPlays);
        Iterator tempIterator = tempList.listIterator();
        while (tempIterator.hasNext()) {
            Integer tempNumber = (Integer) tempIterator.next();

            if (tempNumber == amount) {

                amount = tempNumber;

            } else {

                amount = null;

            }

        }
        numberOfDraws(amount);
    }

    //////////For Loop To Position The Numbers To The Array////////
    public void loopToAddNumbersToArray(Integer[] kinoNumbers, int numbers) {

        for (int i = 0; i < numbers; i++) {
            int number = (i + 1);
            kinoNumbers[i] = number;
        }

    }

    public void loopToAddRandomNumbsToArray() {

        int randomNumber;
        List<Integer> randomList = Arrays.asList(this.randomStoreNumbs);

        for (int i = 0; i < amouRandNumb; i++) {
            boolean active = true;

            randomNumber = randomNumbers();
            while (active == true) {

                if (randomList.contains(randomNumber)) {
                    randomNumber = randomNumbers();
                    active = true;

                } else if (!(randomList.contains(randomNumber))) {
                    randomStoreNumbs[i] = randomNumber;
                    active = false;

                }
            }
        }

    }

    ///////////////////////MATH/////////////////////////////////////////////////////////
    //////////Use Math.Random To Select Numbers In KinoNumbers//////////
    public int randomNumbers() {

        Random randomInt = new Random();

        int min = 1;
        int max = 80;

        int randomNumber = randomInt.nextInt(max - min) + min;

        return (randomNumber);
    }

    public int calculateIfEvenWins() {
        Integer[] randomStoreNumbs = getTheArrayOfRandomStoreNumbs();
        int even = 0;
        int odd = 0;
        int wins = 0;

        for (Integer randomStoreNumb : randomStoreNumbs) {

            if ((randomStoreNumb % 2) != 0) {
                odd++;
            } else {
                even++;

            }

        }
        if (even > odd) {

            wins = 1;

        } else if (odd > even) {

            wins = -1;

        } else {

            wins = 0;

        }
        return (wins);

    }

    ////////////METHODS INHERITED BY INTERFACE IKINO/////////////////////////////////
    @Override
    public void runADraw() {
        loopToAddRandomNumbsToArray();
    }

    @Override
    public void showDrawNumbers() {

        System.out.println("THE DRAW NUMBERS ARE ");
        for (Integer drawNumber : this.randomStoreNumbs) {

            System.out.format("%d ,", drawNumber);
        }
    }

    @Override
    public void calculateEarnings() {
        int totalEarning = totalEarnings(amouRandNumb, amouRandNumb)
    }

    @Override
    public Integer[] betMoney_Values() {
        Integer[] bet_Values = new Integer[10];
        bet_Values[0] = 1;
        bet_Values[1] = 2;
        bet_Values[2] = 3;
        bet_Values[3] = 5;
        bet_Values[4] = 10;
        bet_Values[5] = 15;
        bet_Values[6] = 20;
        bet_Values[7] = 30;
        bet_Values[8] = 50;
        bet_Values[9] = 100;

        return (bet_Values);

    }

    @Override
    public Integer[] rollPlays_Values() {
        Integer[] roll_Values = new Integer[10];
        roll_Values[0] = 2;
        roll_Values[1] = 3;
        roll_Values[2] = 4;
        roll_Values[3] = 5;
        roll_Values[4] = 6;
        roll_Values[5] = 10;
        roll_Values[6] = 20;
        roll_Values[7] = 50;
        roll_Values[8] = 100;
        roll_Values[9] = 200;

        return (roll_Values);
    }

    @Override
    public void printBetMoneyValues() {

        Integer[] tempArray = betMoney_Values();

        for (Integer integer : tempArray) {

            System.out.println(integer + " ,");

        }

    }

    @Override
    public void printRollPlaysValues() {

        Integer[] tempArray = rollPlays_Values();

        for (Integer integer : tempArray) {

            System.out.println(integer + " ,");

        }

    }

    @Override
    public int moneyBet(int moneyBet) {

        return (moneyBet);
    }

    @Override
    public int numberOfDraws(int numberOfDraws) {
        return (numberOfDraws);
    }

    @Override
    public int totalEarnings(int moneyBet, int numberOfDraws) {
        
        int totalEarnings = (moneyBet * numberOfDraws);

        return (totalEarnings);

    }

}
