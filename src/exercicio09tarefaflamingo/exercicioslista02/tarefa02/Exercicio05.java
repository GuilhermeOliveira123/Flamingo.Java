package exercicioslista02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1) Solicite o valor da Multiplicação
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		int num2=sc.nextInt();
		int multiplicação=num*num2;
		System.out.println("A multiplição dos valores é" + multiplicação);
		
		sc.close();
	}

}
