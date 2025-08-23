package net.rexbrx.octurus.data;

import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[5]; // array para guardar os 5 números
        double soma = 0;

        // Ler os 5 números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i]; // acumula a soma
        }

        double media = soma / 5;

        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
