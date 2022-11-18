package aula4.vendasmetodo;

public enum BebidasSw {
//
    //         1 - Coca-Cola - R$ 5
//2 - Coca-Cola 0 - R$ 4.50
//3 - Pepsi - R$ 4,40
//4 - Guaraná Antarctica - R$ 3,50
//5 - Fanta Laranja - R$ 4,23
//Água - R$ 2,50

    DEFAULT (0, "DEFAULT",1),
    COCA_COLA (1,"Coca-Cola", 5.00),
    COCA_COLA_ZERO (2,"Coca-Cola 0", 4.50),
    PEPSI(3,"Pepsi", 4.40),
    GUARANA(4,"Guaraná Antarctica", 3.50),
    FANTA (5,"Fanta Laranja", 4.23),
    AGUA(6,"Água", 2.50);


    //campo
    private String nome;
    private double valor;
    private int indice;

    //construtor
    BebidasSw(int indice, String nome, double valor){
        this.nome = nome;
        this.valor = valor;
        this.indice = indice;
    }


    //método?
    public double getValor(){
        return valor;
    }

    public String getNome (){
        return nome;
    }

    public int getIndice(){
        return indice;
    }



}
