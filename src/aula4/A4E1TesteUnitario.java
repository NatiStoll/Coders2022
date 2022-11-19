package aula4;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Arrays;

public class A4E1TesteUnitario {

    public static void main(String[] args) {
        testeUnitarioVoto();
    }

    //metodo String
    static String statusVoto(int idade) {
        if (idade >= 18 && idade <= 70) {
            return "Voto obrigatório";
        } else if (idade >= 16 && idade < 18 || idade > 70) {
            return "Voto facultativo";
        } else {
            return "Sem direito a votar";
        }
    }
    static void testeUnitarioVoto() {
        //array com idades para testar
//        int [] idadesTestar = {18,70,16,16,71,17,15,-15,16}; //com 2 falhas
        int [] idadesTestar = {6,70,16,16,44,17,65,-15,44}; //com 5 falhas
//        int[] idadesTestar = {18, 70, 34, 16, 71, 100, 15, -15, 4}; //todos sucesso

        //array com resultados esperados
        String[] saidasEsperadas = {"Voto obrigatório", "Voto obrigatório", "Voto obrigatório",
                "Voto facultativo", "Voto facultativo", "Voto facultativo", "Sem direito a votar",
                "Sem direito a votar", "Sem direito a votar"
        };

        int totalFalhas = 0;

        //armazenar os testes errados no array
        String[] arrayErrados = new String[idadesTestar.length];





// percorrer arrays
            for (int i = 0; i < idadesTestar.length; i++) {

                if (statusVoto(idadesTestar[i]) == saidasEsperadas[i]) {
                    System.out.println("Teste número " + (i + 1) + " = Sucesso");

                } else {
                    System.out.println("Teste número " + (i + 1) + " = Falhou");
                    totalFalhas++;
                    arrayErrados[i] = statusVoto(idadesTestar[i]);
                }
            }



        if(totalFalhas == 0){
            System.out.println("__________________________________");
            System.out.println("Testes executados com sucesso");
        } else {

            System.out.println("\n--------------------------------------------------------------");
            System.out.println("----------------Os seguintes testes falharam: ----------------");
            System.out.println("--------------------------------------------------------------");
            System.out.println("Total de falhas: " + totalFalhas + "\n");

//            System.out.println(Arrays.toString(arrayErrados));


        }

        for (int i = 0; i < arrayErrados.length; i++) {
            if (arrayErrados[i] != null) {
                System.out.println("Teste " + i + " - Resultado: " + statusVoto(idadesTestar[i]) + " - Correto: " + saidasEsperadas[i]);
            }
        }
    }
}

//System.out.println("Teste" + i + " - Resultado: " + statusVoto(idadesTestar[i]) + " - Correto:" + saidasEsperadas[i]);