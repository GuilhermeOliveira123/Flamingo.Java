package exercicio09tarefaflamingo;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		/*5) Elaborar um programa que efetue a leitura de 15 valores numéricos inteiros

		* e no final apresente ototal do somatório da fatorial de cada valor lido.

		*/



		int contadora = 1;

		double resultado = 0;



		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		while (contadora <= 15) {

		System.out.println("Digite um número: ");

		int numero = sc.nextInt();

		int contadoraFatorial = 1;

		double fatorial = 1;

		contadora++;

		do {

		fatorial = fatorial * contadoraFatorial;

		contadoraFatorial++;

		} while (contadoraFatorial <= numero);

		resultado = resultado+fatorial;

		}

		System.out.println("somatorio é: "+resultado);

	}

}
