package exercicio10tarefaflamingo;

import java.util.Scanner;

public class Exercicio08 {
	
	/*8) Elaborar um programa que apresente como resultado o valor de uma pot�ncia de uma base
	qualquer elevada a um expoente qualquer, ou seja, de BE, em que B � o valor da base e E o 
	valor do expoente. Observe que neste exerc�cio n�o pode ser utilizado o operador de exponencia��o do portuguol (^).*/


	public static void main(String[] Args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("C�lculo de pot�ncia");

		System.out.println("Entre com a base");
		int base = scan.nextInt();

		System.out.println("Entre com o expoente");
		int exp = scan.nextInt();

		int potencia = 1;
		int count = 1;

		while (count <= exp) {
			potencia *= base;
			count++;
		}
		System.out.println(base + " ^ " + exp + " = " + potencia);
		scan.close();

	}

}
