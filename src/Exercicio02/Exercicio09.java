package exercicioslista02;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1) Escreva um algoritmo para ler as dimensões de um quadrado (lado), 
		 * calcular e escrever a área do quadrado. Dica a=l²
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a medida do lado do quadrado");
		int ladoquadrado = sc.nextInt();
		int area = ladoquadrado*4;
		
		System.out.println("A area do quadrado é:" + area);
		
		sc.close();
		
	}

}
