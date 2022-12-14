package exercicio10tarefaflamingo;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*10) Elaborar um programa que apresente os valores de convers?o de graus Celsius em Fahrenheit,
		 *  de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. 
		 *  O programa deve apresentar os valores das duas temperaturas. A f?rmula de convers?o ? F = (9*C+160)/5, 
		 *  sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor indique um valor minimo:");
		float min = scanner.nextFloat();
		System.out.println("Agora indique um valor m?ximo:");
		float max = scanner.nextFloat();
		System.out.printf("Fahrenheit Celsius\n");
		for (float i = min; i <= max; i += .5) {
			System.out.printf("%6.2f     %6.2f%n", i, ((i - 32.0) * (5.0 / 9.0)));
		}
		scanner.close();

	}

}
