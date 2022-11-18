package aula4;

import java.util.Arrays;

public class A4E1TesteUnitario {

    public static void main(String[] args) {
        testeUnitarioVoto();

    }

    //metodo String
    static String statusVoto (int idade){
        if (idade >= 18 && idade <= 70) {
            return "Voto obrigatório";
        } else if (idade >= 16 && idade < 18 || idade > 70) {
            return "Voto  facultativo";
        } else {
            return "Sem direito a votar";
        }
    }

  static void testeUnitarioVoto(){
        //array com idades para testar
        //nt [] idadesTestar = {18,70,16,16,71,17,15,-15,16}; //com falhas
        int [] idadesTestar = {18,70,34,16,71,100,15,-15,4}; //todos sucesso

        //array com resultados esperados
        String [] saidasEsperadas = {"Voto obrigatório", "Voto obrigatório", "Voto obrigatório", "Voto  facultativo", "Voto  facultativo", "Voto  facultativo", "Sem direito a votar",
                "Sem direito a votar", "Sem direito a votar"
        };


      // percorrer arrays
        int totalFalhas = 0;

      //resultado
      String [] resultados = new String[9];


      for (int i = 0; i< idadesTestar.length; i++){

          if (statusVoto(idadesTestar[i]) == saidasEsperadas[i]) {
              System.out.println("Teste número " + (i+1) + " = Sucesso");

          } else {
              System.out.println("Teste número " + (i+1) + " = Falhou");
              totalFalhas ++;
          }

      }



       if (totalFalhas == 0){
           System.out.println("__________________________________");
           System.out.println("Testes executados com sucesso");
       } else {
           System.out.println("__________________________________");
           System.out.println("Os seguintes testes falharam: ");
           System.out.println("Total de testes que falharam = " + totalFalhas);

       }
  }
}
