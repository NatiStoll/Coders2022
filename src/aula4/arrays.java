package aula4;

import java.util.Arrays;

public class arrays {

    public static void main(String[] args) {


        int[] numeros = new int[3];
        numeros[0] = 1;
        numeros[1] = 8;
        numeros[2] = 10;

        Arrays.sort(numeros); //modifica o array
//        for (int numero : numeros){
//            System.out.println(numero);
//        }

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.binarySearch(numeros,10)); //imprime indice - só funciona com números ordenados

    }
}