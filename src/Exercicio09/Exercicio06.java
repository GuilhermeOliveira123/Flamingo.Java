package exercicio09tarefaflamingo;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*6) Elaborar um programa que efetue a leitura sucessiva de valores num�ricos
		 *  e apresente no final o total do somat�rio, a m�dia aritm�tica e o total de valores lidos. 
		 *  O programa deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo valores positivos. 
		 *  Ou seja, o programa deve parar quando o usu�rio fornecer um valor negativo. 
		 *  N�o se esque�a que o usu�rio pode entrar como primeiro n�mero um n�mero negativo, 
		 *  portanto, cuidado com a divis�o por zero no c�lculo da m�dia.
		 */
		
		int numero;
		int valido = 0;
		do {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite Um N�mero:");
			numero = sc.nextInt();
			valido = valido+1;
			
			
			
		}while(numero<0);

	}

}
