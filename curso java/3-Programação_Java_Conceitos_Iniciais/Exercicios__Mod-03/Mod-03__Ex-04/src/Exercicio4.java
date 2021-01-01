/*
 * Imprima os 15 primeiros números da série de Fibonacci. A série de Fibonacci é tem os
seguintes elementos: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Para calculá-la, o primeiro e segundo
elementos valem 1, e daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado
ao (n-2)-ésimo elemento (ex: 8 = 5 + 3). 
 */
public class Exercicio4 {

	public static void main(String[] args) {
		int j = 1;
		
		//este algoritmo é uma das maneiras de calcular a série de Fibonacci. As variáveis i e j
		//são utilizadas para percorrerem a sequência numérica e acumularem o resultado.
		
		//A variável i é responsável por encontrar o próximo número da sequência (somando ela mesma com j).
		//A variável j sempre aponta para o número anterior da sequência (o número que antes era i).
		//E a variável cont conta quantas vezes o for executou, para que possa ocorrer a parada no 15o elemento
		//A forma mais fácil de entender a solução deste exercício é fazendo um teste de mesa: anote em um papel
		//o valor das variáveis e simule uma execução passo a passo.
		
		for (int i = 0, cont = 0; cont < 15; cont++) {
			System.out.print(i + " ");
			i = i + j;
			j = i - j;
		}
	}
}
