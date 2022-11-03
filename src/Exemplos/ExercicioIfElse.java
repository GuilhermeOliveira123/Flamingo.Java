package exemplos;

import java.util.Scanner;

public class ExercicioIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero = sc.nextInt();
		if (numero==1) {
			System.out.println("Domingo");
		}else if(numero==2) {
			System.out.println("Segunda-Feira");
		}else if(numero==3) {
			System.out.println("Terça-Feira");
		}else if(numero==4) {
			System.out.println("Quarta-Feira");
		}else if(numero==5) {
			System.out.println("Quinta-Feira");
		}else if(numero==6) {
			System.out.println("Sexta-Feira");
		}else if(numero==7) {
			System.out.println("Sabado");
		}else;
	sc.close();

	}

}
