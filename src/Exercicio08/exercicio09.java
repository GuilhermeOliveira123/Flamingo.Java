package exercicio08tarefaflamingo;

public class exercicio09 {

	public static void main(String[] args) {

		/*9) Elaborar um programa que efetue a leitura de 10 valores numéricos 

		 * e apresente no final o total do somatório e a média aritmética dos valores lidos.

		 */

		

		double soma=0;

	       for(double i = 0; i <= 10; i++){

	          soma+=i;

	         

	       }

	       System.out.println("A soma dos numeros é : " +soma);

	       double media = soma/10;

	       System.out.println("A média dos numeros é : " +media);

	}

}
