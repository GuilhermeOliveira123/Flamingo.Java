package exercicio10tarefaflamingo;

import javax.swing.JOptionPane;

public class Exercicio07 {


	
	/* 7) Apresentar os resultados das pot�ncias de 3, variando do expoente 0 at� o
	  expoente 15. Deve ser considerado que qualquer n�mero elevado a zero � 1, e
	  elevado a 1 � ele pr�prio. Observe que neste exerc�cio n�o pode ser utilizado
	  o operador de exponencia��o do portuguol (^).
	 */
		
		public class PotenciasDe3variandoDe1a15 {
			public void main(String[] args) {
				String total = "";
				int i;
				
				int n3 = 3;

				for (i = 1; i <= 15; i++) {
					if (i == 1) {
						total += "3 elevado a " + i + " � " + n3 + "\n";
						i++;
					}
					n3 *= 3;
					total += "3 elevado a " + i + " � " + n3 + "\n";
				}
				JOptionPane.showMessageDialog(null, total, "RESULTADO", JOptionPane.PLAIN_MESSAGE);
			}

	}

}
