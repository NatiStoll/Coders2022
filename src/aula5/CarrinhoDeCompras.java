package aula5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarrinhoDeCompras {

    public static void main(String[] args) {

        //cria uma lista para colocar os itens digitados:
        List<Produtos> carrinhoDeCompras = new ArrayList<>();

        //Pegar itens:
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos produtos deseja comprar: ");
        int quantidadeProdutos = sc.nextInt();

        int quantidade;
        int qde;
        double valor;
        double valorIten;
        double total = 0;

        for (int i = 0; i < quantidadeProdutos; i++){
            System.out.printf("Digite o %dº produto: %n", (i+1));
            String prod = sc.next();

            System.out.printf("Digite a quantidade: %n");
            qde = sc.nextInt();

            System.out.printf("Digite o valor: %n");
            valor = sc.nextDouble();

            carrinhoDeCompras.add(new Produtos(prod,qde,valor));
            valorIten = qde*valor;
            total += valorIten;
            System.out.println(valorIten);
        }

        System.out.println("------------------- Carrinho de Compras -------------------");
        System.out.println(carrinhoDeCompras);

        System.out.println("------------------------------------------------------------");
        System.out.println("Total a pagar: R$" + total);







    }
}
