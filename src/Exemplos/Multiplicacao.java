package exemplos;

import java.util.Scanner;

public class Multiplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Multiplicação
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor5=sc.nextInt();
		System.out.println("Digite um valor:");
		int valor6=sc.nextInt();
		int multiplicacao= valor5*valor6;
		System.out.println("A multiplicação dos dois valores corresponde a : "+multiplicacao);

	sc.close();
		

	}

}
