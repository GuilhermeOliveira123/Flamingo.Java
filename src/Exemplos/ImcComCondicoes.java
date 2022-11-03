package exemplos;

import java.util.Scanner;

public class ImcComCondicoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		float peso, altura, imc;
		
		System.out.println("Calculadora de Imc");
		System.out.println();
		System.out.println("Digite o seu nome");
		nome = sc.next();
		System.out.println("Digite o seu peso");
		peso = sc.nextFloat();
		System.out.println("Digite sua altura");
		altura = sc.nextFloat();
		
		imc = peso/(float)(Math.pow(altura, 2));
		
		if (imc <= 18.5) {
			System.out.printf(nome+" Voc� est� abaixo do peso!!! imc: %.2f%n",imc);
		}
		else if (imc <=24.9) {
			System.out.printf(nome+" Voc� est� no peso ideal!!! imc: %.2f%n",imc);
		}
		else if (imc <=29.9) {
			System.out.printf(nome+" Voc� est� acima do peso!!! imc: %.2f%n",imc);
		}
		else if (imc <=34.9) {
			System.out.printf(nome+" Voc� est� com obesidade grau 1!!! imc: %.2f%n",imc);
		}
		else if (imc <=39.9) {
			System.out.printf(nome+" Voc� est� com obesidade grau 2!!! imc: %.2f%n",imc);
		}
		else {
			System.out.printf(nome+" Voc� est� com obesidade grau 3!!! imc: %.2f%n",imc);
		}
		
		sc.close();
	}

}
