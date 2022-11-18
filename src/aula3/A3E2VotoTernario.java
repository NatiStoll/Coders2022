package aula3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A3E2VotoTernario {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua idade:");

        int idade = 0;

        do {
            try {
                idade = teclado.nextInt();
            } catch (InputMismatchException error) {
                teclado.nextLine();
                System.out.println("Entrada invalida. Por vafor, digite sua idade.");
            }
        } while (idade == 0);

            String voto = idade <16 ? "Não pode votar" :
                    idade >=18 && idade <=70 ? "Voto obrigatório" : "Voto facultativo";
            System.out.println(voto);

        teclado.close();
    }
}

