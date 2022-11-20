package Mercado;
//Criar classe Produto com String nome e double valor
//como atributos privados
//que devem ser acessados com métodos getters e setters
public class Produto {
    private String nome;
    private double valor;

    //cmd+n criar construtor
    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    //cmd+n para criar getters e setters

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
