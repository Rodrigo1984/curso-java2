/*exercicio 1
 * Um aluno tirou notas 8.5, 7.5 e 6.0 em provas que tinham peso 3, 2 e 5, respectivamente.
Escreva um programa que imprima a m�dia do aluno. 
 */

public class Exercicio1 {

	public static void main(String[] args) {
		
		//notas do alunos nas provas. Feito um casting para que float se encaixe em double.
		float nota1 = (float) 8.5;
		float nota2 = (float) 7.5;
		float nota3 = (float) 6.0;
		
		//pesos das provas
		int peso1 = 3;
		int peso2 = 2;
		int peso3 = 5;
		
		//c�lculo parcial da nota, multiplicando a nota pelo peso
		double parcial1 = nota1 * peso1;
		double parcial2 = nota2 * peso2;
		double parcial3 = nota3 * peso3;
		
		//c�lculo da m�dia, onde ocorre a soma das parciais, dividida pela soma dos pesos
		//a presen�a dos par�nteses � obrigat�ria para que as adi��es sejam feitas antes da divis�o
		double media = (parcial1 + parcial2 + parcial3) / (peso1 + peso2 + peso3);
		
		System.out.println(media);
	}
}
