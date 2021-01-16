package aula011;

public class Aula011 {
	public static void main(String[] args) {
		//Pessoa p1 = new Pessoa(); classe pessoa nao pode ser implementada pois é do tipo abtrato
		Visitante v1 = new Visitante();
		v1.setNome("Jose");
		v1.setIdade(30);
		v1.setSexo("M");
		
		Aluno a1 = new Aluno();
		a1.setNome("Joanildo");
		a1.setIdade(33);
		a1.setSexo("M");
		a1.setCurso("Programação");
		a1.setMatricula(1);
		//a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setBolsa(51.2f);
		b1.setNome("Manuel");
		b1.setIdade(24);
		b1.setSexo("M");
		
		Professor pr1 = new Professor();
		pr1.setEspecialidade("Portugues");
		pr1.receberAum(500f);
		
		Tecnico tc1 = new Tecnico();
		tc1.
		
		
				
	}
}