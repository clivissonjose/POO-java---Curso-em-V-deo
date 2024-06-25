package heranca;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String sexo;
	
	public void fazerAniver() {
		setIdade(getIdade() + 1);
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
