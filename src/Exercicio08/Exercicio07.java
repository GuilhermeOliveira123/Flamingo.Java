package exercicio08tarefaflamingo;

public class Exercicio07 {

	public static void main(String[] args) {

		/*7) Escreva um programa que apresente a s�rie de Fibonacci at� o d�cimo quinto termo. 

		 * A s�rie de Fibonacci � formada pela seq��ncia: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. 

		 * Esta s�rie se caracteriza pela soma de um termo atual com o seu anterior subseq�ente, 

		 * para que seja formado o pr�ximo valor da seq��ncia. Portanto come�ando com os n�meros 

		 * 1, 1 o pr�ximo termo � 1+1=2, o pr�ximo � 1+2=3, o pr�ximo � 2+3=5, o pr�ximo 3+5=8, etc.

		 */

		



	    int n1 = 1;

	    int n2 = 0;

	    

	         

	    for (int i = 1; i <= 15; i++){

	      if (i < 2){

	          

	          System.out.println(1);

	          

	      } else {

	        n1 = n1 + n2;

	        n2 = n1 - n2;

	       

	    

	    System.out.println(n1);

	     }

	   }

	}

}
