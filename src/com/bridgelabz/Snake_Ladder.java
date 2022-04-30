package com.bridgelabz;

import java.util.Random;

public class Snake_Ladder {
    public static final int START_POSITION = 0;
    public static final int END_POSITION = 100;
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    static String POSITION;
    static int diceNumber;
    static int checkOption;
    static Random random = new Random();
    int currentPosition = 0;

    public static int dieRoll() {
        int diceValue = random.nextInt(6) + 1;
        System.out.println("Dice value : " + diceValue);
        return diceValue;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");
        playWithTwoPlayers();
    }

    public static void playWithTwoPlayers() {
        Snake_Ladder plyr1 = new Snake_Ladder();
        Snake_Ladder plyr2 = new Snake_Ladder();
        int player1 = plyr1.currentPosition;
        int player2 = plyr2.currentPosition;
        int diceCount = 0;
        System.out.println("--------Game started with two players---------");
        while (player1 < END_POSITION && player2 < END_POSITION) {
            System.out.println("# Player1's turn :-");
            diceNumber = dieRoll();
            diceCount++;
            if (plyr1.playerChecksOption() == END_POSITION) {
                System.out.println();
                System.out.println("-----------Player-1 Won The Game -----------");
                break;
            } else if (checkOption == LADDER) {
                diceNumber = dieRoll();
                diceCount++;
                plyr1.playerChecksOption();
            }
            System.out.println();
            System.out.println("# Player2's turn :-");
            diceNumber = dieRoll();
            diceCount++;
            if (plyr2.playerChecksOption() == END_POSITION) {
                System.out.println();
                System.out.println("-----------Player-2 Won The Game ------------");
                break;
            } else if (checkOption == LADDER) {
                diceNumber = dieRoll();
                diceCount++;
                plyr2.playerChecksOption();
            }
            System.out.println();
        }
        System.out.println("Number of times Dice was played to win the game : " + diceCount);
    }

    public int playerChecksOption() {
        checkOption = random.nextInt(3);
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
        System.out.println("Player's Position :" + POSITION + ",  #Current Position :" + currentPosition);
        return currentPosition;
    }
}


    }




