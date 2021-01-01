/*
 * O cálculo do fatorial de um número (!) segue a seguinte regra:
0!  1
1!  0!  1
2!  1!  2
...
!   	 1
!  
Escreva uma aplicação que efetua o cálculo do fatorial utilizando a forma iterativa (usando
estruturas de repetição) e outra que efetua o mesmo cálculo, mas de forma recursiva (o
método de cálculo do fatorial chama ele mesmo). 

 */


public class Exercicio3_1 {

	public static void main(String[] args) {
		//valor para o qual o fatorial será calculado
		int valor = 4;
		
		//esta variável acumula o resultado
		long resposta = 1;
	
		//no bloco for, o valor já calculado (variável resposta) é multiplicado com o valor de i,
		//que é o número corrente da iteração.
		for (int i = 2; i <= valor; i++) {
			resposta *= i;
		}

		System.out.println("O fatorial de " + valor + " é igual a " + resposta);
	}
}
