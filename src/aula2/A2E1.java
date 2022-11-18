package Exercicios;

public class A2E1 {

        public static void main(String[] args) {

            String sentence = "Janeiro: 1543, Fevereiro: 1222, Março: 1234";
            String[] splitSentence = sentence.split(", ");

//Separar meses
            String jan = splitSentence[0];
            String fev = splitSentence[1];
            String mar = splitSentence[2];

//Separar mês do valor
            String[] splitJan = jan.split(": ");
            String[] splitFev = fev.split(": ");
            String[] splitMar = mar.split(": ");

//Converter String para Integer e somar
            float sum = Integer.parseInt(splitJan[1])+Integer.parseInt(splitFev[1])+Integer.parseInt(splitMar[1]);

//Imprimir

            System.out.println(jan);
            System.out.println(fev);
            System.out.println(mar);
            System.out.printf("Total: %.2f %n",sum);

        }
    }

//Faça um programa que receba uma frase com
// "Janeiro: 1543, Fevereiro: 1222, Março: 1234".
// Imprima sequencialmente em linhas separadas por cada mês
// e na última linha a frase:
// "Total: " e o valor da soma de todos os meses. Exemplo:
//
//Janeiro: 1543
//
//Fevereiro: 1222
//
//Março: 1234
//
//Total: 3999