/*
2 Nome do Projeto: Quiz da Turma do Chaves
3 Data de Criação: 08/11/2022
4 Versão: 2
5 Data da Última Modificação: 01/06/2023
6 Versão do Java: 17 (Oracle)
7 Equipe de Desenvolvimento:
8 - Camila Pereira da Silva
9 - Juliana Camargo
10 - Thiago Shigueto Hossaka
11
12 Descrição: Este programa é sobre a Turma do Chaves, a cada resposta correta, você tem uma pontuação.
13
15 O programa possui como exibição de perguntas, cálculo de pontuação,
classificação dos jogadores.
16 
17
18 O pacote "perguntas" contém as classes relacionadas ao gerenciamento de perguntas e
respostas no jogo.*/


import java.util.*; //importar java.util toda

class ProjetoFinal{ //criando classe ProjetoFinal
  
  public static void main(String[] args) {

    ArrayList<Ranking> l = new ArrayList<>(); //criando ArrayList
    Scanner ler = new Scanner(System.in); //criando classe Scanner
    Creditos c = new Creditos(); //criando classe Creditos
    Instrucao i = new Instrucao(); //criando classe Instruçao
    Chaves cha = new Chaves(); //criando classe Chaves
    Chiquinha chi = new Chiquinha(); //criando classe Chiquinha
    Kiko kik = new Kiko(); //criando classe Kiko
    Ranking r = new Ranking(); //criando classe Ranking
    
        
    int opcao = 1; //criando uma variável para ficar no laço de repetição enquanto usuário não decidir sair
    
    while(opcao!=0){ //criando Menu com repetição 
      
    msg1("\n---- Menu ----");
    msg1(" ");
    msg1("[1] - Intruções");
    msg1("[2] - Jogar");
    msg1("[3] - Créditos");
    msg1("[4] - Imprimir Ranking");
    msg1("[0] - Sair");    
    msg1(" ");
    msg2("Digite a opção desejada: ");
    opcao = ler.nextInt();
      
    switch(opcao){ //Lista das opções do menu que o usuário escolher
        
      case 1:
      i.instrucoes();
      break;

      case 2:
      msg1("Opções de Personagens:");  //Menu de personagens para o usuário escolher
      msg1("\n[ 1 ] - Chaves");
      msg1("[ 2 ] - Chiquinha");
      msg1("[ 3 ] - Kiko");
      msg2("\nCom qual personagem você deseja jogar? ");
      int x = ler.nextInt();
        if(x==1){ //condição para saber qual personagem o usuário escolheu
          cha.jogarChaves(l);
        }
        else if (x==2){ //condição para saber qual personagem o usuário escolheu
          chi.jogarChiquinha(l);
        }
        else if (x==3){ //condição para saber qual personagem o usuário escolheu
          kik.jogarKiko(l);
        }
        else {
          msg1("Opção inválida!");
        }
      break;

      case 3: 
      c.credito();
      break;
      
      case 4: 
      r.imprimirRanking(l);
      break;          
          
      case 0:
      System.exit(0);
      break;

      default: //retorno quando o usuário digitar uma opção inválida
      msg1("Opção Inexistente! \nTente novamente!");
      }
    }
  ler.close();
  }
  
  public static void msg1(String frase1){ //função para substituir System.out.println
    System.out.println(frase1);
  }
  
  public static void msg2(String frase2){ //função para substituir System.out.print
    System.out.print(frase2);
  }
  
}
