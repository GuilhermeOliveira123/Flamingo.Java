package exercicio08tarefaflamingo;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		/*11) Elaborar um programa que possibilite calcular a �rea total de uma resid�ncia (sala, cozinha,

		banheiro, quartos, �rea de servi�o, quintal, garagem, etc.). O programa deve solicitar a entrada do nome,

 		a largura e o comprimento de um determinado c�modo. Em seguida, 

 		deve apresentar a �rea do c�modo lido e tamb�m uma mensagem solicitando do usu�rio a confirma��o de continuar calculando novos c�modos. 

 		Caso o usu�rio responda �NAO�, o programa deve apresentar o valor total acumulado da �rea residencial.*/

		

		Scanner sc = new Scanner(System.in);

		String nome;

		float largura, comprimento, area, soma = 0;

		char continuar;

		do {

			System.out.println("Digite o nome do comodo");

			

			nome = sc.nextLine();

			System.out.println("Digite o comprimento do comodo");

			comprimento = sc.nextFloat();

			System.out.println("Digite a largura do comodo");

			largura = sc.nextFloat();

			area = largura*comprimento;

			System.out.println("A �rea do comodo "+nome+ "�: "+area);

			System.out.println();

			

			System.out.println("Deseja continuar calculando?) (s:sim/n:n�o):");

			continuar = sc.next().charAt(0);

			System.out.println();

			soma = soma+area;

			sc.nextLine();

			

			

		} while (continuar!='n');

		System.out.println("A soma das areas dos comodos lidos s�o: "+soma);

		sc.close();

	}

}
