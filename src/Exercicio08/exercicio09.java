package exercicio08tarefaflamingo;

public class exercicio09 {

	public static void main(String[] args) {

		/*9) Elaborar um programa que efetue a leitura de 10 valores num�ricos 

		 * e apresente no final o total do somat�rio e a m�dia aritm�tica dos valores lidos.

		 */

		

		double soma=0;

	       for(double i = 0; i <= 10; i++){

	          soma+=i;

	         

	       }

	       System.out.println("A soma dos numeros � : " +soma);

	       double media = soma/10;

	       System.out.println("A m�dia dos numeros � : " +media);

	}

}
