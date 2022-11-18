package Exercicios;
import java.util.Scanner;

public class A2E3Extra {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Selecione o mês:");
        System.out.println("[1] - JANEIRO");
        System.out.println("[2] - FEVEREIRO");
        System.out.println("[3] - MARÇO");

        int mesAlvo = teclado.nextInt();

        if (mesAlvo == 1){
            System.out.printf("Total dos gastos de janeiro: %.2f",TrimestreA2E3Extra.JANEIRO_DESPESAS.getValor());
        } else if (mesAlvo == 2) {
            System.out.printf("Total dos gastos de fevereiro: %.2f",TrimestreA2E3Extra.FEVEREIRO_DESPESAS.getValor());
        } else {
            System.out.printf("Total dos gastos de março: %.2f",TrimestreA2E3Extra.MARCO_DESPESAS.getValor());
        }
//Imprimir Enum
//        for (TrimestreA2E3Extra value : TrimestreA2E3Extra.values()) {
//            System.out.println(value);

////Imprimir posição
//            System.out.println(value.ordinal());
//        }
    }
}




//Faça um programa, que solicite ao usuário que informe o mês e o
// sistema deve imprimir o valor gasto do mês.

//Utilizar enum
//Criar um valor para cada mês