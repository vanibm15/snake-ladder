package com.bridgelabz;

import java.util.Random;

public class Snake_Ladder {
    public static final int START_POSITION = 0;
    public static final int END_POSITION = 100;
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    static String POSITION;
    static Random random = new Random();

    public static int dieRoll() {
        int diceValue = random.nextInt(6) + 1;
        System.out.println("Dice value : " + diceValue);
        return diceValue;
    }

    public static int playerChecksOption() {
        int diceCount = 0;
        int currentPosition = START_POSITION;
        while (currentPosition < END_POSITION) {
            int diceNumber = dieRoll();
            diceCount++;
            int checkOption = random.nextInt(3);
            switch (checkOption) {
                case NO_PLAY:
                    POSITION = "Not played";
                    currentPosition = currentPosition;
                    break;
                case LADDER:
                    POSITION = "Player is on Ladder";
                    if (currentPosition + diceNumber > END_POSITION) {
                        currentPosition = currentPosition;
                    } else {
                        currentPosition += diceNumber;
                    }
                    break;
                case SNAKE:
                    POSITION = "Player is on Snake";
                    if (currentPosition - diceNumber <= START_POSITION) {
                        currentPosition = START_POSITION;
                    } else {
                        currentPosition -= diceNumber;
                    }
                    break;
            }
            System.out.println("Dice Count : " + diceCount);
            System.out.println("#Player's Position :" + POSITION + ",  #Current Position :" + currentPosition);
        }
        return currentPosition;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");
        playerChecksOption();
    }
}





