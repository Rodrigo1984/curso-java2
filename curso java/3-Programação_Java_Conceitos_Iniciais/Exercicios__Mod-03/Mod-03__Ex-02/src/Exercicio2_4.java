/*
 * 4. Imprima a tabuada do 9 (at� o d�cimo valor). 

 */

public class Exercicio2_4 {

	public static void main(String[] args) {
		
		//vari�vel para controlar quantos n�meros j� foram impressos
		int cont = 0;
		
		//inicia o for com o i valendo 1, n�o termina enquanto o cont for menor que 10.
		for(int i = 1; cont < 10; i++) {
			
			//o c�digo if verifica se o resto da divis�o entre i e 9 � 0.
			//caso seja, o n�mero � m�ltiplo de 9 e deve ser impresso
			if(i % 9 == 0) {
				System.out.println(i);
				
				//incrementa 1 se condi��o if for verdadeira.
				cont++;
			}
		}
	}
}
