package exercicio10tarefaflamingo;

public class Exercicio04 {

	
		// 4) Elaborar um programa que apresente no final o somat�rio dos valores pares existentes na faixa de 1 at� 500.
		
		public static void main(String[] Args) {

			int n1 = 0;
			int i;

			for (i = 2; i <= 500; i += 2) {
				if (i % 2 == 0)
					n1 += i;
				System.out.println(i + " = " + n1);
			}

	}

}
