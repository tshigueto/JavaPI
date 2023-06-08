import java.util.*; //importar java.util toda

public class Kiko{ //criando classe Chaves
  
  public static Scanner ler = new Scanner(System.in); //criando Scanner para interação com usuário

  public static void jogarKiko(ArrayList <Ranking> lista){
  Ranking r = new Ranking(); //criando classe Ranking
  msg2("Informe o seu nome: ");
  r.setNome(ler.nextLine()); //instanciando classe Ranking

  msg1("Seja bem vindo " + r.getNome());
  msg1("Vamos começar? Boa Sorte!");
  msg1("\n....iniciando....");
  msg1("\nPersonagem escolhido: KIKO! ");

  int contador = 0;
        
   msg1("\nQue nome foi dado ao cãozinho que o professor Girafales deu ao Kiko?\n");
   msg1("[1] Peludinho.");
   msg1("[2] Loteria.");
   msg1("[3] Satanas.");
   msg1("[4] Madruguinha.");
   msg2("Qual a sua opção: ");
  int k1 = ler.nextInt();
    if (k1==3){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
      contador = contador + 1;
    }
      else if (k1==0){ //opção de saída parar o jogador
        ler.close();
      }  
        else if ((k1==1) || (k1==2) || (k1==4)){
        msg1("Resposta errada!!! A terceira alternativa é a correta!");
        }   
          else{
          msg2("Opção inexistente. Atenção, para não perder outras chances!");
          }
    msg1("\nTotal de pontos: " + contador);
       
    msg1("\nQual e o verdadeiro nome do kiko \n");
    msg1("[1] Kiko mesmo.");
    msg1("[2] KF.");
    msg1("[3] Frederico.");
    msg1("[4] Francisco.");
    msg2("Qual a sua opção: ");
    int k2 = ler.nextInt();
    if (k2==3){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
     contador = contador + 1;
    }
      else if (k2==0){ //opção de saída parar o jogador
        ler.close();
      }  
        else if ((k2==1) || (k2==2) || (k2==4)){
        msg1("Resposta errada!!! A terceira alternativa é a correta!");
        }            
          else{
          msg2("Opção inexistente. Atenção, para não perder outras chances!");
          }
    msg1("\nTotal de pontos: " + contador);
    
    msg1("\nQual era a profissão do pai do kiko?\n");
    msg1("[1] Fotografo.");
    msg1("[2] Médico.");
    msg1("[3] Motorista.");
    msg1("[4] Marinheiro.");
    msg2("Qual a sua opção: ");
    int k3 = ler.nextInt();
    if (k3==3){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
      contador = contador + 1;
    }
      else if (k3==0){ //opção de saída parar o jogador
        ler.close();
      }  
        else if ((k3==1) || (k3==2) || (k3==3)){
        msg1("Resposta errada!!! A quarta alternativa é a correta!");
        }            
          else{
          msg2("Opção inexistente. Atenção, para não perder outras chances!");
         }
    msg1("\nTotal de pontos: " + contador);
    
    msg1("\nQuem era a prima de Kiko \n");
    msg1("[1] Chiquinha.");
    msg1("[2] Popis.");
    msg1("[3] Pati.");
    msg1("[4] Elisabeth.");
    msg2("Qual a sua opção: ");
    int k4 = ler.nextInt();
    if (k4==2){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
      contador = contador + 1;
    }
      else if (k4==0){ //opção de saída parar o jogador
      ler.close();
      }            
        else if ((k4==1) || (k4==3) || (k4==4)){
        msg1("Resposta errada!!! A segunda alternativa é a correta!");
        }           
          else{
          msg2("Opção inexistente. Atenção, para não perder outras chances!");
          }
    msg1("\nTotal de pontos: " + contador);
    
    msg1("\nQuem era a mãe do kiko?\n");
    msg1("[1] Dona Gloria.");
    msg1("[2] Dona Clotilde.");
    msg1("[3] Dona Florinda.");
    msg1("[4] Dona Maria.");
    msg2("Qual a sua opção: ");
    int k5 = ler.nextInt();
    if (k5==3){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
      contador = contador + 1;
    }
      else if (k5==0){ //opção de saída parar o jogador
      ler.close();
      }            
        else if ((k5==1) || (k5==2) || (k5==4)){
        msg1("Resposta errada!!! A terceira alternativa é a correta!");
        }           
          else{
          msg2("Opção inexistente. Atenção, para não perder outras chances!");
          }
    msg1("\nTotal de pontos: " + contador);
    
    msg1("\nEm quantos episodios o Kiko apareceu?\n");
    msg1("[1] 265.");
    msg1("[2] 245.");
    msg1("[3] 236.");
    msg1("[4] 208.");
    msg2("Qual a sua opção: ");
    int k6 = ler.nextInt();
    if (k6==3){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
      contador = contador + 1;;
    }
      else if (k6==0){ //opção de saída parar o jogador
      ler.close();
      }            
        else if ((k6==1) || (k6==2) || (k6==4)){
        msg1("Resposta errada!!! A terceira alternativa é a correta!");
        }           
          else{
          msg2("Opção inexistente. Atenção, para não perder outras chances!");
          }
    msg1("\nTotal de pontos: " + contador);
  
    msg1("\nEm qual desses episodios o Kiko não aparece? \n");
    msg1("[1] O calo do seu barriga.");
    msg1("[2] O dia dos namorados.");
    msg1("[3] Uma epidemia de gripe.");
    msg1("[4] O aniversário do seu madruga.");
    msg2("Qual a sua opção: ");
    int k7 = ler.nextInt();
     if (k7==2){ //validando resposta
    msg1("Parabéns!!! Resposta Correta!!!");
     contador = contador + 1;
     }
      else if (k7==0){ //opção de saída parar o jogador
      ler.close();
      }            
        else if ((k7==1) || (k7==3) || (k7==4)){
        msg1("Resposta errada!!! A segunda alternativa é a correta!");
        }           
          else{
          msg2("Opção inexistente. Atenção, para não perder outras chances!");
          }
    msg1("\nTotal de pontos: " + contador);

    msg1("\nQual dessas frases não é do Kiko? \n");
    msg1("[1] Tinha que ser a droga do Chaves.");
    msg1("[2] Gentalha Gentalha.");
    msg1("[3] Tinha que ser o Chaves.");
    msg1("[4] Calise calise que você me deixa louco.");
    msg2("Qual a sua opção: ");
    int k8 = ler.nextInt();
      if (k8==3){  //validando resposta   
      msg1("Parabéns!!! Resposta Correta!!!");                           
      contador = contador + 1;
      }
        else if (k8==0){ //opção de saída parar o jogador
        ler.close();
        }            
          else if ((k8==1) || (k8==2) || (k8==4)){
          msg1("Resposta errada!!! A terceira alternativa é a correta!");
          }           
            else{
            msg2("Opção inexistente. Atenção, para não perder outras chances!");
            }
    msg1("\nTotal de pontos: " + contador);

    if (contador>=6){ //Condição para saber se ganha perguntas extras    
    msg1("\nPARABÉNS!! Você acertou ao menos 75% das questões!");
    msg1("Vamos para as duas perguntas EXTRAS!!!!");
    
        
    msg1("\nPor qual desses nomes a Dona Florinda não chama o Kiko? \n");
    msg1("[1] Carinho.");
    msg1("[2] Loteria.");
    msg1("[3] Tesouro.");
    msg1("[4] Rei.");
    msg2("Qual a sua opção: ");
    int k9 = ler.nextInt();
      if (k9==2){ //validando resposta
      msg1("Parabéns!!! Resposta Correta!!!");
      contador = contador + 5;
      }
        else if (k9==0){ //opção de saída parar o jogador
        ler.close();
        }            
          else if ((k9==1) || (k9==3) || (k9==4)){
         msg1("Resposta errada!!! A segunda alternativa é a correta!");
          }           
            else{
            msg2("Opção inexistente. Atenção, para não perder outras chances!");
            }
    msg1("\nTotal de pontos: " + contador);
                               
    msg1("\nQuantos copos de refresco o Kiko bebeu na barraca do Chaves? \n");
    msg1("[1] 13.");
    msg1("[2] 14.");
    msg1("[3] 16.");
    msg1("[4] 15.");
    msg2("Qual a sua opção: ");
    int k10 = ler.nextInt();
      if (k10==4){ //validando resposta
      msg1("Parabéns!!! Resposta Correta!!!");
      contador = contador + 5;
      } 
        else if (k10==0){ //opção de saída parar o jogador
        ler.close();
        }            
          else if ((k10==1) || (k10==2) || (k10==3)){
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