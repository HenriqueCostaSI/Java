import java.util.Scanner;

public class testedeComandos {

	public static void main(String[] args) {
		
		//Vetores
		  int vet[]= new int[10];
		  
		  vet[0] = 1;
		  
		  for (int i= 0; i<vet.length; i++)
			  System.out.println(vet[i] + ", ");
		  
		  System.out.println("Nova linha");

		  for(int c:vet) {
			  
			  System.out.println(c + ", ");
			  
		  }
		  
		  
		  
		  System.out.println("EEntre com seu nome");

		  String nome = leitura.nextLine();
	
		  System.out.println("Olá" + nome);
		  
		  
		  
	}
	

}
