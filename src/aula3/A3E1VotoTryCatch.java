package exerciciosentrega;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A3E1VotoTryCatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade:");

        int idade = 0; //pq tem que inicializar?

        do {
            try {
                idade = sc.nextInt();
            } catch (InputMismatchException error) {
                sc.nextLine(); // consome a entrada errada
                System.out.println("Entrada inválida. Digite sua idade:");
            }
        } while (idade == 0); //dá erro com entrada 0

        verificaStatusVoto(idade);
        sc.close();
    }

    //método para verificar idade
    public static void verificaStatusVoto (int idade) {
        if (idade >= 18 && idade <= 70) {
            System.out.println("Voto obrigatório");
        } else if (idade >= 16 && idade < 18 || idade > 70) {
            System.out.println("Voto  facultativo");
        } else {
            System.out.println("Sem direito a votar");
        }
    }
}
