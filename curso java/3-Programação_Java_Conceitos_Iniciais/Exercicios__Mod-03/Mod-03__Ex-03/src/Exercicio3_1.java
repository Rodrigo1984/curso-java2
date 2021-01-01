/*
 * O c�lculo do fatorial de um n�mero (!) segue a seguinte regra:
0!  1
1!  0!  1
2!  1!  2
...
!   	 1
!  
Escreva uma aplica��o que efetua o c�lculo do fatorial utilizando a forma iterativa (usando
estruturas de repeti��o) e outra que efetua o mesmo c�lculo, mas de forma recursiva (o
m�todo de c�lculo do fatorial chama ele mesmo). 

 */


public class Exercicio3_1 {

	public static void main(String[] args) {
		//valor para o qual o fatorial ser� calculado
		int valor = 4;
		
		//esta vari�vel acumula o resultado
		long resposta = 1;
	
		//no bloco for, o valor j� calculado (vari�vel resposta) � multiplicado com o valor de i,
		//que � o n�mero corrente da itera��o.
		for (int i = 2; i <= valor; i++) {
			resposta *= i;
		}

		System.out.println("O fatorial de " + valor + " � igual a " + resposta);
	}
}
