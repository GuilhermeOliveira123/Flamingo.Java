package exercicio10tarefaflamingo;

import javax.swing.JOptionPane;

public class Exercicio06 {
		
		/* 6) Apresentar todos os n�meros divis�veis por 4 que sejam menores que 200.
		  Para verificar se o n�mero � divis�vel por 4, efetuar dentro da malha a
		  verifica��o l�gica desta condi��o com a
		  instru��o se, perguntando se o n�mero � divis�vel; sendo, mostre-o; n�o
		  sendo, passe para o
		  pr�ximo passo. A vari�vel que controlar� o contador deve ser iniciada com o
		  valor 1.
		 */
		
	public class NumerosDivisiveisPor4menorque200 {
		public void main(String[] args) {

			String total = "";
			int i;

			for (i = 1; i < 200; i++) {
				if (i % 4 == 0)
					total += i + ",";
			}

			JOptionPane.showMessageDialog(null, total, "RESULTADO", JOptionPane.PLAIN_MESSAGE);

		}
	}
}