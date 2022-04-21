package com.bridgelabz;

import java.util.Random;

public class Snake_Ladder {
    private static int getDieRoll() {
        Random random = new Random();
        int roll = random.nextInt(6) + 1;
        System.out.println(roll);
        return roll;
    }
    public static void main(String[] args) {
        int dieNumber = getDieRoll();
    }
}
