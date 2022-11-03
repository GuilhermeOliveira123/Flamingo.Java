package exercicio06tarefaflamingo;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		/*08). Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores.*/
		
		int a, b, c, d;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		a = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		b = sc.nextInt();
		System.out.print("Digite o terceiro valor: ");
		c = sc.nextInt();
		System.out.print("Digite o quarto valor: ");
		d = sc.nextInt();

		if (a % 2 == 0 || a % 3 == 0) {
			System.out.println(a);
		}

		if (b % 2 == 0 || b % 3 == 0) {
			System.out.println(b);
		}

		if (c % 2 == 0 || c % 3 == 0) {
			System.out.println(c);
		}

		if (d % 2 == 0 || d % 3 == 0) {
			System.out.println(d);
		}

		sc.close();
		
		

	}

}
