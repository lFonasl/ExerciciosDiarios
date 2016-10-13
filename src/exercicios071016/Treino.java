package exercicios071016;

import java.util.Random;
import java.util.Scanner;

public class Treino {
	
  public Treino()
     {
	  exercicio3();
     }
  
  private void exercicio1()
  {  
	  System.out.println("Insira o numero 1");
	  int num1 = (new Scanner(System.in)).nextInt();
	  System.out.println("Insira o numero 2");
	  int num2 = (new Scanner(System.in)).nextInt();
	  
	  if(num1 > num2)
		  System.out.println("O numero 1 é o maior");
	  else 
		  System.out.println("O numero 2 é o maior");
  }
  
  private void exercicio2()
  {
	  System.out.println("Insira o numero 1");
	  int num1 = (new Scanner(System.in)).nextInt();
	  System.out.println("Insira o numero 2");
	  int num2 = (new Scanner(System.in)).nextInt();
	  System.out.println("Insira o numero 3");
	  int num3 = (new Scanner(System.in)).nextInt();
	  
	  if(num1 > num2 && num1 > num3)
		  System.out.println("O numero 1 é o maior");
	  else if (num2 > num3 && num2 > num1)
		  System.out.println("O numero 2 é o maior");
	  else
	  System.out.println("O numero 3 é o maior");
	  
  }
  
  private void exercicio3()
  {

	  System.out.println(" Tente adivinhar o numero !");
	  for(int i=0;i <=5;i++)
	  {
	  int vezes = 5;
	  int rand = (new Random()).nextInt(5) + 1;
	  System.out.println(" Introduza a "+(i+1)+" tentativa ! (1-5) "  );
	  int num1 = (new Scanner(System.in)).nextInt();
	  
	  if( num1 == rand)
	  {
	  System.out.println(" Acertou no numero !");
	  return;
	  }
	  else
	  {
		  System.out.println(" O numero que escolheu não corresponde ao sorteado !" );
	  }
	  }
	  
  }
  
  
  
  
  
  
  
  
  
  
}
	
