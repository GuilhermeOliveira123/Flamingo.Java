package exercicio08tarefaflamingo;

public class Exercicio10 {

	public static void main(String[] args) {

		/*10) Elaborar um programa que apresente os resultados da soma e da m�dia

		 *  aritm�tica dos valores pares situados na faixa num�rica de 50 a 70.

		 */

		   double soma=0;

	       for(double i = 50; i <= 70; i+=2){

	          soma+=i;

	         

	       }

	       System.out.println("A soma dos numeros � : " +soma);

	       double media = soma/10;

	       System.out.println("A m�dia dos numeros � : " +media);

	}

}
