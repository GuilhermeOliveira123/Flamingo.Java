package exemplos;

import java.util.Scanner;

public class Subtracao {

	public static void main(String[] args) {
		
		
		//Subtra��o
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor3=sc.nextInt();
		System.out.println("Digite um valor:");
		int valor4=sc.nextInt();
		int subtracao= valor3-valor4;
		System.out.println("A subtra��o dos dois valores corresponde a : "+subtracao);
		
		sc.close();
		

	}

}
