package exercicio10tarefaflamingo;

import javax.swing.JOptionPane;

public class Exercicio03 {
		// 3) Apresentar o total da soma obtida dos cem primeiros n�meros inteiros (1+2+3+4+...+98+99+100).
		

		public static void main(String args[]) {
			int soma = 0;
			for (int i = 0; i <= 100; i++) {
				soma += i;
			}
			JOptionPane.showMessageDialog(null, "Somat�rio:" + soma);

	}

}
