package exercicioslista02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1) Solicite o valor das subtração
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		int num2=sc.nextInt();
		int subtração=num-num2;
		System.out.println("A subtração dos valores é" + subtração);
		
		sc.close();
		
	}

}
