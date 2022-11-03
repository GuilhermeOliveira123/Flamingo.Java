package exercicioslista02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1) Solicite o valor das soma
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		int num2=sc.nextInt();
		int soma=num+num2;
		System.out.println("A soma dos valores é" +soma);
		
		sc.close();
	}

}
