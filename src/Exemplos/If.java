package exemplos;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor :");
		int valor=sc.nextInt();
		if (valor>20) {
			System.out.println("O valor digitado � maior que 20");
		}
sc.close();

	}

}
