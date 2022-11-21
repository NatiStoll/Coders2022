package aula5;

import java.util.ArrayList;
import java.util.List;

public class Produtos {

    //atributos
    private String produto;
    private int quantidade;
    private double preco;

    private List<Produtos> produtos = new ArrayList<Produtos>();

    //construtor

    public Produtos(String produto, int quantidade, double preco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }
//gets

//
//    public List<Produtos> getProdutos() {
//        return produtos;
//    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString (){
        return "\nProduto: " + this.produto +
                " - Quantidade: " + this.quantidade +
                " - Preço: " + this.preco;
    }

//    public void adiciona(Produtos produtos){
//        this.produtos.add(produtos);
//    }
}
