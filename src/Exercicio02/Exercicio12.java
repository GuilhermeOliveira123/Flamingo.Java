package exercicioslista02;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1)  Escreva um algoritmo para ler as dimensões de um circulo (raio), calcular e 
		 * escrever a área do circulo. a=pi*r²
		 */
		
		   System.out.println("Escreva o valor do raio");
	       Scanner scan = new Scanner(System.in);

	       double raio = scan.nextFloat();
	       double area = Math.PI * raio * raio;

	       System.out.println("O valor da area é " + area);
	       
	       scan.close();
	}

}
