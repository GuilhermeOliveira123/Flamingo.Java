package exercicio09tarefaflamingo;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*10) Elaborar um programa que apresente o resultado inteiro da divis�o de dois n�meros quaisquer.
		Para a elabora��o do programa, n�o utilizar em hip�tese alguma o conceito do operador aritm�tico DIV.
 		A solu��o deve ser alcan�ada com a utiliza��o de looping. Ou seja, o programa deve apresentar como resultado 
 		(quociente) quantas vezes o divisor cabe no dividendo.*/
		

		int numero1, numero2, acumuladora, contadora = 1, soma = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("primeiro numero: ");
		numero1 = sc.nextInt();
		System.out.println("dividido por: ");
		numero2 = sc.nextInt();

		do {
			soma++;
			acumuladora = numero2 * contadora;

			// if (acumuladora > numero1) {

			// }

			contadora++;

		} while (acumuladora <= numero1);

		System.out.println(soma);

		sc.close();
	}

}
