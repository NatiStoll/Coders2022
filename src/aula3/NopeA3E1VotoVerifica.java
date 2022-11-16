//package aula3;
//
//import java.util.Scanner;
//
//public class NopeA3E1VotoVerifica {
//    public static void main(String[] args) {
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite sua idade:");
//
//        int idade = 0;
//
//
//        while (!verificaNumero()){
//            System.out.println("Entrada inválida. Digite sua idade novamente ou (X) para sair.");
//            idade = sc.nextInt();
//            String idadeS = Integer.parseInt(idade);
//
//            if (idadeS == 'X' || idadeS =='x'){
//                System.out.println("Fechando a aplicação.");
//            }
//        }
//        verificaStatusVoto(idade);
//        sc.close();
//    }
//
//    //método para verificar idade
//    public static int verificaStatusVoto (int idade) {
//        if (idade >= 18 && idade <= 70) {
//            System.out.println("Voto obrigatório");
//        } else if (idade >= 16 && idade < 18 || idade > 70) {
//            System.out.println("Voto  facultativo");
//        } else {
//            System.out.println("Sem direito a votar");
//        }
//        return idade;
//    }
//    // como posso verificar se é uma idade/número?
//    private static boolean verificaNumero(String alvo) {
//        return (alvo != null && alvo.matches("[0-9]*"));
//    }
//}
//
//
//
//
//
//
