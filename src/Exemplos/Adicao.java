package exemplos;

import java.util.Scanner;

public class Adicao {

	public static void main(String[] args) {
		
		//Adição*//
		
		 Scanner sc = new Scanner(System.in); 
		 
		 System.out.println("Digite um valor:");
		 int valor1=sc.nextInt();
		 System.out.println("Digite um valor:");
		 int valor2=sc.nextInt();
		 int soma= valor1+valor2;
		 System.out.println("A soma dos dois valores corresponde a : "+soma);
		 
		 sc.close();

	}

}
