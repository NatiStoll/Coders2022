package Mercado;

//criar classe CarrinhoDeCompras com método adiciona() com
// atributos double total e Produto[]produto

public class CarrinhoDeCopras {
    private double total;
    private Produto[] produtos = new Produto[5]; //array

    public double adiciona(){
        produtos[0] = new Produto("Maca", 10.00);
        produtos[1] = new Produto("Banan", 15.00);
        produtos[2] = new Produto("Pera", 2.00);
        produtos[3] = new Produto("Bolacha", 5.00);
        produtos[4] = new Produto("Bife", 30.00); //reclama pq precisa de construtor

        for(int count = 0; count < produtos.length; count++){
            this.total += produtos [count].getValor();
        }
        return this.total;
    }
    public double getTotal(){
        return total;
    }
}



