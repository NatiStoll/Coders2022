package aula5;

import java.util.ArrayList;

public class TesteProdutos {

        public static void main(String[] args) {

            Produtos p1 = new Produtos("Caneta", 2, 7.5);
            Produtos p2 = new Produtos("Borracha", 1, 1.0);
            Produtos p3 = new Produtos("Apontador", 3, 2.5);

            ArrayList<Produtos> produtos = new ArrayList<>();

            produtos.add (p1);
            produtos.add (p2);
            produtos.add (p3);

//        System.out.println(produtos); //imprime na mesma linha

            System.out.println("-------------- Seu Carrinho de Compras --------------");

            for (int i = 0; i < produtos.size(); i++){
                System.out.println(produtos.get(i));
            }
        }
    }






