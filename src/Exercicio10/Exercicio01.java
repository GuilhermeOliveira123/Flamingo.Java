package exercicio10tarefaflamingo;

public class Exercicio01 {

	public static void main(String[] args) {
		// 1) Apresentar os quadrados dos n�meros inteiros de 15 a 200.
		

		int i, quad;// Declara as vari�veis i (contador de looping) e quad(Que receber� os quadrados
					// de i)
		for (i = 15; i <= 200; i++) // contador para variar i de 15 at� 200
		{
			quad = i * i; // quad recebe o valor de i ao quadrado
			System.out.println("O quadrado de " + i + " � " + quad); // imprime os quadrados
		}

	}

}
