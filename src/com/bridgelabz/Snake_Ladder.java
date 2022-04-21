package com.bridgelabz;

import java.util.Random;

public class Snake_Ladder {


    public static void main(String[] args) {
        Random random = new Random();
        int dieNum = random.nextInt(6) + 1;
        int options = random.nextInt(4);
        int position = 0;
        final int LADDER = 1;
        final int NOPLAY = 2;
        final int SNAKE = 3;
        switch (options) {
            case LADDER:
                position += dieNum;
                System.out.println("the player got ladder:" + position);
                break;
            case NOPLAY:
                System.out.println("the player remains in same position:" + position);
                break;
            case SNAKE:
                position -= dieNum;
                System.out.println("the snake bit the player:" + position);
                break;
        }
        System.out.println("position is :" + position);

    }

}


