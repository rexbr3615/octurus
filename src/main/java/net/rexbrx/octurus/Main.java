package net.rexbrx.octurus;

import net.rexbrx.octurus.data.NumberGenerator;
import net.rexbrx.octurus.data.Usuario;
import net.rexbrx.octurus.data.contagem;
import net.rexbrx.octurus.data.fps;
import net.rexbrx.octurus.objetos.Heranca;
import net.rexbrx.octurus.objetos.Texugo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        int x = 12;
        int y = 8;
        int soma = x + y;
        int subtracao = x - y;
        int divisao = x / y;
        int multiplicacao = x * y;
        System.out.println("Valores: " + x + " e " + y);
        System.out.println("Soma:" + soma);
        System.out.println("Subtração:" + subtracao);
        System.out.println("divisão:" + divisao);
        System.out.println("multiplicação:" + multiplicacao);

        Usuario.main(args);

        Scanner EntradaDeDados = new Scanner(System.in);
        System.out.println("valor 1: ");
        int Dados_0001 = EntradaDeDados.nextInt();
        System.out.println("valor 2: ");
        int Dados_0002 = EntradaDeDados.nextInt();

        int Dados_100001 = Dados_0001 + Dados_0002;

        System.out.println("A soma é: " + Dados_100001);

        EntradaDeDados.close();

        if (Dados_100001 % 2 == 0) {
            System.out.println("O número " + Dados_100001 + " é PAR.");
        } else {
            System.out.println("O número " + Dados_100001 + " é ÍMPAR.");
        }


        contagem.main(args);
        NumberGenerator.main(args);
        fps.main(args);

        Heranca.main(args);

    }
}