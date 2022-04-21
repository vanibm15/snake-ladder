package com.bridgelabz;

import java.util.Random;

public class Snake_Ladder {


    public static void main(String[] args) {
        Random random = new Random();
        int position = 0;
        final int LADDER = 1;
        final int NOPLAY = 2;
        final int SNAKE = 3;
        while (position < 100) {
            int dieNum = random.nextInt(6) + 1;
            int options = random.nextInt(4);


            {

                 switch (options) {
                    case LADDER:
                        if (position + dieNum > 100)
                            break;
                        position += dieNum;
                        break;
                    case NOPLAY:
                        break;
                    case SNAKE:
                        position -= dieNum;
                        position = Math.max(position, 0);
                        break;

                }
            }
            System.out.println("position is :" + position);
        }
    }
}




