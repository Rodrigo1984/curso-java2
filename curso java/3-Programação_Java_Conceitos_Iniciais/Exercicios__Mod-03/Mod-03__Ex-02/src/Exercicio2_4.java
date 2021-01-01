/*
 * 4. Imprima a tabuada do 9 (até o décimo valor). 

 */

public class Exercicio2_4 {

	public static void main(String[] args) {
		
		//variável para controlar quantos números já foram impressos
		int cont = 0;
		
		//inicia o for com o i valendo 1, não termina enquanto o cont for menor que 10.
		for(int i = 1; cont < 10; i++) {
			
			//o código if verifica se o resto da divisão entre i e 9 é 0.
			//caso seja, o número é múltiplo de 9 e deve ser impresso
			if(i % 9 == 0) {
				System.out.println(i);
				
				//incrementa 1 se condição if for verdadeira.
				cont++;
			}
		}
	}
}
