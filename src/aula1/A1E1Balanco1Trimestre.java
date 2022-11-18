package Exercicios;

public class A1E1Balanco1Trimestre {
    public static void main(String[] args) {


        int gastosJan = 10000;
        int gastosFev = 17000;
        int gastosMar = 23000;

        int gastosPrimeiroTrimestre = gastosJan + gastosFev + gastosMar;

        System.out.printf("XPTO S.A %n   Balanço do primeiro trimeste %n   Total de gastos = R$%d", gastosPrimeiroTrimestre);

    }
}

//    A empresa "XPTO S.A", precisa fazer o fechamento do balanço do primeiro trimestre. Os dados passados pela empresa são:
//
//        Janeiro: R$ 10000
//        Fevereiro: R$ 17000
//        Marco: R$ 23000.
//        Faça um programa que calcule e imprima o gasto total do trimestre.
