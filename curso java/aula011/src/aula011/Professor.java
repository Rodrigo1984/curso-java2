package aula011;

public class Professor extends Pessoa {
	protected String especialidade;
	protected float salario = 1000;
		
	public void receberAum(float aum) {
		this.salario += aum;
		System.out.println("Aumento realizado com sucesso");
		System.out.println("R$: "+ this.salario);
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
}
