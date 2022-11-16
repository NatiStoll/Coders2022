package exerciciosentrega;

import java.util.Scanner;

public class NopeA3E2VotoIfTernario {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua idade:");

        int idade = teclado.nextInt();

        if (idade < 16){
            System.out.println("Não pode votar");
        } else {
            String votoStatus = (idade >= 18 && idade <= 70 ? "Voto obrigatório" : "Voto opcional");
            System.out.println(votoStatus);
        }

        teclado.close();
    }
}
