package exercicio08tarefaflamingo;

import java.util.Scanner;

public class Exercicio01 {


	public static void main(String[] args) {

		//1) Apresentar os resultados de uma tabuada de multiplicar (de 1 at� 10) de um n�mero qualquer.

		

	    Scanner sc = new Scanner (System.in);

	    System.out.println("Digite um n�mero :");

		int numero = sc.nextInt();

		int contadora = 1;

		

		while (contadora <= 10) {

			System.out.println(numero+" x "+contadora+" = "+numero*contadora);

			contadora++;

			sc.close();

		}

	}

}
