package exercicio10tarefaflamingo;

public class Exercicio09 {

	public static void main(String[] args) {
		/*9) Escreva um programa que apresente a s�rie de Fibonacci at� o d�cimo quinto termo. 
	 	s�rie de Fibonacci � formada pela seq��ncia: 1, 1, 2, 3, 5, 8, 13, 21, 34, ...,
		etc. Esta s�rie se caracteriza pela soma de um termo atual com o seu anterior subseq�ente, 
		para que seja formado o pr�ximo valor da seq��ncia. Portanto come�ando com os n�meros 1, 1 
		o pr�ximo termo � 1+1=2, o pr�ximo � 1+2=3, o pr�ximo � 2+3=5, o pr�ximo 3+5=8, etc.*/
		
		int anterior = 1, posterior = 1, auxiliar, contadora = 1;

		do {

			System.out.print(anterior + " ");
			auxiliar = anterior + posterior;
			anterior = posterior;
			posterior = auxiliar;
			contadora++;
		} while (contadora <= 15);

	}

}
