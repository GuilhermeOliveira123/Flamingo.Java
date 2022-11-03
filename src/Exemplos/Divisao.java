package exemplos;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Divisão
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		float valor7=sc.nextFloat();
		System.out.println("Digite um valor:");
		float valor8=sc.nextFloat();
		float divisao= valor7/valor8;
		System.out.println("A divisao dos dois valores corresponde a : "+divisao);
		
		sc.close();

	}

}
