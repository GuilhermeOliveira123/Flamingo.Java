package exercicio10tarefaflamingo;

public class Exercicio07 {
		
	public static void main(String[] args) {

	
	/* 7) Apresentar os resultados das pot�ncias de 3, variando do expoente 0 at� o
	  expoente 15. Deve ser considerado que qualquer n�mero elevado a zero � 1, e
	  elevado a 1 � ele pr�prio. Observe que neste exerc�cio n�o pode ser utilizado
	  o operador de exponencia��o do portuguol (^).
	 */
		
			String total="";
			int i;
			int n3=3;
    
			for(i=1;i<=15;i++)
    {
       n3=n3*3;
       total=total+n3+",";
       System.out.println(total);
    }  

}

}