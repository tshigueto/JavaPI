import java.util.*; //importar java.util toda

public class Chaves{ //criando classe Chaves
  
  public static Scanner ler = new Scanner(System.in); //criando Scanner para interação com usuário
  
  public void jogarChaves(ArrayList <Ranking> lista){
  Ranking r = new Ranking(); //criando classe Ranking
  msg2("Informe o seu nome: ");
  r.setNome(ler.next()); //instanciando classe Ranking

  msg1("Seja bem vindo " + r.getNome());
  msg1("Vamos começar? Boa Sorte!");
  msg1("\n....iniciando....");
  msg1("\nPersonagem escolhido: CHAVES! ");

  int contador = 0;
           
  msg1("\nQual dos episodios abaixo é um crossiver entre Chaves e Chapolim");
  msg1("[1] A venda da Vila.");
  msg1("[2] Visita a escola.");
  msg1("[3] O desjejum do Chaves.");
  msg1("[4] O futebol americano.");
  msg2("Qual a sua opção: ");
  int c1 = ler.nextInt();
  if (c1==2){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
    contador = contador + 1;
  }
    else if (c1==0){ //opção de saída parar o jogador
      msg1("Finalizando o jogo");
      ler.close();
    }  
      else if ((c1==1) || (c1==3) || (c1==4)){
        msg1("Resposta errada!!! A segunda alternativa é a correta!");
      }   
        else{
        msg2("Opção inexistente. Atenção, para não perder outras chances!");
        }
  msg1("\nTotal de pontos: " + contador);
     
  msg1("\nAo recitar Volta o cão arrependido, o Chaves diz que o verso deve ser repetido.");
  msg1("[1] 43 vezes.");
  msg1("[2] 42 vezes.");
  msg1("[3] 53 vezes.");
  msg1("[4] 44 vezes.");
  msg2("Qual a sua opção: ");
  int c2 = ler.nextInt();
  if (c2==4){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
   contador = contador + 1;
  }
    else if (c2==0){ //opção de saída parar o jogador
      msg1("Finalizando o jogo");
      ler.close();
    }  
      else if ((c2==1) || (c2==2) || (c2==3)){
        msg1("Resposta ERRADA! A quarta alternativa é a CORRETA!");
      }            
        else{
        msg2("Opção inexistente. Atenção, para não perder outras chances!");
        }
  msg1("\nTotal de pontos: " + contador);
  
  msg1("\nQual o verdadeiro nome do Chaves? \n");
  msg1("[1] Chaves mesmo.");
  msg1("[2] Vicente.");
  msg1("[3] Ninguem sabe.");
  msg1("[4] Chavier.");
  msg2("Qual a sua opção: ");
  int c3 = ler.nextInt();
  if (c3==3){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
    contador = contador + 1;
  }
    else if (c3==0){ //opção de saída parar o jogador
      msg1("Finalizando o jogo");
      ler.close();
    }  
      else if ((c3==1) || (c3==2) || (c3==4)){
        msg1("Resposta ERRADA! A terceira alternativa é a CORRETA!");
      }            
        else{
        msg2("Opção inexistente. Atenção, para não perder outras chances!");
       }
  msg1("\nTotal de pontos: " + contador);
  
  msg1("\nDe acordo com o Chaves, aonde ele mora?  \n");
  msg1("[1] Barril.");
  msg1("[2] Laboratorio.");
  msg1("[3] Casa numero 8.");
  msg1("[4] Orfanato.");
  msg2("Qual a sua opção: ");
  int c4 = ler.nextInt();
  if (c4==3){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
    contador = contador + 1;
  }
    else if (c4==0){ //opção de saída parar o jogador
      msg1("Finalizando o jogo");
    ler.close();
    }            
      else if ((c4==1) || (c4==2) || (c4==4)){
        msg1("Resposta ERRADA! A terceira alternativa é a CORRETA!");
      }           
        else{
        msg2("Opção inexistente. Atenção, para não perder outras chances!");
        }
  msg1("\nTotal de pontos: " + contador);
  
  msg1("\nQual era a idade de Chaves \n");
  msg1("[1] 7.");
  msg1("[2] 9.");
  msg1("[3] 8.");
  msg1("[4] 10.");
  msg2("Qual a sua opção: ");
  int c5 = ler.nextInt();
  if (c5==3){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
    contador = contador + 1;
  }
    else if (c5==0){ //opção de saída parar o jogador
      msg1("Finalizando o jogo");
    ler.close();
    }            
      else if ((c5==1) || (c5==2) || (c5==4)){
        msg1("Resposta ERRADA! A terceira alternativa é a CORRETA!");
      }           
        else{
        msg2("Opção inexistente. Atenção, para não perder outras chances!");
        }
  msg1("\nTotal de pontos: " + contador);
  
  msg1("\nO Ator Roberto Gomes Bolanos( Chaves) nasceu em: \n");
  msg1("[1] 30/05/1940.");
  msg1("[2] 13/02/1937.");
  msg1("[3] 21/02/1929.");
  msg1("[4] 23/03/1916.");
  msg2("Qual a sua opção: ");
  int c6 = ler.nextInt();
  if (c6==3){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
    contador = contador + 1;;
  }
    else if (c6==0){ //opção de saída parar o jogador
      msg1("Finalizando o jogo");
    ler.close();
    }            
      else if ((c6==1) || (c6==2) || (c6==4)){
        msg1("Resposta ERRADA! A terceira alternativa é a CORRETA!");
      }           
        else{
        msg2("Opção inexistente. Atenção, para não perder outras chances!");
        }
   msg1("\nTotal de pontos: " + contador);
    
   msg1("\nQuando surgiu Chaves? \n");
   msg1("[1] Julho 1971.");
   msg1("[2] Novembro 1967.");
   msg1("[3] Maio 1972.");
   msg1("[4] Agosto 1974.");
   msg2("Qual a sua opção: ");
   int c7 = ler.nextInt();
   if (c7==3){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
   contador = contador + 1;
   }
    else if (c7==0){ //opção de saída parar o jogador
      msg1("Finalizando o jogo");
    ler.close();
    }            
      else if ((c7==1) || (c7==2) || (c7==4)){
            msg1("Resposta ERRADA! A terceira alternativa é a CORRETA!");
      }           
        else{
        msg2("Opção inexistente. Atenção, para não perder outras chances!");
        }
    msg1("\nTotal de pontos: " + contador);
  
    msg1("\nEm quantos episodios o Chaves apareceu? \n");
    msg1("[1] 291.");
    msg1("[2] 290.");
    msg1("[3] 288.");
    msg1("[4] 286.");
    msg2("Qual a sua opção: ");
    int c8 = ler.nextInt();
    if (c8==1){  //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");                              
    contador = contador + 1;
    }
      else if (c8==0){ //opção de saída parar o jogador
      msg1("Finalizando o jogo");
      ler.close();
      }            
        else if ((c8==2) || (c8==3) || (c8==4)){
            msg1("Resposta ERRADA! A primeira alternativa é a CORRETA!");
        }           
          else{
          msg2("Opção inexistente. Atenção, para não perder outras chances!");
          }
    msg1("\nTotal de pontos: " + contador);

    if (contador>=6){ //Condição para saber se ganha perguntas extras
      msg1("\nPARABÉNS!! Você acertou ao menos 75% das questões!");
      msg1("Vamos para as duas perguntas EXTRAS!!!!");
      
      msg1("\nSegundo o Chaves como se chamam os animais que comem de tudo? \n");
      msg1("[1] Vegetarianos.");
      msg1("[2] Esfomeados.");
      msg1("[3] Ricos.");
      msg1("[4] Carnivoros.");
      msg2("Qual a sua opção: ");
      int c9 = ler.nextInt();
      if (c9==3){ //validando resposta
      msg1("Parabéns!!! Resposta Correta!!!");
      contador = contador + 5;
      }
        else if (c9==0){ //opção de saída parar o jogador
        msg1("Finalizando o jogo");
        ler.close();
        }            
          else if ((c9==2) || (c9==3) || (c9==4)){
            msg1("Resposta ERRADA! A prmeira alternativa é a CORRETA!");
          }           
            else{
            msg2("Opção inexistente. Atenção, para não perder outras chances!");
            }
      msg1("\nTotal de pontos: " + contador);  
                               
      msg1("\nO que o Chaves pede ao garçom depois de derrubar a mesa no café da manha? \n");
      msg1("[1] X Tudo.");
      msg1("[2] Cachorro quente.");
      msg1("[3] Sanduiche de presunto.");
      msg1("[4] Churros.");
      msg2("Qual a sua opção: ");
      int c10 = ler.nextInt(); 
      if (c10==2){ //validando resposta
      msg1("Parabéns!!! Resposta Correta!!!");
      contador = contador + 5;
      } 
        else if (c10==0){ //opção de saída parar o jogador
        msg1("Finalizando o jogo");
        ler.close();
        }            
          else if ((c10==1) || (c10==3) || (c10==4)){
            msg1("Resposta ERRADA! A segunda alternativa é a CORRETA!");
          }           
            else{
            msg2("Opção inexistente. Atenção, para não perder outras chances!");
            }
    msg1("\nTotal de pontos: " + contador);
    }

    else{
      msg1("Fim do jogo!");
      
    }

      r.setPonto(contador);
      lista.add(r);
    }
  
  
  public static void msg1(String frase1){ //criando um método para imprimir mensagens
    System.out.println(frase1);
  }
  
  public static void msg2(String frase2){ //criando um método para imprimir mensagens
    System.out.print(frase2);
  }
  
}