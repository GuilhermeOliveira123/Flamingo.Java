package exercicio09tarefaflamingo;

public class Exercicio03 {

	public static void main(String[] args) {

		/*3) Apresentar todos os n�meros divis�veis por 4 que sejam menores que 200. Para verificar se o n�mero � divis�vel por 4, efetuar dentro da malha a verifica��o l�gica desta condi��o com a

		instru��o se, perguntando se o n�mero � divis�vel; sendo, mostre-o; n�o sendo, passe para o

		pr�ximo passo. A vari�vel que controlar� o contador deve ser iniciada com o valor 1.*/



		int numero = 1;

		do {

		if (numero % 4 == 0)

		System.out.println(numero + " � divis�vel por 4 ");

		numero = numero + 1;

		} while (numero <= 200);

	}

}
