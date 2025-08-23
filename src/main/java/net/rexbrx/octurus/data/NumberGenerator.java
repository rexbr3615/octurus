package net.rexbrx.octurus.data;

import java.util.Random;

public class NumberGenerator {
    public static void main(String[] args) {

        int max_number = 1024;
        int max_number_a = 2048;
        Random rand = new Random();

        System.out.println(rand.nextInt(max_number));
        System.out.println(rand.nextInt(max_number_a));

    }
}
