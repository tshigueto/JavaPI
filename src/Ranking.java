import java.util.*;

public class Ranking{

  private int ponto;
  private String nome;

  public int getPonto(){
    return this.ponto;
  }
  public void setPonto(int ponto){
    this.ponto = ponto;
  }
  public String getNome(){
    return this.nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }

  public static void imprimirRanking (ArrayList<Ranking>lista){
    for(Ranking item: lista){
      int i = 1;
      System.out.print(i+ " - " + item.getNome() + " " + item.getPonto() + " pontos! ");
      if(item.getPonto()>=14){
        System.out.println("Parabéns, você é um SUPER Fã!");
      }
      else if(item.getPonto()>=5){
       System.out.println("É, você é um Fã!");
      }
      else{
        System.out.println("Hey, tem certeza que gosto de Chaves?!?!");      
      }
      i++;
    }
  }
}