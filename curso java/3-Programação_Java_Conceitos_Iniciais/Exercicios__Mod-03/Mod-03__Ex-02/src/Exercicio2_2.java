/*
 * 2. Imprima a soma dos n�meros de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.). 

 */

public class Exercicio2_2 {

	public static void main(String[] args) {
		
		//vari�vel para aculular a soma dos valores (inicia em 0)
		int soma = 0;
		
		//for de 1 at� 100
		for (int i = 1; i <= 100; i += 2) {
			//para cada itera��o do for, soma recebe o seu valor anterior somado com o valor de i
			soma = soma + i;
		}
		
		System.out.println(soma);
	}
}
