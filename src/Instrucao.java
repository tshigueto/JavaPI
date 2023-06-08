
import java.util.*; //importanto classe util

public class Instrucao{ //criando a classe
  
  public static void instrucoes(){ //criando metodo para mostrar as instruções

    Scanner ler = new Scanner(System.in); //criando classe Scanner
    int opcao = 1;
    
    msg1("\nBem vindo ao Quiz da Turma do Chaves!");
    msg1("\nPrimeiro você deverá escolher o seu jogador.");
    msg1("Você terá 8 perguntas, valendo 1 ponto cada.");
    msg1("Se o você acertar, ao menos, 75% das questões.");
    msg1("Você terá o direito de responder mais 2 questões EXTRAS!!!");    
    msg1("Valendo 5 pontos! BOA SORTE!\n");
    msg1("Caso queira sair, sem finalizar o teste, basta digitar 0 para sair!");

    do{ //criando laço de repetição para usuário dar comando e voltar para menu inicial.
      
      msg1("\nDigite 0 para voltar ao menu principal.");
      opcao = ler.nextInt();
      
      switch(opcao){
        case 0:

        break;

        default:
          msg1("opção inválida");
        break;
      }      
    } while (opcao!=0);
  }
  
  public static void msg1(String frase1){ //criando um método para imprimir mensagens.
    System.out.println(frase1);
  }
  
  public static void msg2(String frase2){ //criando um método para imprimir mensagens.
    System.out.print(frase2);
  }
  
}