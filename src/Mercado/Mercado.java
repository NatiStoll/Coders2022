package Mercado;

public class Mercado {
    public static void main(String[] args) {
        CarrinhoDeCopras compras = new CarrinhoDeCopras();
        double total = compras.adiciona();
        System.out.println(total);

        //poderia ser:
//        CarrinhoDeCopras compras = new CarrinhoDeCopras();
//        double total = compras.adiciona();
//        System.out.println(compras.getTotal());
    }
}
