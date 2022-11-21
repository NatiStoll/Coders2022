package nope;

import aula3.a3e3maquinavendas.BebidasSw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class teste {

    public static void main(String[] args) {


        Scanner sc = new Scanner (System.in);
        System.out.println("\n<<<<<<MÁQUINA DE VENDA DE BEBIDAS>>>>>>\n");

        System.out.println("Opções de bebidas: ");
        System.out.printf("%d - %s valor - R$ %.2f %n" , BebidasSw.COCA_COLA.getIndice(), BebidasSw.COCA_COLA.getNome(), BebidasSw.COCA_COLA.getValor());
        System.out.printf("%d - %s valor - R$ %.2f %n" , BebidasSw.COCA_COLA_ZERO.getIndice(), BebidasSw.COCA_COLA_ZERO.getNome(), BebidasSw.COCA_COLA_ZERO.getValor());
        System.out.printf("%d - %s valor - R$ %.2f %n", BebidasSw.PEPSI.getIndice(), BebidasSw.PEPSI.getNome(), BebidasSw.PEPSI.getValor());
        System.out.printf("%d - %s valor - R$ %.2f %n", BebidasSw.GUARANA.getIndice(), BebidasSw.GUARANA.getNome(), BebidasSw.GUARANA.getValor());
        System.out.printf("%d - %s valor - R$ %.2f %n", BebidasSw.FANTA.getIndice(), BebidasSw.FANTA.getNome(), BebidasSw.FANTA.getValor());
        System.out.printf("%d - %s valor - R$ %.2f %n", BebidasSw.AGUA.getIndice(), BebidasSw.AGUA.getNome(), BebidasSw.AGUA.getValor());


        System.out.println("\nSelecione o número da opção desejada: ");

        int opcaoSelecionada = 0;

        do {
            try {
                opcaoSelecionada = sc.nextInt();
            } catch (InputMismatchException error) {
                sc.nextLine();
                System.out.println("Opção invalida. Digite novamente:");
            }
        }
        while (verificaIndice(opcaoSelecionada) == true);


        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< PEDIDO >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        switch (opcaoSelecionada){
            case 1 -> System.out.printf("%n Bebida selecionada: %s %n Valor - R$ %.2f %n" , BebidasSw.COCA_COLA.getNome(), BebidasSw.COCA_COLA.getValor());
            case 2 -> System.out.printf("%n Bebida selecionada: %s %n Valor - R$ %.2f %n" ,BebidasSw.COCA_COLA_ZERO.getNome(), BebidasSw.COCA_COLA_ZERO.getValor());
            case 3 -> System.out.printf("%n Bebida selecionada: %s %n Valor - R$ %.2f %n" , BebidasSw.PEPSI.getNome(), BebidasSw.PEPSI.getValor());
            case 4 -> System.out.printf("%n Bebida selecionada: %s %n Valor - R$ %.2f %n" , BebidasSw.GUARANA.getNome(), BebidasSw.GUARANA.getValor());
            case 5 -> System.out.printf("%n Bebida selecionada: %s %n Valor - R$ %.2f %n" , BebidasSw.FANTA.getNome(), BebidasSw.FANTA.getValor());
            case 6 -> System.out.printf("%n Bebida selecionada: %s %n Valor - R$ %.2f %n" , BebidasSw.AGUA.getNome(), BebidasSw.AGUA.getValor());
        }

        System.out.println("____________________________________________________________________");
        sc.close();

    }

    private static boolean verificaOperador (char operador){
        return ("+-*/".contains(String.valueOf(operador)));
    }

    private static boolean verificaIndice (int indice){
        return ("[0-6]*".contains(String.valueOf(indice)));
    }


}


