package Exercicios;

import java.util.Scanner;

public class A1E2NumeroDaSorte {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a idade:");

        int idade = teclado.nextInt();

        float decimal = 0.023F;

        float numeroSorte = (float)idade + decimal;

        System.out.println("O número da sorte é:" + numeroSorte);

    }
}

//        System.out.printf("O número da sorte é: %f",numeroSorte);