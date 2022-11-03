package exercicioslista02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1) Solicite um valor do teclado e exiba o seu 
		 antecessor*/
		 
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite um valor:");
			int numero=sc.nextInt();
			int antecessor=numero-1;
			System.out.print("O antecessor do número digitado é:  " + antecessor);
			sc.close();

		
		}

}
