package exercicio09tarefaflamingo;

public class Exercicio02 {

	public static void main(String[] args) {

		// 2) Elaborar um programa que apresente no final o somat�rio dos valores pares existentes na faixa de 1 at� 500.



		int soma = 0;

		int par = 2;



		do {

		soma = soma + par;

		par = par + 2;

		System.out.println(" o somat�rio dos pares �: " + soma);



		} while (par <= 500);
	}

}
