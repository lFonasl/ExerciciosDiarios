package exercicios071016;

import java.util.Scanner;

public class Treino {
	
  public Treino()
     {
	  exercicio1();
     }
  
  private void exercicio1()
  {  
	  System.out.println("Insira o numero 1");
	  int num1 = (new Scanner(System.in)).nextInt();
	  System.out.println("Insira o numero 2");
	  int num2 = (new Scanner(System.in)).nextInt();
	  
	  if(num1 < num2)
		  System.out.println("O numero 1 é o maior");
	  else 
		  System.out.println("O numero 2 é o maior");
	  
  }
  

}
	

