package net.rexbrx.octurus.data;

import java.util.Random;

public class fps {
    public static void main(String[] args) {

        int max_fps = 60;
        Random fpsa = new Random();

        for (int ni = 1; ni <= 32; ni++) {

            System.out.println("Pool " + ni + " " + fpsa.nextInt(max_fps) + " " + System.nanoTime());
            //System.out.println("Pool " + ni + " ");

        }

    }
}
