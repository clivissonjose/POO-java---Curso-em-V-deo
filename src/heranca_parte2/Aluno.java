package heranca_parte2;

public  class Aluno extends Pessoa {
	
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", curso=" + curso + "]";
	}

	private int matricula;
	private String curso;
	
	public  void pagarMensalidade() {
		System.out.println("Pagando a mensalidade do aluno.");
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
}
