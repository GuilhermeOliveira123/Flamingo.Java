package exercicio09tarefaflamingo;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*6) Elaborar um programa que efetue a leitura sucessiva de valores numéricos
		 *  e apresente no final o total do somatório, a média aritmética e o total de valores lidos. 
		 *  O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
		 *  Ou seja, o programa deve parar quando o usuário fornecer um valor negativo. 
		 *  Não se esqueça que o usuário pode entrar como primeiro número um número negativo, 
		 *  portanto, cuidado com a divisão por zero no cálculo da média.
		 */
		
		int numero;
		int valido = 0;
		do {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite Um Número:");
			numero = sc.nextInt();
			valido = valido+1;
			
			
			
		}while(numero<0);

	}

}
