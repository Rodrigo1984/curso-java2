package aula011;

public class Tecnico extends Aluno {
	private int regisProf;
	
	public void praticar() {
		System.out.println("Aluno praticando os estudos!");
	}

	public int getRegisProf() {
		return regisProf;
	}

	public void setRegisProf(int regisProf) {
		this.regisProf = regisProf;
	}
	
	
}

