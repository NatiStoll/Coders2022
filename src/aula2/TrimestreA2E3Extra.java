package Exercicios;

public enum TrimestreA2E3Extra {

    JANEIRO_DESPESAS (10000F),
    FEVEREIRO_DESPESAS (17000F),
    MARCO_DESPESAS (23000F);

//    campo
    private float valor;

//    construtor
    TrimestreA2E3Extra(Float valor){
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }
}
