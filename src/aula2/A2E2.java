package Exercicios;
import java.util.Scanner;

public class A2E2 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite o nome completo:");

        String name = keyboard.nextLine();

        System.out.println("!"+ name.replace(" "," !"));
        }
    }


//Faça um programa que pegue o nome completo que o usuário digitar e
// imprima o nome com cada parte separada por espaço,
// um símbolo de exclamação no início.

// Exemplo:
// Nome: João Mario da Silva
//Resultado: !João !Maria !da !Silva