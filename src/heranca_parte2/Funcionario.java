package heranca_parte2;

public class Funcionario extends Pessoa{

	private String especialidade;
	private double salario;
	
	public void receberAumento(double aumento) {
		System.out.println("Estou recebendo um aumento! ");
		this.salario += aumento;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
