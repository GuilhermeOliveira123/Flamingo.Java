package exemplos;

import java.util.Scanner;

public class IfElseEncadeado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor = sc.nextInt();
		if (valor > 20) {
			System.out.println("O valor digitado é maior que 20");
		} else if (valor == 20) {
			System.out.println("O valor digitado é igual a 20");
		} else {
			System.out.println("O valor digitado é menor que 20");
		}
		sc.close();

	}

}
