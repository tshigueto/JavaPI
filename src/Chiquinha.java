import java.util.*; //importar java.util toda

public class Chiquinha{ //criando classe Chaves
  
  public static Scanner ler = new Scanner(System.in); //criando Scanner para interação com usuário
  
  public static void jogarChiquinha(ArrayList <Ranking> lista){
  Ranking r = new Ranking(); //criando classe Ranking
  msg2("Informe o seu nome: ");
  r.setNome(ler.nextLine()); //instanciando classe Ranking

  msg1("Seja bem vindo " + r.getNome());
  msg1("Vamos começar? Boa Sorte!");
  msg1("\n....iniciando....");
  msg1("\nPersonagem escolhido: CHIQUINHA! ");

  int contador = 0;
          
  msg1("\nO que aconteceu com a Chiquinha durante o episodio em que Seu Madruga trabalha numa Barbearia? \n");
  msg1("[1] O Chaves pinta seus sapatos e meia com graxa.");
  msg1("[2] O Chaves joga sabão nela.");
  msg1("[3] O Chaves corta o cabelo.");
  msg1("[4] O Chaves faz a sua barba.");
  msg2("Qual a sua opção: ");
  int c1 = ler.nextInt();
    if (c1==3){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
      contador = contador + 1;
    }
      else if (c1==0){ //opção de saída parar o jogador
        ler.close();
      }  
        else if ((c1==1) || (c1==2) || (c1==4)){
        msg1("Resposta errada!!! A terceira alternativa é a correta!");
        }   
          else{
          msg2("Opção inexistente. Atenção, para não perder outras chances!");
          }
  msg1("\nTotal de pontos: " + contador);
       
  msg1("\nQuais são os outros personagens que a Chiquinha e a Dona Florinda fazem? \n");
  msg1("[1] Popis e Gloria.");
  msg1("[2] Dona Neves e Pati.");
  msg1("[3] Gloria e Pati.");
  msg1("[4] Popis e Dona Neves.");
  msg2("Qual a sua opção: ");
  int c2 = ler.nextInt();
    if (c2==4){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
     contador = contador + 1;
    }
      else if (c2==0){ //opção de saída parar o jogador
        ler.close();
      }  
        else if ((c2==1) || (c2==2) || (c2==3)){
        msg1("Resposta errada!!! A quarta alternativa é a correta!");
        }            
          else{
          msg2("Opção inexistente. Atenção, para não perder outras chances!");
          }
  msg1("\nTotal de pontos: " + contador);
    
  msg1("\nEm quantos episodios Chiquinha apareceu? \n");
  msg1("[1] 235.");
  msg1("[2] 278.");
  msg1("[3] 208.");
  msg1("[4] 230.");
  msg2("Qual a sua opção: ");
  int c3 = ler.nextInt();
    if (c3==1){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
      contador = contador + 1;
    }
      else if (c3==0){ //opção de saída parar o jogador
        ler.close();
      }  
        else if ((c3==2) || (c3==3) || (c3==4)){
        msg1("Resposta errada!!! A priemira alternativa é a correta!");
        }            
          else{
          msg2("Opção inexistente. Atenção, para não perder outras chances!");
         }
  msg1("\nTotal de pontos: " + contador);
    
  msg1("\nQual destes ingredientes faz parte da formula da Chiquinha para ficar invisivel?\n");
  msg1("[1] Ketchup.");
  msg1("[2] Mostarda.");
  msg1("[3] Maionese.");
  msg1("[4] Chocolate.");
  msg2("Qual a sua opção: ");
  int c4 = ler.nextInt();
    if (c4==2){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
      contador = contador + 1;
    }
      else if (c4==0){ //opção de saída parar o jogador
      ler.close();
      }            
        else if ((c4==1) || (c4==3) || (c4==4)){
        msg1("Resposta errada!!! A segunda alternativa é a correta!");
        }           
          else{
          msg2("Opção inexistente. Atenção, para não perder outras chances!");
          }
  msg1("\nTotal de pontos: " + contador);
    
  msg1("\nSegundo a Chiquinha quanto custam os termometros na farmacia? \n");
  msg1("[1] 10 e 15 mangos.");
  msg1("[2] 15 e 20 mangos.");
  msg1("[3] 5 e 10 mangos.");
  msg1("[4] 20 e 25 mangos.");
  msg2("Qual a sua opção: ");
  int c5 = ler.nextInt();
    if (c5==2){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
      contador = contador + 1;
    }
      else if (c5==0){ //opção de saída parar o jogador
      ler.close();
      }            
        else if ((c5==1) || (c5==3) || (c5==4)){
        msg1("Resposta errada!!! A segunda alternativa é a correta!");
        }           
          else{
          msg2("Opção inexistente. Atenção, para não perder outras chances!");
          }
  msg1("\nTotal de pontos: " + contador);
    
  msg1("\nEm qual dessas temporadas a Chiquinha sai de Chaves? \n");
  msg1("[1] 74.");
  msg1("[2] 76.");
  msg1("[3] 78.");
  msg1("[4] 73.");
  msg2("Qual a sua opção: ");
  int c6 = ler.nextInt();
    if (c6==1){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
      contador = contador + 1;;
    }
      else if (c6==0){ //opção de saída parar o jogador
      ler.close();
      }            
        else if ((c6==2) || (c6==3) || (c6==4)){
        msg1("Resposta errada!!! A primeira alternativa é a correta!");
        }           
          else{
          msg2("Opção inexistente. Atenção, para não perder outras chances!");
          }
  msg1("\nTotal de pontos: " + contador);
    
  msg1("\nQuanto custou o liquido para limpar pratas que a Chiquinha comprou no inicio da saga? \n");
  msg1("[1] 50 mangos.");
  msg1("[2] 10 mangos.");
  msg1("[3] 15 mangos.");
  msg1("[4] 20 mangos.");
  msg2("Qual a sua opção: ");
  int c7 = ler.nextInt();
     if (c7==4){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
     contador = contador + 1;
     }
      else if (c7==0){ //opção de saída parar o jogador
      ler.close();
      }            
        else if ((c7==1) || (c7==2) || (c7==3)){
        msg1("Resposta errada!!! A quarta alternativa é a correta!");
        }           
          else{
          msg2("Opção inexistente. Atenção, para não perder outras chances!");
          }
  msg1("\nTotal de pontos: " + contador);

  msg1("\nA terceira parte do episodio, o que a Chiquinha pede de presente de natal para o papai Noel? \n");
  msg1("[1] Bola.");
  msg1("[2] Bicicleta.");
  msg1("[3] Dinheiro.");
  msg1("[4] Boneca.");
  msg2("Qual a sua opção: ");
  int c8 = ler.nextInt();
      if (c8==3){  //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");                              
      contador = contador + 1;
      }
        else if (c8==0){ //opção de saída parar o jogador
        ler.close();
        }            
          else if ((c8==1) || (c8==2) || (c8==4)){
          msg1("Resposta errada!!! A terceira alternativa é a correta!");
          }           
            else{
            msg2("Opção inexistente. Atenção, para não perder outras chances!");
            }
    msg1("\nTotal de pontos: " + contador);

    if (contador>=6){ //Condição para saber se ganha perguntas extras
    msg1("\nPARABÉNS!! Você acertou ao menos 75% das questões!");
    msg1("Vamos para as duas perguntas EXTRAS!!!!");    
          
    msg1("\nQual o nome verdadeiro da Atriz que enterpretava a personagem Chiquinha? \n");
    msg1("[1] Maria Antonieta De Las Nieves.");
    msg1("[2] Maria Antonia De Las Neves.");
    msg1("[3] Maria Antonita Nieves de Las.");
    msg1("[4] Maria Antonia Gomez Nieves.");
    msg2("Qual a sua opção: ");
    int c9 = ler.nextInt();
        if (c9==1){ //validando resposta
        msg1("Parabéns!!! Resposta Correta!!!");
        contador = contador + 5;
        }
          else if (c9==0){ //opção de saída parar o jogador
          ler.close();
          }            
            else if ((c9==2) || (c9==3) || (c9==4)){
            msg1("Resposta errada!!! A primeira alternativa é a correta!");
            }           
              else{
              msg2("Opção inexistente. Atenção, para não perder outras chances!");
              }
    msg1("\nTotal de pontos: " + contador);
                                 
    msg1("\nQuem era a Bisavò da Chiquinha? \n");
    msg1("[1] Dona Gloria.");
    msg1("[2] Dona Clotilde.");
    msg1("[3] Dona Florinda.");
    msg1("[4] Dona Neves.");
    msg2("Qual a sua opção: ");
    int c10 = ler.nextInt(); 
        if (c10==4){ //validando resposta
        msg1("Parabéns!!! Resposta Correta!!!");
        contador = contador + 5;
        } 
          else if (c10==0){ //opção de saída parar o jogador
          ler.close();
          }            
            else if ((c10==1) || (c10==2) || (c10==3)){
            msg1("Resposta errada!!! A quarta alternativa é a correta!");
            }           
              else{
              msg2("Opção inexistente. Atenção, para não perder outras chances!");
              }
        msg1("\nTotal de pontos: " + contador);

        r.setPonto(contador);
        lista.add(r);
      
    }
  }
    
  public static void msg1(String frase1){ //criando um método para imprimir mensagens
    System.out.println(frase1);
  }
  
  public static void msg2(String frase2){ //criando um método para imprimir mensagens
    System.out.print(frase2);
  }
  
}